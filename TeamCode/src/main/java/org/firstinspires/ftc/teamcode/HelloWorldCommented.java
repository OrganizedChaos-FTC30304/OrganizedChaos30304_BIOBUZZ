package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorldCommented extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","World");
    }

    //Caption is the label and value can be a number or a word, it can be anything/an output

    @Override
    public void loop() {
        //Left blank on purpose
    }
}
