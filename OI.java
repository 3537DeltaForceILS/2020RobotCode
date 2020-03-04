/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DeployDownIntakeCommand;
import frc.robot.commands.DeployUpIntakeCommand;
//import frc.robot.commands.AutoRunShooterAndFeederCommand;
import frc.robot.commands.RunDownLifterCommand;
import frc.robot.commands.RunFeederCommand;
import frc.robot.commands.RunIntakeCommand;
import frc.robot.commands.RunShooterCommand;
//import frc.robot.commands.RunShooterCommand;
import frc.robot.commands.RunUpLifterCommand;
import frc.robot.commands.RunUpClimberCommand;
 
 
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public Joystick stick1 = new Joystick(RobotMap.joystickPort0);
  public Joystick stick2 = new Joystick(RobotMap.joystickPort1);

   JoystickButton liftup = new JoystickButton(stick1, 4);
   JoystickButton liftdown = new JoystickButton(stick1, 1);
   JoystickButton climb = new JoystickButton(stick1, 3);
  
  JoystickButton shooter = new JoystickButton(stick2,3);
   JoystickButton intake = new JoystickButton(stick2,2);
   JoystickButton feeder = new JoystickButton(stick2, 6);
   JoystickButton deployup = new JoystickButton(stick2, 1);
   JoystickButton deploydown = new JoystickButton(stick2, 4);

  
   
  // Button button = new JoystickButton(stick, buttonNumber);
  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.
 
  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:
    //intake.whenPressed();
    //raiseup.whenPressed();
    //raisedown.whenPressed();
    //climb.whileHeld();
    //elevatorup.whileHeld();
   // elevatordown.whileHeld();
   public OI(){
     intake.whileHeld(new RunIntakeCommand());
     shooter.whileHeld(new RunShooterCommand());
     liftup.whileHeld(new RunUpLifterCommand());
     liftdown.whileHeld(new RunDownLifterCommand());
     climb.whileHeld(new RunUpClimberCommand());
     feeder.whileHeld(new RunFeederCommand());
     deployup.whileHeld(new DeployUpIntakeCommand());
     deploydown.whileHeld(new DeployDownIntakeCommand());

  

   }

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

 
  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());
 
  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
 
