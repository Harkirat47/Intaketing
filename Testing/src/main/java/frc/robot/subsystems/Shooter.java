package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    WPI_TalonSRX leftMotor = new WPI_TalonSRX(Constants.Shooter.s_Leftmoter);
    WPI_TalonSRX rightMotor = new WPI_TalonSRX(Constants.Shooter.s_Rightmoter);
    private MotorControllerGroup shootingMotor = new MotorControllerGroup(leftMotor, rightMotor);
    
    public Shooter() {
        leftMotor.setInverted(true);
    }

    public void SetSpeed(double speed) {
        shootingMotor.set(speed);
    }
}
