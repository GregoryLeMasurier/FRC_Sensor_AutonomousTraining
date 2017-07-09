package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import org.usfirst.frc.team5962.robot.commands.Item;
import org.usfirst.frc.team5962.robot.commands.RunAutonomous;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Autonomous extends Subsystem {
	
	private RunAutonomous runAuto = (RunAutonomous) Robot.autonomousCommand;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void forward(double speed, int time) {
		Item item = new Item(speed, time, 0);
		runAuto.addCommand(item);
	}

	public void turnLeft(double speed, int time) {
		Item item = new Item(Math.abs(speed), time, 1);
		runAuto.addCommand(item);
	}

	public void turnRight(double speed, int time) {
		Item item = new Item(Math.abs(speed), time, -1);
		runAuto.addCommand(item);
	}

	public void backwards(double speed, int time) {
		Item item = new Item(-speed, time, 0);
		runAuto.addCommand(item);
	}

	public void stop(int time) {
		Item item = new Item(0, time, 0);
		runAuto.addCommand(item);
	}

	public void driveBase(double power, int time, double turningValue, long startSystemTime) {
		long currentTime = System.currentTimeMillis();
		if (currentTime < (startSystemTime + (time / 1000))) {
			RobotMap.myRobot.drive(-power, turningValue);
		} else {
			RobotMap.myRobot.drive(0, 0);
		}
	}
}