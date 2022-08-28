// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;


public class RobotContainer {
  
  //sublar
  private final DrivetrainSubsystem m_DrivetrainSubsystem = new DrivetrainSubsystem();
  private final IntakeSubsystem m_IntakeSubsystem = new IntakeSubsystem();
  private final ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();


  //ps4 kolu
  private final PS4Controller operatorController = new PS4Controller(0);


  
  public RobotContainer() {

    configureButtonBindings();
  }


  private void configureButtonBindings() {

  }

  public Command getAutonomousCommand() {
    return null;
  
  }

  public PS4Controller getOperatorController() {
    return operatorController;
  }

public static Object getInstance() {
    return null;
}
}
