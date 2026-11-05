package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ClassMemberOpMode extends OpMode {
    boolean initDone;

    //initDone is a boolean, meaning it's true/false

    @Override
    public void init() {
        telemetry.addData("init Done", initDone);
        initDone = true;
    }

    //the finished product is "init Done, true"

    @Override
    public void loop() {
        telemetry.addData("init Done", initDone);
     }
    }
    //It's reporting the value of init Done thirty times a second


