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

	public void forward(double speed, sensorType sensorName, int sensorValue) {
		Item item = new Item(Math.abs(speed), 0, sensorName, sensorValue);
		runAuto.addCommand(item);
	}

	public void turn(double speed, int sensorValue) {
		Item item = new Item(Math.abs(speed), 1, sensorType.gyro, sensorValue);
		runAuto.addCommand(item);
	}

	public void backwards(double speed, sensorType sensorName, int sensorValue) {
		Item item = new Item(-Math.abs(speed), 0, sensorName, sensorValue);
		runAuto.addCommand(item);
	}

	public void stop(int time) {
		Item item = new Item(0, 0, sensorType.time, time);
		runAuto.addCommand(item);
	}
}