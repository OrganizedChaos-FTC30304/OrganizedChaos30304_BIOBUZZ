package org.firstinspires.ftc.teamcode.OpModes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Passthrough;
import org.firstinspires.ftc.teamcode.Mechanisms.Pickup;

@TeleOp
public class TestTeleOp extends OpMode {
    private Pickup pickup = new Pickup();
    private Passthrough passthrough = new Passthrough();

    @Override
    public void init() {
        pickup.init(hardwareMap);
        passthrough.init(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        // --- Pickup Controls ---
        if (gamepad1.right_trigger > 0.1) {
            pickup.setPower(gamepad1.right_trigger);
        } else if (gamepad1.left_trigger > 0.1) {
            pickup.setPower(-gamepad1.left_trigger);
        } else {
            pickup.stop();
        }

        // --- Passthrough Controls (Continuous Rotation Servos) ---
        if (gamepad1.a) {
            passthrough.spinForward();
        } else if (gamepad1.b) {
            passthrough.spinReverse();
        } else {
            passthrough.stop();
        }

        // --- Telemetry ---
        telemetry.addData("Pickup Power", gamepad1.right_trigger - gamepad1.left_trigger);
        telemetry.addData("Passthrough Direction", gamepad1.a ? "FORWARD" : gamepad1.b ? "REVERSE" : "STOPPED");
    }
}
