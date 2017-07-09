package org.usfirst.frc.team5962.robot.sensors;

import edu.wpi.first.wpilibj.AnalogInput;

public class RobotUltrasonicAnalog extends RobotUltrasonicBase{
	AnalogInput ultrasonic; // ultrasonic sensor
    //final double valueToInches = 0.125; //factor to convert sensor values to a distance in inches
    final double valueToInches = 2.3;
    public RobotUltrasonicAnalog(int channel) {
		ultrasonic = new AnalogInput(channel);   

		//SmartDashboard.putBoolean("Enable Analog Ultrasonic Range Finder", true);
   }
    public double getRange() {
    	return ultrasonic.getVoltage()*valueToInches; //sensor returns a value from 0-4095 that is scaled to inches 
    }
	
	public boolean isEnabled() {
		return true;
	}
}
