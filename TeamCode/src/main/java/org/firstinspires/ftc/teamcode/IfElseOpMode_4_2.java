package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfElseOpMode_4_2 extends OpMode {
    @Override
    public void init() {
    }


    @Override
    // Crazy mode
    public void loop() {
        double crazySpeedY = gamepad1.left_stick_y;
        double crazySpeedX = gamepad1.left_stick_x;

        if(gamepad1.a) {
            crazySpeedY = gamepad1.left_stick_x;
            crazySpeedX = gamepad1.left_stick_y;
        }
        telemetry.addData("X value", crazySpeedX);
        telemetry.addData("Y Value", crazySpeedY);
    }
}
// The code above will only run if the if statement is true. If the left stick y is less than 0, then it will execute.