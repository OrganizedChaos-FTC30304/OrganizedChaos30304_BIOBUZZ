package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_2_2 extends OpMode {
    @Override
    public void init() {
        String myName = "Leila Chandrasekaran";

        int grade = 8;

        telemetry.addData("grade",grade);
        telemetry.addData("Hello", myName);


    }
    @Override
    public void loop() {

    }
}
