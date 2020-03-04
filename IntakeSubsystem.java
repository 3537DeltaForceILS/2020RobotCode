/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
//import edu.wpi.first.wpilibj.PWMSparkMax;
//import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeStopCommand;


/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  private Spark intakeMotor = new Spark(RobotMap.intakePort);
  private Spark deployMotor = new Spark(RobotMap.intakeDeployPort);

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new IntakeStopCommand());
  }
  public void runIntakeMotors(double speed){
    intakeMotor.set(-speed);
    //System.out.println("IntakeSubsystem On");
  }
  public void runDeployMotors(double speed){
    deployMotor.set(speed);
    //System.out.println("IntakeDepSubsystem On");
  }
}
