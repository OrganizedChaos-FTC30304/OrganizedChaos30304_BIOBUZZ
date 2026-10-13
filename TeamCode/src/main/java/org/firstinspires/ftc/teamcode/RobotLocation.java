package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class RobotLocation extends OpMode {
    @Override
    double angle;
    double x;

    public RobotLocation(double angle) {
        this.angle = angle;
        this.x = 0.0; // Confirms value
    }

    public double getHeading() {
        double angle = this.angle;
        while(angle > 180) {
            angle -= 360;
        }
        while(angle < -180) {
            angle += 360;
            // This is stating that the variable angle will go through changes under certain conditions
        }
        return angle;
    }

    @Override public String toString() {
        return "RobotLocation: angle (" + angle + ")";
    }

    public void turn(double angleChange) {
        angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

    // These next few lines are excercise 5.6 (b)
/
    public void loop() {
        if (gamepad1.dpad_left) {
            robotLocation.changeX(-0.1);
        } else if (gamepad1.dpad_right) {
            robotLocation.changeX(0.1);
        }
    }

    telemetry.addData("Robot X position", robotLocation.getX());
    telemetry.update();
}