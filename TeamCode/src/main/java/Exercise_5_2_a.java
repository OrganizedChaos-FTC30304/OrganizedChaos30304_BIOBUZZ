public class Exercise_5_2_a {
    double angle;

    public Exercise_5_2_a(double angle) {
        this.angle = angle;
    }
    /*
     "This" is a statement used to show that variables with the same name have different values.
     */

    public double getHeading() {
        double angle = this.angle;
        while(angle < 180) {
            angle -= 360;
        }
        while(angle < -180) {
            angle += 360;
        }
        return angle;

        //This code is dedicated to returning the heading value if it isn't between -180 and 180
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

    private double x;

    double getX() {
        return x;
    }

    public void changeX(double change) {
        x += change;
    }
    public void setX(double x) {
        this.x = x;
    }
}
