package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_4_2 extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double xSpeed = gamepad1.left_stick_x;
        double ySpeed = gamepad1.left_stick_y;

        if(gamepad1.a){
            xSpeed = gamepad1.left_stick_y;
            ySpeed = gamepad1.left_stick_x;
        }



            telemetry.addData("X Value", xSpeed);
            telemetry.addData("Y Value", ySpeed);
        }
    }




