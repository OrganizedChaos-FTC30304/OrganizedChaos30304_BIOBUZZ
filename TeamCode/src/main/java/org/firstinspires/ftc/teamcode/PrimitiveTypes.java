package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class PrimitiveTypes extends OpMode {
    @Override
    public void init() {
        int teamNumber = 30304;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;
//Next line just is saying 'Print the team number: (here is the variable for the team number that was input.' And same thing so on...
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);
}

    //Caption is the label and value can be a number or a word, it can be anything/an output

    @Override
    public void loop() {
        //Left blank on purpose
    }
}


