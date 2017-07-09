# FRC_BasicSoftwareTraining

This version of the software training is an improvement to the 2016 software training because it provides the students with easy to use
method calls that will allow them to move a robot from a starting square, marked with tape, to an ending square. Simple function calls
allow for students without software experience to easily pick up and understand very basics of programming with a quick sense of
accomplishment when they can get the robot to move within minutes. 

Examples of function calls:

//Robot moves backwards at the given speed(double from -1 to 1) for time (int) seconds

driveRobot.backwards(speed, time);
  
//Robot moves forwards at the given speed(double from -1 to 1) for time (int) seconds

driveRobot.forward(speed, time); 
  
//Robot turns to the left at the given speed(double from -1 to 1) for time (int) seconds

driveRobot.turnLeft(speed, time);
  
//Robot turns to the right at the given speed(double from -1 to 1) for time (int) seconds

driveRobot.turnRight(speed, time);
  
//Robot stops for time (int) seconds

driveRobot.stop(time);            
  
These commands are currently entered into the init method in the AutoExecute command class.
  
  Future changes
  1. Need to add support to select if the robot is running on talons or victors.
