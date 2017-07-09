package org.usfirst.frc.team5962.robot.subsystems;

import org.usfirst.frc.team5962.robot.Robot;
import org.usfirst.frc.team5962.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class JoystickThrottle extends Subsystem {

	public static void Speed() {
		double throttle = (((Robot.oi.joystickRight.getThrottle() * -1) + 2) / 3);
		SmartDashboard.putString("Throttle", "" + throttle);
		RobotMap.myRobot.setMaxOutput(throttle);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}