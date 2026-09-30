package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Ex3_1")
public class Exercise3_3 extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("Difference Left Y & Right Y", gamepad1.left_stick_y - gamepad1.right_stick_y);

    }
}
