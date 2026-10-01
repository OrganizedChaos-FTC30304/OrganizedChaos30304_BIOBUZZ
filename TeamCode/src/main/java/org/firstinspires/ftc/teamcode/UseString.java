package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class UseString extends OpMode {
    @Override
    public void init() {
        String myName = "Erini Serrano";

        int grade = 100;
        telemetry.addData(myName, grade);

        telemetry.addData("Hello", myName);
        //This is PascalCase
}


    @Override
    public void loop() {
        int x = 5;
        //x is visible here
        {
            int y = 4;
            //x and y are visible here since it is INSIDE the x '{}'
        }
        //Only x is visible here since it is now outside of the '{}' that y is in
    }


