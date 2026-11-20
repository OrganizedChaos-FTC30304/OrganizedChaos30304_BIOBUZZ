package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {
    private DcMotor shooterMotor;

    public void init(HardwareMap hwMap) {
        shooterMotor = hwMap.get(DcMotor.class, "ShooterWheel");
        shooterMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        shooterMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setPower(double speed) {
        shooterMotor.setPower(speed);
    }

    public void forwardSpin() {
        shooterMotor.setPower(0.5);
    }

    public void backwardSpin() {
        shooterMotor.setPower(-0.5);
    }

    public void stopSpin() {
        shooterMotor.setPower(0);
    }
}
