package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.subsystems.Autonomous;

public class AutoExecute {
	public static Autonomous driveRobot = new Autonomous();

	public void init() {
		/*
		 * If you want to move the robot forwards type: driveRobot.forward(speed,
		 * sensorName, sensorValue); Speed is any number from -1 to 1 sensorName is the
		 * name of the sensor (encoder or ultrasonic) that you want to use. sensorValue
		 * is the maximum value you want the sensor to get to while moving forward.
		 * 
		 * If you want to move the robot backwards type: driveRobot.backwards(speed,
		 * sensorName, sensorValue); Speed is any number from -1 to 1 sensorName is the
		 * name of the sensor (encoder or ultrasonic) that you want to use. sensorValue
		 * is the maximum value you want the sensor to get to while moving backwards.
		 * 
		 * If you want to turn the robot to the right type: driveRobot.turn(speed,
		 * sensorValue); Speed is any number from 0 to 1 (absolute value is taken) and
		 * sensorValue is the gyroAngle that you want to turn to.
		 * 
		 * If you want to stop the robot type: driveRobot.stop(time); Time is the time
		 * in seconds that you would like to move forwards.
		 * 
		 * Enter your code below:
		 */
		driveRobot.turnLeft(0.5,90);
		driveRobot.stop(1);
		driveRobot.forwardWithEncoders(1, 100);
		driveRobot.stop(1);
		//TODO: FIX TURNING NOT WORKING
		
		driveRobot.turnRight(0.5,90);
		driveRobot.stop(1);
		driveRobot.backwardsWithEncoders(-1, 100);
		driveRobot.stop(1);
		driveRobot.forwardWithUltrasonic(1, 5);
		driveRobot.stop(100);
	}
}