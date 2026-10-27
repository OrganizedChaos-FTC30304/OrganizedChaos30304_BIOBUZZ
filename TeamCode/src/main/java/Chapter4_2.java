package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp



public class Chapter4_2 extends OpMode {


    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double Y = gamepad1.left_stick_y;
        double X = gamepad1.left_stick_x;


        if(gamepad1.a) {
            Y = gamepad1.left_stick_x;
            X = gamepad1.left_stick_y;
        }

        telemetry.addData("Y speed:", Y);
        telemetry.addData("X speed", X);

    }
}
