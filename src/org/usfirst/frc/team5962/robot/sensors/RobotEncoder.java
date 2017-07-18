package org.usfirst.frc.team5962.robot.sensors;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotEncoder {

	Encoder encoderLeft;
	Encoder encoderRight;

	int numberOfEncoders = 2;

	public RobotEncoder() {
		encoderLeft = new Encoder(0, 1, true, Encoder.EncodingType.k4X);
		encoderRight = new Encoder(2, 3, false, Encoder.EncodingType.k4X);
		encoderLeft.setDistancePerPulse(0.027);
		encoderRight.setDistancePerPulse(0.027);
	}

	public void setNumberOfEncoders(int numberOfEncoders) {
		this.numberOfEncoders = numberOfEncoders;
	}

	public void reset() {
		encoderLeft.reset();
		encoderRight.reset();
	}

	public double getDistance() {
		SmartDashboard.putString("Left Encoder Distance", "" + encoderLeft.getDistance());
		SmartDashboard.putString("Right Encoder Distance", "" + encoderRight.getDistance());

		double distance = ((encoderLeft.getDistance() + encoderRight.getDistance()) / numberOfEncoders);

		SmartDashboard.putString("Encoder Distance", "" + distance);
		return distance;
	}

	public void logValues() {
		System.out.println("encoder left = " + encoderLeft.getDistance());
		System.out.println("encoder right = " + encoderRight.getDistance());
	}
}
