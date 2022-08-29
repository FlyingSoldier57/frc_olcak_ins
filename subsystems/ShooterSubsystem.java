// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConstants;

public class ShooterSubsystem extends SubsystemBase {
    private WPI_VictorSPX shooterMotor = new WPI_VictorSPX(ShooterConstants.kShooterMotorPort);
    


  public ShooterSubsystem() {
    shooterMotor.setInverted(ShooterConstants.kShooterInvertedMode);
  }

  @Override
  public void periodic() {

  }
  public void runShooter(double speed){
    shooterMotor.set(speed);
  }
  

}