package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ex2_1")
public class Exercise2_1 extends OpMode {
    @Override
    public void init() {
            String myName = "Coach Dave";

            telemetry.addData("Hello", myName);

    }

    @Override
    public void loop() {

    }
}
