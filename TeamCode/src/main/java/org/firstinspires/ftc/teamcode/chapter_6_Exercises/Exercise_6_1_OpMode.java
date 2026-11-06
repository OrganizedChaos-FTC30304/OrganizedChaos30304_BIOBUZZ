package org.firstinspires.ftc.teamcode.chapter_6_Exercises;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp()
public class Exercise_6_1_OpMode extends OpMode {
     Exercise_6_1 board = new Exercise_6_1();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorString = "not pressed";
        if (board.isTouchSensorPressed()) {
            touchSensorString = "pressed";
        }
        telemetry.addData("Touch sensor", touchSensorString);
    }
}
