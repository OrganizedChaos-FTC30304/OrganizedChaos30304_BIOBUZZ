package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfElseOpMode_4_1 extends OpMode {
    @Override
    public void init() {
    }


    @Override
    public void loop() {
        double forwardSpeed = gamepad1.left_stick_y;

        if(!gamepad1.a) {
            forwardSpeed *= 0.5;
        }
        telemetry.addData("Forward speed:", forwardSpeed);
    }
}
// The code above will only run if the if statement is true. If the left stick y is less than 0, then it will execute.