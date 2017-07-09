package org.usfirst.frc.team5962.robot;

import edu.wpi.first.wpilibj.SpeedController;

public class MultiSpeedController implements SpeedController {
	private SpeedController[] speedControllers;
	private double speed;
	private boolean isInverted = false;

	public MultiSpeedController(SpeedController... speedControllers) {
		this.speedControllers = speedControllers;
		this.set(0.0);
	}

	@Override
	public double get() {
		return this.speed;
	}

	@Override
	public void set(double speed) {
		this.speed = speed;

		for (SpeedController speedController : this.speedControllers) {
			speedController.set(speed);
		}
	}

	public void set(double speed, byte syncGroup) {
		this.set(speed);
	}

	@Override
	public void pidWrite(double output) {
		this.set(output);
	}

	@Override
	public void disable() {
		for (SpeedController speedController : this.speedControllers) {
			speedController.disable();
		}
	}

	@Override
	public void setInverted(boolean isInverted) {
		this.isInverted = isInverted;
		for (SpeedController speedController : this.speedControllers) {
			speedController.setInverted(isInverted);
		}
	}

	@Override
	public boolean getInverted() {
		return this.isInverted;
	}

	@Override
	public void stopMotor() {
		for (SpeedController speedController : this.speedControllers) {
			speedController.stopMotor();
		}
	}

}