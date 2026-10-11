package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//The best branch

@Autonomous
public class HelloWorld2 extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello", "Faustina");
    }

    @Override
    public void loop() {

    }
}
