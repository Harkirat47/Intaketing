package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.Constants;

public class drivetrain extends SubsystemBase {
    WPI_TalonSRX leftfrontMotor = new WPI_TalonSRX(Constants.Drivetrain.d_lfmotor);
    WPI_TalonSRX rightfrontMotor = new WPI_TalonSRX(Constants.Drivetrain.d_rfmotor);
    WPI_TalonSRX leftbackMotor = new WPI_TalonSRX(Constants.Drivetrain.d_lbmotor);
    WPI_TalonSRX rightbackMotor = new WPI_TalonSRX(Constants.Drivetrain.d_rbmotor);

    
    private MotorControllerGroup Left_motors = new MotorControllerGroup(leftfrontMotor, leftfrontMotor);
    private MotorControllerGroup Right_motors = new MotorControllerGroup(rightbackMotor, rightbackMotor);

    public drivetrain(){
        leftbackMotor.setInverted(true);
        leftfrontMotor.setInverted(true);
    }
      public void SetSpeed(double speedR, double speedL) {
        Left_motors.set(speedR);
        Right_motors.set(speedL);
    } 

}