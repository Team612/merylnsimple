package frc.team612.commands.pneumatic;

import frc.team612.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisableDropper extends Command {

    public DisableDropper() {
    	requires(Robot.dropper);
    }
    protected void initialize() {
    }
    protected void execute() {
    	Robot.dropper.getSolenoid().set(Value.kOff);
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}
