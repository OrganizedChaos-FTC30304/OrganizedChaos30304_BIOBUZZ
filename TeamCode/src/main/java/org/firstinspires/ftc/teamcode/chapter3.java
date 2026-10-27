package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class chapter3  extends OpMode{
    @Override
    public void init() {

    }

    @Override
    public void loop() {

        //double speedForward = -gamepad1.left_stick_y / 2.0;

        telemetry.addData("Right stick x", gamepad1.right_stick_x);
        telemetry.addData("Right stick y", gamepad1.right_stick_y);

        telemetry.addData("b pressed?", gamepad1.b);

        telemetry.addData("Left and Right joystick difference", gamepad1.left_stick_y - gamepad1.right_stick_y);

        telemetry.addData("Sum", gamepad1.left_trigger + gamepad1.right_trigger);

    }
}
