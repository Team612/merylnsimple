package frc.team612.commands.pneumatic;

import frc.team612.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisableGrabber extends Command {

    public DisableGrabber() {
    	requires(Robot.grabber);
    }
    protected void initialize() {

    }
    protected void execute() {
    	Robot.grabber.getSolenoid().set(Value.kOff);
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}
