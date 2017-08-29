# FRC_BasicSoftwareSensorTraining

**Please send us any feedback so we can improve the project!**

This version of the software training was created as a follow up training (after https://github.com/GregoryLeMasurier/FRC_BasicSoftwareTraining ). It provides the students with easy to use method calls that will allow them to move a robot from a starting square, marked with tape, to an ending square. In this training the path they will need to follow will be more complicated than in the first training. In this training they will learn about using sensors to create a more accurate autonomous. Simple function calls allow for students without software experience to easily pick up and understand very basics of programming with a quick sense of accomplishment when they can get the robot to move within minutes. 

Examples of function calls:

//Robot moves backwards at the given speed(double from -1 to 1) until it moves backwards "sensorValue" inches (int)

backwardsWithEncoders(speed, sensorValue)
  
//Robot moves forwards at the given speed(double from -1 to 1) until it moves forward "sensorValue" inches (int)

forwardWithEncoders(speed, sensorValue);

//Robot moves forwards at the given speed(double from -1 to 1) until the ultrasonic gets a value less than sensorValue (int)

forwardWithUltrasonic(speed, sensorValue)
  
//Robot turns to the left at the given speed(double from -1 to 1) until it has turned "sensorValue" degrees (int)

turnLeft(speed, sensorValue)
  
//Robot turns to the right at the given speed(double from -1 to 1) until it has turned "sensorValue" degrees (int)

turnRight(speed, sensorValue)
  
//Robot stops for time (int) seconds

driveRobot.stop(time);            
  
These commands are currently entered into the init method in the AutoExecute command class.
  
  Future changes
  1. Need to add support to select if the robot is running on talons or victors.
