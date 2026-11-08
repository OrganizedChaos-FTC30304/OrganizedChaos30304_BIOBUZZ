package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


//I think I need this line to run 'isTouchSensorPressed' in this opmode:
import org.firstinspires.ftc.teamcode.mechanisims.ProgrammingBoard2;

@TeleOp
public class TouchSensorOpMode2_1 extends OpMode {
    ProgrammingBoard2 board = new ProgrammingBoard2();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    //Add on to the original 'TouchSensorOpMode2' for exercise 6.1, question 1:

    @Override
    public void loop() {
        telemetry.addData("Touch pressed", board.isTouchSensorPressed());
        telemetry.addData("Touch sensor is released:", !board.isTouchSensorPressed());
    }
}
