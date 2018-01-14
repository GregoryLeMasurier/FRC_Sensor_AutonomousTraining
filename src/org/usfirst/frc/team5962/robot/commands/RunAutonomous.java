package org.usfirst.frc.team5962.robot.commands;

import java.util.ArrayList;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;

public class RunAutonomous extends Command {

	private static ArrayList<Item> commands = new ArrayList<Item>();
	private int index;

	protected void initialize() {
		index = 0;
		Robot.gyro.resetGyro();
		RobotMap.myRobot.setMaxOutput(0.5);
		Robot.auto_execute.execute();
	}

	protected void execute() {
		if (index < commands.size()) {
			Item item = commands.get(index);
			if (item.isComplete()) {
				RobotMap.myRobot.drive(0, 0);
				index++;
			} else {
				item.execute();
			}
		} else {
			RobotMap.myRobot.drive(0, 0);
		}
	}

	public void addCommand(Item item) {
		commands.add(item);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}