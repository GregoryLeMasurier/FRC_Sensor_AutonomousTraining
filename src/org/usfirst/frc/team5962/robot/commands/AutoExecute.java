package org.usfirst.frc.team5962.robot.commands;

import org.usfirst.frc.team5962.robot.RobotMap;
import org.usfirst.frc.team5962.robot.subsystems.Autonomous;

public class AutoExecute {

	public void init() {
		/*
		 * To setup your left drive type:
		 * RobotMap.set_left_drive(PWM_CHANNEL_A, PWM_CHANNEL_B);
		 * Where PWM_CHANNEL_A and B are integers.
		 * If you do not use this command then the robot will
		 * use PWM channel 0 and 1 for the left drive.
		 * 
		 * To setup your right drive type:
		 * RobotMap.set_right_drive(PWM_CHANNEL_A, PWM_CHANNEL_B);
		 * Where PWM_CHANNEL_A and B are integers.
		 * If you do not use this command then the robot will
		 * use PWM channel 6 and 7 for the right drive.
		 * 
		 * If your left drive needs to be inverted then type:
		 * RobotMap.invert_left_drive(isInverted);
		 * isInverted is a boolean, false by default.
		 * 
		 * If your right drive needs to be inverted then type:
		 * RobotMap.invert_right_drive(isInverted);
		 * isInverted is a boolean, false by default.
		 */
		
	}
	
	public void execute() {
		Autonomous driveRobot = new Autonomous();
		/*
		 * If you want to move the robot forwards for a set distance type: 
		 * driveRobot.forwardWithEncoders(speed, sensorValue); 
		 * Speed is any number from 0 to 1 and sensorValue is the maximum 
		 * value you want the sensor to get to while moving forward.
		 * 
		 * If you want to move the robot forwards until it is a specific distance from a wall type: 
		 * driveRobot.forwardWithUltrasonic(speed, sensorValue); 
		 * Speed is any number from 0 to 1 and sensorValue is the minimum 
		 * value you want the sensor to get to while moving forward.
		 * 
		 * If you want to move the robot backwards type: 
		 * driveRobot.backwards(speed, sensorValue); 
		 * Speed is any number from 0 to 1 and sensorValue is the maximum 
		 * value you want the sensor to get to while moving backwards.
		 * 
		 * If you want to turn the robot to the right type: 
		 * driveRobot.turn(speed, sensorValue); 
		 * Speed is any number from 0 to 1 (absolute value is taken) and sensorValue 
		 * is the gyroAngle that you want to turn to.
		 * 
		 * If you want to stop the robot type: 
		 * driveRobot.stop(time); 
		 * Time is the time in seconds that you would like to stop.
		 * 
		 * Enter your code below:
		 */
		
	}
}