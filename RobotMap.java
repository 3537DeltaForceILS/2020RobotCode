/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package frc.robot;
 
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
 

// If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  //PWM Ports
   public static int leftMasterPort = 1;

   public static int rightMasterPort = 2;

   public static int intakePort = 3;

  public static int intakeDeployPort = 4;

   public static int shooterPort = 5; 

   public static int feederPort = 6;

   public static int lifterPort = 7;

   public static int climberPort = 8;

   
  public static int joystickPort0 = 0;
  public static int joystickPort1 = 1;
 
  // Other Constants

   public static int wheelDiameter = 6;

   public static double deployUpSpeed = 1;
   public static double deployDownSpeed = -1;

   public static final double intakeSpeed = 1;
   
   public static final double lifterUpspeed = 1;
   public static double lifterDownSpeed = -1; 

   public static double shooterSpeed = 1;
   public static int shooterSpinupTime = 1;
   
   public static double feederSpeed = -1;

   public static double climberUpSpeed = 1;
   public static double climberDownSpeed = -1;

  public static double autoShooterSpeed = 1;
  public static int autoShooterTime = 3;



 
}  
