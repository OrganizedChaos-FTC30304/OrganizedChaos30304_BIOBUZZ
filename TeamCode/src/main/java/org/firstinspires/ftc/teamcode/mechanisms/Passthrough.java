package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Passthrough {
    private CRServo upPassServo;
    private CRServo downPassServo;

    public void init(HardwareMap hwMap) {
        upPassServo = hwMap.get(CRServo.class, "TopPassthrough");
        downPassServo = hwMap.get(CRServo.class, "BottomPassthrough");
    }

    public void setPower(double speed) {
        upPassServo.setPower(speed);
        downPassServo.setPower(speed);
    }

    public void forwardBelt() {
        upPassServo.setPower(1.0);
        downPassServo.setPower(-1.0);
    }

    public void reverseBelt() {
        upPassServo.setPower(-1.0);
        downPassServo.setPower(1.0);
    }

    public void stopBelt() {
        upPassServo.setPower(0.0);
        downPassServo.setPower(0.0);
    }

}
