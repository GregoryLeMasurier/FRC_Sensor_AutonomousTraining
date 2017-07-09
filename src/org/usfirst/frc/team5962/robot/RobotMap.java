package org.usfirst.frc.team5962.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public final static int PWM_CHANNEL_0 = 0;
	public final static int PWM_CHANNEL_1 = 1;
	public final static int PWM_CHANNEL_6 = 6;
	public final static int PWM_CHANNEL_7 = 7;

	public static RobotDrive myRobot;

	public static Victor robotLeftVictor1;
	public static Victor robotLeftVictor2;
	public static Victor robotRightVictor1;
	public static Victor robotRightVictor2;

	public static SpeedController leftDrive;
	public static SpeedController rightDrive;

	public static void init() {

		SpeedController leftDrive;
		SpeedController rightDrive;

		robotLeftVictor1 = new Victor(PWM_CHANNEL_0);
		robotLeftVictor2 = new Victor(PWM_CHANNEL_1);
		robotRightVictor1 = new Victor(PWM_CHANNEL_6);
		robotRightVictor2 = new Victor(PWM_CHANNEL_7);

		leftDrive = new MultiSpeedController(robotLeftVictor1, robotLeftVictor2);
		rightDrive = new MultiSpeedController(robotRightVictor1, robotRightVictor2);
		leftDrive.setInverted(true);
		rightDrive.setInverted(true);
		myRobot = new RobotDrive(leftDrive, rightDrive);
	}
}