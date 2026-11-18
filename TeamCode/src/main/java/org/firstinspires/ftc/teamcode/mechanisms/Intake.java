package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private DcMotor intakeMotor;

    public void init(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotor.class, "IntakeWheels");
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setPower(double speed) {
        intakeMotor.setPower(speed);
    }

    public void intake() {
        setPower(0.5);
    }

    public void reverse() {
        setPower(-0.5);
    }

    public void stop() {
        setPower(0);
    }
}
