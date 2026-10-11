package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class chapter2 extends OpMode {
    @Override
    public void init() {

        int myGrade = 95;

        String myName = "Faustina Sanda";

        telemetry.addData("Hello", myName);
        telemetry.addData("My Grade", myGrade);

    }

    @Override
    public void loop() {

    }
}
