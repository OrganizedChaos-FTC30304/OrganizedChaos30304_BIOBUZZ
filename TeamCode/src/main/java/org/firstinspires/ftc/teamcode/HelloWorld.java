package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp()
public class HelloWorld extends OpMode {


    @Override
    public void init() {
    telemetry.addData("Hello","World");
    }
//Caption is a label, a value is a number, word, and/or result.
    @Override
    public void loop() {

    }
}
