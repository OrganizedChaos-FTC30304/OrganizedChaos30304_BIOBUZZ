package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class RobotLocation_5_2 {

    double angle;
    double x;

    public RobotLocation_5_2(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        double angle = this.angle;
        while(angle > 180) {
            angle -= 360;
        }
        while(angle < -180) {
            angle += 360;
        }
        return angle;
    }

    @Override

    public String toString() {

        return "RobotLocation: angle (" + angle + ")";
    }

    public void turn(double angleChange) {

        angle += angleChange;
    }
    public void setAngle(double angle) {

        this.angle = angle;
    }
    public double getAngle() {
        return angle;
    }
    public void getAngle(double x) {
    }
    public void getX(double x) {
    }
    public void changeX(double change) {
    }
    public void setX(double x) {
        this.x = x;
}