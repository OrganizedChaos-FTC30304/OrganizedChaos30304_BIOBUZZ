package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ex1_1")
public class Exercise1_1 extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Coach Dave");
        //this is a comment

        /* This
        is
        also
        a
        comment
         */
    }

    @Override
    public void loop() {

    }
}
