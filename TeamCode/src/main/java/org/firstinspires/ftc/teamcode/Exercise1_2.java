package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous(name = "Ex1_2")
public class Exercise1_2 extends OpMode {
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
