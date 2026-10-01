package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class MathOpMode extends OpMode {
    @Override
    public void init() {
    }


    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y / 2.0;
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        telemetry.addData("Speed forward", speedForward);
        telemetry.addData("Right stick", gamepad1.right_stick_x);
                //In the line above the excercise said to show right stick, but I wasn't sure if it was right stick x or y.
        telemetry.addData("B button pressed", gamepad1.b);

        //Excercise 3 and 4 on 3.3:
        telemetry.addData("'Left joystick y' and 'right joystick y' are two different joysticks. This is left joystick y", gamepad1.left_stick_y);
        telemetry.addData("And this is right joystick y", gamepad1.right_stick_y);
        telemetry.addData("The sum of the left and right triggers are ", gamepad1.left_trigger + gamepad1.right_trigger);
    }


}
