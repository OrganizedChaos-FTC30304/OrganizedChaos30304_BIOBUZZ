package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// Faustina's program!
@TeleOp
public class helloWorld extends OpMode {

    int myGrade = 85;

    @Override
    public void init() {
        telemetry.addData("Hello", "Faustina");
        String myName = "Frosty";
    }
    @Override
    public void loop() {
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("Difference", gamepad1.left_stick_y - gamepad1.right_stick_y);
        telemetry.addData("Sum", gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_y + gamepad1.right_stick_x);

        if(!gamepad1.a){
           double leftJoystick = gamepad1.left_stick_y * 0.5;
           telemetry.addData("Speed", "Forward");
        } else {
            double leftJoystick = gamepad1.left_stick_y * 1;
            telemetry.addData("Forward", "speed");
        }

        if(gamepad1.a){
            telemetry.addData("X", gamepad1.left_stick_y);
            telemetry.addData("Y", gamepad1.left_stick_x);
        }else{
            telemetry.addData("Y", gamepad1.left_stick_y);
            telemetry.addData("X", gamepad1.left_stick_x);
        }

        }

    }
}
