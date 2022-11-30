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
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
  DoubleSolenoid Solinoid1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
  DoubleSolenoid Solinoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2);
  CANSparkMax motor = CANSparkMax​(int deviceId, CANSparkMaxLowLevel.MotorType type);

  public Intake() {
        
  pcmCompressor.enableDigital();
  pcmCompressor.enabled();
  Solinoid1.set(Value.kReverse);
  Solinoid2.set(Value.kReverse);  
  
  }

  public void goforward(){

    Solinoid1.set(Value.kForward);
    Solinoid2.set(Value.kForward);
    
  }
  public void gobackwards(){    

    Solinoid1.set(Value.kReverse);
    Solinoid2.set(Value.kReverse);  
    
    }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    pcmCompressor.enableDigital();
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
