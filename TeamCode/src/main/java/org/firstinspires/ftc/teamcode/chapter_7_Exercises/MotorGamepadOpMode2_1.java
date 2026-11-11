package org.firstinspires.ftc.teamcode.chapter_7_Exercises;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.chapter_7_Exercises.ProgrammingBoard4_1;

@TeleOp
public class MotorGamepadOpMode2_1 extends OpMode {
    org.firstinspires.ftc.teamcode.chapter_7_Exercises.ProgrammingBoard4_1 board = new org.firstinspires.ftc.teamcode.chapter_7_Exercises.ProgrammingBoard4_1();
    @Override
    public void init() {
            board.init(hardwareMap);
        }
        @Override
    public void loop(){
        double motorSpeed = gamepad1.left_stick_y;

        board.setMotorSpeed(motorSpeed);

        if(gamepad1.a) {
            board.setBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        else if(gamepad1.b) {
            board.setBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Motor rotations", board.getMotorRotations());
        }
    }
