/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.LifterStopCommand;
//import edu.wpi.first.wpilibj.PWMSparkMax;
/**
 * Add your docs here.
 */
public class LifterSubsystem extends Subsystem {
  private Spark lifterMotor = new Spark(RobotMap.lifterPort);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new LifterStopCommand());
  }
  public void runLifterMotor(double speed){
    lifterMotor.set(speed);
    //System.out.println("LifterSubsystem On");
  }

}
