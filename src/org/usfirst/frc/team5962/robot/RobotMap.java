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
	
	public static RobotDrive myRobot;

	public static Victor robotLeftVictor1;
	public static Victor robotLeftVictor2;
	public static Victor robotRightVictor1;
	public static Victor robotRightVictor2;

	public static SpeedController leftDrive;
	public static SpeedController rightDrive;
	
	private static boolean has_left_side = false;
	private static boolean has_right_side = false;
	private static boolean is_left_inverted = false;
	private static boolean is_right_inverted = false;
	
	public static void set_left_drive(int channel_1, int channel_2) {
		robotLeftVictor1 = new Victor(channel_1);
		robotLeftVictor2 = new Victor(channel_2);
		has_left_side = true;
	}
	
	public static void set_right_drive(int channel_1, int channel_2) {
		robotRightVictor1 = new Victor(channel_1);
		robotRightVictor2 = new Victor(channel_2);
		has_right_side = true;
	}
	
	public static void invert_left_drive(boolean is_inverted) {
		is_left_inverted = is_inverted;
	}
	public static void invert_right_drive(boolean is_inverted) {
		is_right_inverted = is_inverted;
	}

	public static void init() {
		Robot.auto_execute.init();
		
		SpeedController leftDrive;
		SpeedController rightDrive;

		if(!has_left_side) {
			System.err.println("WARNING: Did not setup left side!");
			System.err.println("Using default setup! Left1: PWM_CHANNEL_0 Left2: PWM_CHANNEL_1");
			
			robotLeftVictor1 = new Victor(0);
			robotLeftVictor2 = new Victor(1);
		}
		if(!has_right_side) {
			System.err.println("WARNING: Did not setup right side!");
			System.err.println("Using default setup! Right1: PWM_CHANNEL_6 Right2: PWM_CHANNEL_7");

			robotRightVictor1 = new Victor(6);
			robotRightVictor2 = new Victor(7);
		}
		
		leftDrive = new MultiSpeedController(robotLeftVictor1, robotLeftVictor2);
		rightDrive = new MultiSpeedController(robotRightVictor1, robotRightVictor2);

		leftDrive.setInverted(is_left_inverted);
		rightDrive.setInverted(is_right_inverted);
		myRobot = new RobotDrive(leftDrive, rightDrive);
	}
}