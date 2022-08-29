// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.InvertType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  public final class IntakeConstants{ 
  public static final double kOpenSpeed = 0;
  public static final double kCloseSpeed = 1;
  public static final int kMotorPort = 4;
  public static final int Intake_Motor = 0;
  }

  public final class DriveConstants { 
    public static final int LEFT_MOTOR_1_ID = 0;
    public static final int RIGHT_MOTOR_2_ID = 0;
    public static final int LEFT_MOTOR_2_ID = 0;
    public static final int RIGHT_MOTOR_1_ID = 0;
    public static final int Drive_Controller = 0;
    public static final int Intake_Motor = 0;
    public static final int OPERATOR_CONTROLLER = 0;
    public static final int DRIVER_CONTROLLER = 0;
    }
 
    public final static class ShooterConstants {
    public static final int kShooterMotor1Port = 0;
    public static final InvertType kShooterInvertedMode1 = null;
    public static InvertType kShooterInvertedMode;
    public static int kShooterMotorPort;
}

public final class PS4ControllerButton{
    public static final int BUTTON_SQUARE = 0;
    public static final int BUTTON_TRIANGLE = 0;
    public static final int BUTTON_CROSS = 0;
    public static final int BUTTON_CIRCLE = 0;
    public static final int BUTTON_L1 = 0;
    public static final int BUTTON_R2 = 0;
    public static final int BUTTON_R3 = 0;
    public static final int BUTTON_R1 = 0;
    public static final int BUTTON_L2 = 0;
    public static final int BUTTON_PS = 0;
    public static final int BUTTON_SHARE = 0;
    public static final int BUTTON_TOUCHPAD = 0;
    public static final int BUTTON_L3 = 0;

}
}