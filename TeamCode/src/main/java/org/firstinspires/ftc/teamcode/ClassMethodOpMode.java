package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp
public class ClassMethodOpMode extends OpMode {

    //init is the starting code; loop is the constant updates
    @Override
    public void init() {
    }

    double squareInputWithSign(double input) {
        double output = input * input;
        if (input < 0) {
            output = output * -1;
        }
        return output;
    }
    /*
    This code is giving you the result of your input squared (multiplied
    by itself), and if input is less than zero, you must multiply it
    by negative one.
     */
    @Override
    public void loop() {
        double leftAmount = gamepad1.left_stick_x;
        double fwdAmount = -gamepad1.left_stick_y;

        telemetry.addData("Before X", leftAmount);
        telemetry.addData("Before Y", fwdAmount);

        leftAmount = squareInputWithSign(leftAmount);
        fwdAmount = squareInputWithSign(fwdAmount);

        telemetry.addData("After X", leftAmount);
        telemetry.addData("After Y", fwdAmount);
    }
}
