package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisims.ProgrammingBoard4;

public class MotorOpMode2 extends OpMode {
    ProgrammingBoard4 board = new ProgrammingBoard4();

    @Override
    public void init() {
        board.init(hardwareMap);
    }
    @Override
    public void loop() {
        board.setMotorSpeed(0.5);
        telemetry.addData("Motor rotations", board.getMotorRotations());
    }
}