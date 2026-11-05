package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_3_2 extends OpMode {
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addData("B-Button",gamepad1.b);
    }
}
