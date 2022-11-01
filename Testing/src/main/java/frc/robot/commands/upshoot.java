
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Shooter;
import frc.robot.Constants;
 
/** An example command that uses an example subsystem. */
public class upshoot extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Shooter m_uptake;

   public upshoot( Shooter uptake) {
    m_uptake = uptake;
    addRequirements(uptake);
}
@Override
  public void initialize() {
      m_uptake.SetSpeed(0);
  }

  @Override
  public void execute() {
    m_uptake.SetSpeed(.5);
  }

  @Override
  public void end(boolean interrupted) {
    m_uptake.SetSpeed(0);
      
  }
}