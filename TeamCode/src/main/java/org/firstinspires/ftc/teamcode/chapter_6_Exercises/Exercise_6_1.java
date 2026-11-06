package org.firstinspires.ftc.teamcode.chapter_6_Exercises;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Exercise_6_1 {
    private DigitalChannel touchSensor;

    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

        public boolean isTouchSensorPressed() {
            return !touchSensor.getState();
        }

        public boolean isTouchSensorReleased() {
            return touchSensor.getState();
        }
 }
