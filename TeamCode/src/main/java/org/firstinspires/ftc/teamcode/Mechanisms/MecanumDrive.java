package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class MecanumDrive {
    private DcMotor frontRight;
    private DcMotor backRight;
    private DcMotor frontLeft;
    private DcMotor backLeft;
    private IMU imu;

    public void init(HardwareMap hwMap) {
        frontRight = hwMap.get(DcMotor.class, "rightFrontDriveMotor");
        frontLeft = hwMap.get(DcMotor.class, "leftFrontDriveMotor");
        backLeft = hwMap.get(DcMotor.class, "leftRearDriveMotor");
        backRight = hwMap.get(DcMotor.class, "rightRearDriveMotor");

        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        imu = hwMap.get(IMU.class, "imu");
        RevHubOrientationOnRobot revOrientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.RIGHT);
        imu.initialize(new IMU.Parameters(revOrientation));
    }

    public void resetYaw() {
        imu.resetYaw();
    }

    public double getHeading(AngleUnit angleUnit) {
        return imu.getRobotYawPitchRollAngles().getYaw(angleUnit);
    }

    private void setPowers(double frontLeftPower, double frontRightPower, double backLeftPower, double backRightPower) {
        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(frontLeftPower));
        maxPower = Math.max(maxPower, Math.abs(backLeftPower));
        maxPower = Math.max(maxPower, Math.abs(frontRightPower));
        maxPower = Math.max(maxPower, Math.abs(backRightPower));

        frontLeft.setPower(maxSpeed * (frontLeftPower / maxPower));
        frontRight.setPower(maxSpeed * (frontRightPower / maxPower));
        backLeft.setPower(maxSpeed * (backLeftPower / maxPower));
        backRight.setPower(maxSpeed * (backRightPower / maxPower));
    }

    public void driveRobotRelative(double forward, double right, double rotate) {
        double frontLeftPower = forward + right + rotate;
        double frontRightPower = forward - right - rotate;
        double backRightPower = forward + right - rotate;
        double backLeftPower = forward - right + rotate;

        setPowers(frontLeftPower, frontRightPower, backLeftPower, backRightPower);
    }

    public void driveFieldRelative(double forward, double right, double rotate) {
        double robotAngle = getHeading(AngleUnit.RADIANS);

        // Convert joystick inputs to polar coordinates
        double theta = Math.atan2(forward, right);
        double r = Math.hypot(right, forward);

        // Rotate angle by the robot's current heading
        theta = AngleUnit.normalizeRadians(theta - robotAngle);

        // Convert back to Cartesian coordinates
        double newForward = r * Math.sin(theta);
        double newRight = r * Math.cos(theta);

        driveRobotRelative(newForward, newRight, rotate);
    }
}
