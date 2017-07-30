package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.commands.Item;
import org.usfirst.frc.team5962.robot.commands.RunAutonomous;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Autonomous extends Subsystem {

	private RunAutonomous runAuto = (RunAutonomous) Robot.autonomousCommand;

	public enum sensorType {
		encoder, ultrasonic, gyro, time
	};
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void forwardWithEncoders(double speed, int sensorValue) {
		Item item = new Item(Math.abs(speed), 0, sensorType.encoder, sensorValue);
		runAuto.addCommand(item);
	}
	
	public void forwardWithUltrasonic(double speed, int sensorValue) {
		Item item = new Item(Math.abs(speed), 0, sensorType.ultrasonic, sensorValue);
		runAuto.addCommand(item);
	}

	public void turnLeft(double speed, int sensorValue) {
		Item item = new Item(Math.abs(speed), 1, sensorType.gyro, sensorValue, true);
		runAuto.addCommand(item);
	}
	
	public void turnRight(double speed, int sensorValue) {
		Item item = new Item(Math.abs(speed), 1, sensorType.gyro, sensorValue, false);
		runAuto.addCommand(item);
	}

	public void backwardsWithEncoders(double speed, int sensorValue) {
		Item item = new Item(-Math.abs(speed), 0, sensorType.encoder, sensorValue);
		runAuto.addCommand(item);
	}

	public void stop(int time) {
		Item item = new Item(0, 0, sensorType.time, time);
		runAuto.addCommand(item);
	}
}