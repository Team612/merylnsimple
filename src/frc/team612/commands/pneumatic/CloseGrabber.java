package frc.team612.commands.pneumatic;

import frc.team612.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CloseGrabber extends Command {

    public CloseGrabber() {
    	requires(Robot.grabber);
    }
    protected void initialize() {
    }
    protected void execute() {
    	Robot.grabber.getSolenoid().set(Value.kForward);
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}