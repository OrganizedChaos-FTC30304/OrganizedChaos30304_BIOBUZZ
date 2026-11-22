package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Passthrough {
    private CRServo leftServo;
    private CRServo rightServo;

    public void init(HardwareMap hwMap) {
        leftServo = hwMap.get(CRServo.class, "BottomPassthrough");
        rightServo = hwMap.get(CRServo.class, "TopPassthrough");


        // Ensure servos are stopped initially
        stop();
    }

    public void setPower(double power) {
        leftServo.setPower(power);
        rightServo.setPower(power);
    }

    public void spinForward() {
        setPower(1.0);
    }

    public void spinReverse() {
        setPower(-1.0);
    }

    public void stop() {
        setPower(0.0);
    }
}