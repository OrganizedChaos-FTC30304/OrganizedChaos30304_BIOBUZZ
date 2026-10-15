package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorldCommented_1_1 extends OpMode {
    @Override

    public void init() {
        String helloMyName = Erini;
        telemetry.addData("Hello",helloMyName);
    }

    //Caption is the label and value can be a number or a word, it can be anything/an output

    @Override
    public void loop() {
        //Left blank on purpose
    }
}
