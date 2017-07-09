package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;

public class Item {

	public enum Direction {
		forwards, backwards, turnLeft, turnRight, stop
	};

	private double speed;
	private int time;
	private boolean complete = true;
	private long startSystemTime = -1;
	private double turningValue;
	private double adjustedTurningValue;

	public Item(double speed, int time, double turningValue) {
		complete = false;
		this.speed = speed;
		this.time = time;
		this.turningValue = turningValue;
		this.adjustedTurningValue = turningValue;
	}

	public boolean isComplete() {

		return complete;
	}
	
	private double getGyroAngle() {
		double angle = Robot.gyro.getGyroAngle();
		return angle;
	}

	public void execute() {
		if (complete) {
			RobotMap.myRobot.drive(0, 0);
			return;
		}
		if (startSystemTime == -1) {
			RobotMap.myRobot.drive(0, 0);
			startSystemTime = System.currentTimeMillis();
		}
		long currentTime = System.currentTimeMillis();
		if (currentTime < (startSystemTime + (time * 1000))) {
			//means forwards
			if(speed > 0 && turningValue == 0){
				double angle = getGyroAngle();
				adjustedTurningValue = 0.03 * angle;
			}
			//means backwards
			if(speed < 0 && turningValue == 0){
				double angle = getGyroAngle();
				adjustedTurningValue = 0.03 * -angle;
			}
			RobotMap.myRobot.drive(-speed, adjustedTurningValue);
		} else {
			RobotMap.myRobot.drive(0, 0);
			complete = true;
		}
	}
}