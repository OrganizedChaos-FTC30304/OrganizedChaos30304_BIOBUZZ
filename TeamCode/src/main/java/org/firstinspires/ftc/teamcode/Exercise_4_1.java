package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_4_1 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double forwardSpeed = gamepad1.left_stick_y;

        if (!gamepad1.a) {
            forwardSpeed *= .5;
        }
        telemetry.addData("Forward Speed", forwardSpeed);
    }
}
