package org.firstinspires.ftc.teamcode.OpModes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.MecanumDrive;
import org.firstinspires.ftc.teamcode.Mechanisms.Passthrough;
import org.firstinspires.ftc.teamcode.Mechanisms.Pickup;

@TeleOp
public class TestTeleOp extends OpMode {
    private Pickup pickup = new Pickup();
    private Passthrough passthrough = new Passthrough();

    private MecanumDrive drive = new MecanumDrive();

    @Override
    public void init() {
        pickup.init(hardwareMap);
        passthrough.init(hardwareMap);
        drive.init(hardwareMap);

        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        // --- Pickup Controls ---
        if (gamepad2.right_trigger > 0.1) {
            pickup.setPower(gamepad2.right_trigger);
        } else if (gamepad2.left_trigger > 0.1) {
            pickup.setPower(-gamepad2.left_trigger);
        } else {
            pickup.stop();
        }

        // --- Passthrough Controls (Continuous Rotation Servos) ---
        if (gamepad2.a) {
            passthrough.spinForward();
        } else if (gamepad2.b) {
            passthrough.spinReverse();
        } else {
            passthrough.stop();
        }

        // --- Mecanum Drive Controls ---

        if (gamepad1.a) {
            drive.resetYaw();
        }

        double forward = gamepad1.left_stick_y;
        double right = -gamepad1.left_stick_x;
        double rotate = -gamepad1.right_stick_x;

        drive.driveFieldRelative(forward, right, rotate);

        }
}
