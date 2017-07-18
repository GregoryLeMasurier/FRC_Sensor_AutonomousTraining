package org.usfirst.frc.team5962.robot.sensors;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class RobotGyro {

	public ADXRS450_Gyro gyro;
	final int gyroChannel = 0;
	double angleSetPoint = 0.0;
	final double gyroSpeedConstant = 0.006;

	public RobotGyro() {
		gyro = new ADXRS450_Gyro();
	}

	/**
	 * <pre>
	 * Reset and Calibrate
	 * </pre>
	 * 
	 * <pre>
	 * Calibrate the gyro by running for a number of samples and computing the
	 * center value. Then use the center value as the Accumulator center value for
	 * subsequent measurements. It's important to make sure that the robot is not
	 * moving while the centering calculations are in progress, this is typically
	 * done when the robot is first turned on while it's sitting at rest before
	 * the competition starts.
	 * </pre>
	 * 
	 * <pre>
	 * Reset the gyro. Resets the gyro to a heading of zero. This can be used if
	 * there is significant drift in the gyro and it needs to be recalibrated
	 * after it has been running.
	 * </pre>
	 */
	public void resetGyro() {
		gyro.reset();
	}

	public void calibrateGyro() {
		gyro.calibrate();
	}

	/**
	 * <pre>
	 * Return the actual angle in degrees that the robot is currently facing.
	 * </pre>
	 * 
	 * <pre>
	 * The angle is based on the current accumulator value corrected by the
	 * oversampling rate, the gyro type and the A/D calibration values. The angle
	 * is continuous, that is it will continue from 360 to 361 degrees. This
	 * allows algorithms that wouldn't want to see a discontinuity in the gyro
	 * output as it sweeps past from 360 to 0 on the second time around.
	 * </pre>
	 * 
	 * @return the current heading of the robot in degrees. This heading is based on
	 *         integration of the returned rate from the gyro.
	 */

	public double getGyroAngle() {
		return gyro.getAngle();
	}

	public double getTurningValue() {
		return (angleSetPoint - gyro.getAngle()) * gyroSpeedConstant;
	}
}