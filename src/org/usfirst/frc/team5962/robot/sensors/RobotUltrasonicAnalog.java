package org.usfirst.frc.team5962.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;

public class RobotUltrasonicAnalog extends RobotUltrasonicBase {
	AnalogInput ultrasonic;
	final double valueToInches = 2.3;

	public RobotUltrasonicAnalog(int channel) {
		ultrasonic = new AnalogInput(channel);
	}

	public double getRange() {
		return ultrasonic.getVoltage() * valueToInches;
	}

	public boolean isEnabled() {
		return true;
	}
}
