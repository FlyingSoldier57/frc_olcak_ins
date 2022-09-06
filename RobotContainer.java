package frc.robot;



import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.PS4ControllerButton;



  public class RobotContainer {
    
    PS4Controller drivController = new PS4Controller(DriveConstants.Drive_Controller);
    PS4Controller operatorController = new PS4Controller(DriveConstants.OPERATOR_CONTROLLER);
    PS4Controller kSquare = new PS4Controller(PS4ControllerButton.BUTTON_SQUARE);
    PS4Controller kTriangle = new PS4Controller(PS4ControllerButton.BUTTON_TRIANGLE);
    PS4Controller kCross = new PS4Controller(PS4ControllerButton.BUTTON_CROSS);
    PS4Controller kCircle = new PS4Controller(PS4ControllerButton.BUTTON_CIRCLE);
    PS4Controller kL1pPs4Controller = new PS4Controller(PS4ControllerButton.BUTTON_L1);
    PS4Controller kR2 = new PS4Controller(PS4ControllerButton.BUTTON_R2);
    PS4Controller kR3 = new PS4Controller(PS4ControllerButton.BUTTON_R3);
    PS4Controller kR1 = new PS4Controller(PS4ControllerButton.BUTTON_R1);
    PS4Controller kL2 = new PS4Controller(PS4ControllerButton.BUTTON_L2);
    PS4Controller kL3 = new PS4Controller(PS4ControllerButton.BUTTON_L3);
    PS4Controller kShare = new PS4Controller(PS4ControllerButton.BUTTON_SHARE);
    PS4Controller kPS = new PS4Controller(PS4ControllerButton.BUTTON_PS);
    PS4Controller kTouchPad = new PS4Controller(PS4ControllerButton.BUTTON_TOUCHPAD);

    public double GetDriverRawAxis(int axis){
      return drivController.getRawAxis(axis); }

  // The robot's subsystems and commands are defined here...


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  }
