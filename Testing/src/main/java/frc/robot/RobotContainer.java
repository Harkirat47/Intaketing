// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.DT;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.lowershoot;
import frc.robot.commands.upshoot;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.drivetrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DT; 
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final Shooter m_shooter = new Shooter();

  private final upshoot m_upshoot = new upshoot(m_shooter);

  private final lowershoot m_lowshoot = new lowershoot(m_shooter);

  private final drivetrain drive = new drivetrain();
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure  the button bindings
    configureButtonBindings();
  }


  private void configureButtonBindings() {
    XboxController pilot = new XboxController(0);
    drive.setDefaultCommand(new DT(drive, pilot::getLeftY, pilot::getRightX));
    JoystickButton A = new JoystickButton(pilot, Button.kA.value);
    JoystickButton B = new JoystickButton(pilot, Button.kB.value);
    A.whenHeld(m_upshoot);
    B.whenHeld(m_lowshoot);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
