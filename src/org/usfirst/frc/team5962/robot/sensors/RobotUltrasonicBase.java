package org.usfirst.frc.team5962.robot.sensors;


public abstract class RobotUltrasonicBase {
	
	public static final int DEFAULT_HOLD_DISTANCE = 12;
	public static final double DEFAULT_SPEED_CONSTANT = 0.05;
	public static final String DEFAULT_ENABLE_KEY = "Enable Ultrasonic Range Finder";
	
	//distance in inches the robot wants to stay from an object
    int holdDistance = DEFAULT_HOLD_DISTANCE; 
    
    //proportional speed constant
    double speedConstant = DEFAULT_SPEED_CONSTANT; 
    
    String enableKey = "";
	
    public abstract double getRange();
    
    /**
     * Tells the robot to drive to a set distance (in inches) from an object using proportional control.
     */
	public double getCurrentSpeed() {
		double currentDistance; //distance measured from the ultrasonic sensor values
		double currentSpeed; //speed to set the drive train motors

		currentDistance = getRange();
		currentSpeed = (holdDistance - currentDistance)*speedConstant; //convert distance error to a motor speed
		return currentSpeed;
	}
	
	public void setHoldDistance(int holdDistance) {
		this.holdDistance = holdDistance;
	}
	
	public int getHoldDistance() {
		return holdDistance;
	}
	
	public void setSpeedConstant(double speedConstant) {
		this.speedConstant = speedConstant;
	}
	
	public double getSpeedConstant() {
		return speedConstant;
	}
	
	public abstract boolean isEnabled();

	
}
