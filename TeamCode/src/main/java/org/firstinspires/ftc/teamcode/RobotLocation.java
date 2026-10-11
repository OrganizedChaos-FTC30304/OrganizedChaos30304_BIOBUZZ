package org.firstinspires.ftc.teamcode;

public class RobotLocation {
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
    //These next few lines are the excercise point in 5.6 (a)
    public void getAngle(double x) {
    }
    public void getX(double x) {
    }
    public void changeX(double change) {
    }
    public void setX(double x) {
        this.x = x;
    }

    // These next few lines are excercise 5.6 (b)

    
}