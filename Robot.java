/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package frc.robot;
 
//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import frc.robot.commands.AutoRunShooterAndFeederCommand;
//import frc.robot.commands.AutoTesting;
import frc.robot.commands.DriveTimeoutCommand;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.FeederSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.LifterSubsystem;

//import org.graalvm.compiler.phases.schedule.SchedulePhase;

//import org.graalvm.compiler.debug.TimeSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static final int IMG_Height = 240;
  public static final int IMG_WIDTH = 320;
  public static DriveSubsystem driveSubsystem = new DriveSubsystem();
  public static IntakeSubsystem m_intakeSubsystem = new IntakeSubsystem();
  public static ShooterSubsystem m_shooterSubsystem = new ShooterSubsystem();
  public static LifterSubsystem m_lifterSubsystem = new LifterSubsystem();
  public static ClimberSubsystem m_climberSubsystem = new ClimberSubsystem();
  public static FeederSubsystem m_feederSubsystem = new FeederSubsystem();
  public static OI oi;

  Command autonomousCommand;
  Command driveTimeoutCommand = new DriveTimeoutCommand();
  SendableChooser<Command> chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */

  @Override
  public void robotInit() {
    oi = new OI();
    //chooser.setDefaultOption("DriveStraight3Seconds", new DriveTimeoutCommand(3));
    //chooser.addOption("Testing", new AutoTesting());
    //chooser.addOption("AutoShoot", new AutoRunShooterAndFeederCommand());
     //chooser.addOption("My Auto", new MyAutoCommand());
    //SmartDashboard.putData("Auto mode", chooser);
    UsbCamera camera1 = CameraServer.getInstance().startAutomaticCapture();
    camera1.setResolution(IMG_WIDTH, IMG_Height);
  UsbCamera camera2 = CameraServer.getInstance().startAutomaticCapture();
  camera2.setResolution(IMG_WIDTH, IMG_Height);

  }
 
 
 
 
 
  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
  }
  /**
   * This function is called once each time the robot enters Disabled mode.
   * You can use it to reset any subsystem information you want to clear when
   * the robot is disabled.
   */
  @Override
  public void disabledInit() {
  }
 
  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }
 
  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different autonomous modes using the dashboard. The sendable
   * chooser code works with the Java SmartDashboard. If you prefer the
   * LabVIEW Dashboard, remove all of the chooser code and uncomment the
   * getString code to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional commands to the
   * chooser code above (like the commented example) or additional comparisons
   * to the switch structure below with additional strings & commands.
   */
  @Override
  public void autonomousInit() {
    autonomousCommand = oi.AutonDriveCommand;
    //autonomousCommand = chooser.getSelected();
 
   //driveTimeoutCommand.start();
    
    /*  String autoSelected = SmartDashboard.getString("Auto Selector",
      *"Default"); switch(autoSelected) { case "My Auto": autonomousCommand
      *= new MyAutoCommand(); break; case "Default Auto": default:
      *autonomousCommand = new ExampleCommand(); break; }
     */
 
    // schedule the autonomous command (example)
    if (autonomousCommand != null) {
     
    }
  }
 
  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
 
  }
  
 
  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    if (autonomousCommand != null) {
      autonomousCommand.cancel();
    }
  }
 
  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
 
  /**
   * This function is called periodically during test mode.
   */
  //@Override
  //public void testPeriodic() 
 
}
