
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Shooter;
import frc.robot.Constants;
 
/** An example command that uses an example subsystem. */
public class lowershoot extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Shooter m_lowtake;

   public lowshoot( Shooter lowtake) {
    m_lowtake = lowtake;
    addRequirements(lowtake);
}
@Override
  public void initialize() {
      m_lowtake.SetSpeed(0);
  }

  @Override
  public void execute() {
     m_lowtake.SetSpeed(.5);
  }

  @Override
  public void end(boolean interrupted) {
     m_lowtake.SetSpeed(0);
      
  }
}