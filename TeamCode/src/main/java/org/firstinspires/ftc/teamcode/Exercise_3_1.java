package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_3_1 extends OpMode {
    public void init() {
    }

    @Override
    public void loop() {
        telemetry.addData("Right stick x", gamepad1.right_stick_x);
        telemetry.addData("Right stick y",gamepad1.right_stick_y);

    }
}
