package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ClassMethodOpmode extends OpMode{
    @Override
    public void init() {
    }

    double sqaureInputWithSign(double input){
        double output = input * input;
        if(input < 0){
            output = output * -1;
        }

        return output;
    }

    @Override
    public void loop() {
        double leftAmount = gamepad1.left_stick_x;
        double fwdAmount =  -gamepad1.left_stick_y;

        telemetry.addData("Befor X", leftAmount);
        telemetry.addData("Before Y", fwdAmount);

        leftAmount = sqaureInputWithSign(leftAmount);
        fwdAmount = sqaureInputWithSign(fwdAmount);

        telemetry.addData("After X", leftAmount);
        telemetry.addData("After Y", fwdAmount);

    }
}
