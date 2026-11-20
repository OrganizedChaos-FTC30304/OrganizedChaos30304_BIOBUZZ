package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class Drivetrain {
    //All of our motors:
    private DcMotor frontLeftMotor, frontRightMotor, backLeftMotor, backRightMotor;

    //The IMU:
    private IMU imu;

    public void init(HardwareMap hwMap) {
        //Mapping out the code to the control hub:
        frontLeftMotor = hwMap.get(DcMotor.class, "FrontLeftWheel");
        frontRightMotor = hwMap.get(DcMotor.class, "FrontRightWheel");
        backLeftMotor = hwMap.get(DcMotor.class, "BackLeftWheel");
        backRightMotor = hwMap.get(DcMotor.class, "BackRightWheel");
        imu = hwMap.get(IMU.class, "IMU");

        //Setting the mode:
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //Set zero power behavior:
        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Reversing ONLY the left motors:
        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotor.Direction.REVERSE);

        //Setting up the IMU
        //DESPERATELY need to fix this, HELP, fix direction of the control hub after 'LogoFacingDirection:'
        RevHubOrientationOnRobot RevOrientation = new RevHubOrientationOnRobot(RevHubOrientationOnRobot.LogoFacingDirection.UP, RevHubOrientationOnRobot.UsbFacingDirection.UP);
        imu.initialize(new IMU.Parameters(RevOrientation));
    }
}
