package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class IfOpMode2 extends OpMode {
    @Override
    public void init() {
    }


    @Override
    public void loop() {
        if(gamepad1.a) {
            telemetry.addData("A Button", "pressed.");
        }
    }
}
// The code above will only run if the if statement is true. If the left stick y is less than 0, then it will execute.