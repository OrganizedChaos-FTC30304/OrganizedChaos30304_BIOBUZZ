package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class Exercise_2_1 extends OpMode {
    @Override
    public void init() {
        String myName = "Leila Chandrasekaran";

        telemetry.addData("Hello", myName);
    }
    @Override
    public void loop() {

    }
}
