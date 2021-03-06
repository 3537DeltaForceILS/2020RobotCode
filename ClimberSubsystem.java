/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.ClimberStopCommand;
//import edu.wpi.first.wpilibj.PWMSparkMax;
//import edu.wpi.first.wpilibj.Talon;

/**
 * Add your docs here.
 */
public class ClimberSubsystem extends Subsystem {
  private Spark ClimberMotor = new Spark(RobotMap.climberPort);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ClimberStopCommand());
  }
  public void runClimberMotor (double speed){
    ClimberMotor.set(-speed);
    //System.out.println("ClimberSubsystem On");
  }

  @Override
  public void periodic(){
    SmartDashboard.putNumber("climber speed", ClimberMotor.get());
  }

}
