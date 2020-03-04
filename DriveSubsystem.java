/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
 
package frc.robot.subsystems; 
 
//import edu.wpi.first.wpilibj.SpeedController;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSR;
//import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.Talon; //Changed!!!!!!!!
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.VroomVroomButManuallyCommand;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 
  //instantile new motor controller objects
 
  public static Spark leftMaster = new Spark(RobotMap.leftMasterPort); 
  public static Spark rightMaster = new Spark(RobotMap.rightMasterPort);
  //public static PWMSparkMax leftSlave = new PWMSparkMax(RobotMap.leftSlavePort);
 // public static PWMSparkMax rightSlave = new PWMSparkMax(RobotMap.rightSlavePort);
 
                                                                          
 


  // instantiate a new DifferentialDrive object   
  // assign motor controllers to differential drive
  public DifferentialDrive drive= new DifferentialDrive (leftMaster,rightMaster);
  // create constructor function
public DriveSubsystem() {
    //point slaves to masters
 // leftSlave.follow(leftMaster);
   // rightSlave.follow(rightMaster);
}
 
 
  
  // add manualDrive() method
public void manualDrive(double move, double turn) {
  //System.out.println("Manual ON");
 
if(move > .75) {
  move = .75;
}
if (Math.abs(move) < 0.10) {        
  move = 0;
 
}
 
if (Math.abs(turn) < 0.10) {
  turn = 0;
 
}
 
 
drive.arcadeDrive(-move,-turn);
//System.out.println("Arcade On");
  }
 
 
 
   
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new VroomVroomButManuallyCommand());
  }
 
 
 
public void stop() {
}
 
 
 
public void drive( final int i, final int j) {
  
}
}
 
 
 
 
 
 
 
 
 
 
 
