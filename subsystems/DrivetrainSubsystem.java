// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DrivetrainSubsystem extends SubsystemBase {
  private static TalonSRX motorLeft1 = new TalonSRX(DriveConstants.LEFT_MOTOR_1_ID);
  private VictorSPX motorRight2 = new VictorSPX(DriveConstants.RIGHT_MOTOR_2_ID);
  private static TalonSRX motorLeft2 = new TalonSRX(DriveConstants.LEFT_MOTOR_2_ID);
  private VictorSPX motorRight1 = new VictorSPX(DriveConstants.RIGHT_MOTOR_1_ID);

  public void DriveTrain() {}

  @Override
  public void periodic() {
    
  }

public static void setLeftMotors(double speed)  {
  motorLeft1.set(ControlMode.PercentOutput, -speed);
  motorLeft2.set(ControlMode.PercentOutput, -speed);
}

public void setRightMotors(double speed) {
    motorRight1.set(ControlMode.PercentOutput, speed);
    motorRight2.set(ControlMode.PercentOutput, speed);
}

public void fullStop() {
  
}


}