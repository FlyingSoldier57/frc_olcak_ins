package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;
import frc.robot.subsystems.DrivetrainSubsystem;


public class TankDrive extends CommandBase {

  public TankDrive(Object PS4ControllerButton, Subsystem DrivetrainSubsystem) {
    addRequirements(DrivetrainSubsystem);
    double BUTTON_R1 = Robot.GetDriverRawAxis(PS4ControllerButton.BUTTON_R1);
    double BUTTON_L1 = Robot.GetDriverRawAxis(PS4ControllerButton.BUTTON_L1);
    DrivetrainSubsystem.setLeftMotors(BUTTON_R1);
    Robot.DriveSubsystem.setRightMotors(BUTTON_L1);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end (boolean interrupted) {
    Robot.DriveSubsystem.setLeftMotors(0);
    Robot.DriveSubsystem.setRightMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
