package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class MathOpMode_3_1 extends OpMode {
    @Override
    public void init() {
    }


    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Speed forward", speedForward);
        telemetry.addData("Right stick", gamepad1.right_stick_x);
    }

}
