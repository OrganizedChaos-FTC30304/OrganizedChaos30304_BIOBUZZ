package org.firstinspires.ftc.teamcode;

public class Robotlocation {
    double angle;

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
        return "RobotLocation: angle (" + angle + ")"
    }

    public void turn(double angleChange) {
        angle += angleChange;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }
}