package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Pickup {
    private DcMotor intakeMotor;

    public void init(HardwareMap hwMap) {
        // "intake_motor" must match the name configured on the Control/Expansion Hub
        intakeMotor = hwMap.get(DcMotor.class, "intake_motor");
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void setPower(double power) {
        intakeMotor.setPower(power);
    }

    public void intake() {
        setPower(1.0);
    }

    public void eject() {
        setPower(-1.0);
    }

    public void stop() {
        setPower(0.0);
    }
}