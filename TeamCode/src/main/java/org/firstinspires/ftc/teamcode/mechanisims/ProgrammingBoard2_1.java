package org.firstinspires.ftc.teamcode.mechanisims;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProgrammingBoard2_1 {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean isTouchSensorPressed() {
        return !touchSensor.getState();
    }


    //6.5 Exercise, question 1:

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }
}
