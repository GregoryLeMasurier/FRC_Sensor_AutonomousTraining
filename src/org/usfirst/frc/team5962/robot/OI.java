package org.usfirst.frc.team5962.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public JoystickButton joystickTankMode;

	public Joystick joystickLeft;
	public Joystick joystickRight;

	public OI() {
		joystickLeft = new Joystick(1);
		joystickRight = new Joystick(2);
		joystickTankMode = new JoystickButton(joystickLeft,1);
	}
}