package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfOpMode2 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if(gamepad1.a) {
            telemetry.addData("A Button", "pressed");
        }
    }

    @TeleOp()
    public static class HelloWorldCommented extends OpMode {
        /**
         * This is called when the driver presses INIT
         */
        @Override
        public void init() {
            //this sends to the driver station
        telemetry.addData("Hello","World");
        }

        /**
         * This is called repeatedly while OpMode is playing
         */
    //Caption is a label, a value is a number, word, and/or result.
        @Override
        public void loop() {
            // intentionally left blank
        }
    }
}
