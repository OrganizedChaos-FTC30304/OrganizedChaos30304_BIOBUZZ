public class Exercise_5_1 {
    double angle;

    public Exercise_5_1(double angle) {
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
    /*
    "String" is a name for this chunk of code, while "toString()" is a function.

    public void  turn(double angleChange) {
        angle += angleChange;
    }

    /*
    "+=" adds two (maybe more?) numbers and keeps the product. In this example,
    the angle (likely in degrees) is added to the amount of change in the angles.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    double getAngle() {
        return angle;
    }
}
