package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "HWC")
public class HelloWorldCommented extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "World");
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
