package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfElseIfOpMode extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        if (gamepad1.left_stick_y < -0.5) {

        }
    }

    @Autonomous()
    public static class HelloWorld extends OpMode {


        @Override
        public void init() {
            telemetry.addData("Hello","Leila");
        }
        //Caption is a label, a value is a number, word, and/or result.
        @Override
        public void loop() {

        }
    }
}