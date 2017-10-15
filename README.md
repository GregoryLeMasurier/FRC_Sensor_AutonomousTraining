# FRC_BasicSoftwareSensorTraining

**Please send us any feedback so we can improve the project!**

This version of the software training was created as a follow up training (after https://github.com/GregoryLeMasurier/FRC_BasicSoftwareTraining ). It provides the students with easy to use method calls that will allow them to move a robot from a starting square, marked with tape, to an ending square. In this training the path they will need to follow will be more complicated than in the first training. In this training they will learn about using sensors to create a more accurate autonomous. Simple function calls allow for students without software experience to easily pick up and understand very basics of programming with a quick sense of accomplishment when they can get the robot to move within minutes. 

**Setup**
1. Left side of the robot drive:

We use pwm channel 0 and 1 for our left victors.

Values can be changed to match your set up in RobotMap.

2. Right side of the robot drive:

We use pwm channel 6 and 7 for our right victors.

Values can be changed to match your set up in RobotMap.

3. We use the ADXRS450 Gyro. 

NOTE: If you are using a different on you will need to replace the gyro class in the sensor package with one that is compatible with your gyro.

4. Ultrasonic in Analog 0

5. Encoder in Digital 0,1

**Errors you might encounter**

1. Robot is not moving straight when using forwards or backwards. 

Reason: We use a hard coded gyro correction value because of inconsistencies in the cim motors.
  
Solution: You will need to implement your own correction or remove the correction we use.

2. Robot does not move or only one side moves.

Reason: Your set up must not match ours.

Solution: See setup above and make sure you are using the same setup. (You could also change RobotMap to match your robot)

Solution2a: Are you using a gyro? If not you should remove all code that requires a gyro.

Solution2b: Is it the same gyro we are using? If not you will need to replace the gyro class in the sensor package with one that is compatible with your gyro.

3. Robot moves backwards when forwards is called and forwards when backwards is called.

Reason: We invert our drive.

Solution: Remove the inverted lines: RobotMap lines 42 and 43.

4. The right and left sides of the robot move in opposite directions when using forward or backwards.

Reason: Setup might be slightly different than ours.

Solution: Remove one of the inverted lines: RobotMap lines 42 or 43.

**Examples of function calls:**

//Robot moves backwards at the given speed(double from -1 to 1) until it moves backwards "sensorValue" inches (int)

driveRobot.backwardsWithEncoders(speed, sensorValue)
  
//Robot moves forwards at the given speed(double from -1 to 1) until it moves forward "sensorValue" inches (int)

driveRobot.forwardWithEncoders(speed, sensorValue);

//Robot moves forwards at the given speed(double from -1 to 1) until the ultrasonic gets a value less than sensorValue (int)

driveRobot.forwardWithUltrasonic(speed, sensorValue)
  
//Robot turns to the left at the given speed(double from -1 to 1) until it has turned "sensorValue" degrees (int)

driveRobot.turnLeft(speed, sensorValue)
  
//Robot turns to the right at the given speed(double from -1 to 1) until it has turned "sensorValue" degrees (int)

driveRobot.turnRight(speed, sensorValue)
  
//Robot stops for time (int) seconds

driveRobot.stop(time);            
  
These commands are currently entered into the init method in the AutoExecute command class.
  
  Future changes
  1. Need to add support to select if the robot is running on talons or victors.
