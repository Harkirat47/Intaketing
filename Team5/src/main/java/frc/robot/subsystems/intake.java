// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;

public class intake extends SubsystemBase {
  // creates the compressor 
  Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
  
  // defines a PAIR of solonoides 
  DoubleSolenoid Solinoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.solonoidIdOne, Constants.Intake.solonoidIdTwo);
  DoubleSolenoid Solinoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Intake.solonoidIdOne, Constants.Intake.solonoidIdTwo);
  CANSparkMax motor = new CANSparkMax(Constants.Intake.intakeMoter , CANSparkMaxLowLevel.MotorType.kBrushless);

  public intake() {
   // enables the compressor anf also makes the compressor in its original orientation     
  pcmCompressor.enableDigital();
  pcmCompressor.enabled();
  Solinoid1.set(Value.kReverse);
  Solinoid2.set(Value.kReverse);  
  
  }
  
  public void goforward(){
// both solonoides extend and the motor goes at the same time
    Solinoid1.set(Value.kForward);
    Solinoid2.set(Value.kForward);
    motor.set(Constants.Intake.Setspeed);
    
  }
  
  public void gobackwards(){   
    // returns the solonoids to there original position and stops the motor
    Solinoid1.set(Value.kReverse);
    Solinoid2.set(Value.kReverse);  
    motor.set(0);
    }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //avtivates compressor forever
    pcmCompressor.enableDigital();
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
