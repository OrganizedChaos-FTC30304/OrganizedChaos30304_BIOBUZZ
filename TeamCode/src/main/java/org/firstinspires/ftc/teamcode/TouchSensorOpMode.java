package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisims.ProgrammingBoard1;
/*
Using the line above instead of "import org.firstinspires.ftc.teamcode.mechanisms.ProgrammingBoard1;" because mechinisims
has an error for some reason
 */

@TeleOp
public class TouchSensorOpMode extends OpMode {
    ProgrammingBoard1 board = new ProgrammingBoard1();
    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        telemetry.addData("Touch sensor", board.getTouchSensorState());
    }
}
