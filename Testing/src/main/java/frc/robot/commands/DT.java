// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.drivetrain;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
/** An example command that uses an example subsystem. */
public class DT extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final drivetrain m_subsystem;
  private DoubleSupplier Left;
  private DoubleSupplier Right;


  public DT(drivetrain tankdDrive, DoubleSupplier Left, DoubleSupplier Right) {
    this.m_subsystem = tankdDrive;
    this.Left = Left;
    this.Right= Right;
    addRequirements(tankdDrive);
  }
  @Override
  public void initialize(){
      m_subsystem.SetSpeed(0,0);
  };
  @Override
  public void execute(){
      m_subsystem.SetSpeed(Right.getAsDouble(),Left.getAsDouble());
  };

}
