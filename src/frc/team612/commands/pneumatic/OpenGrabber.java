package frc.team612.commands.pneumatic;

import frc.team612.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenGrabber extends Command {

    public OpenGrabber() {
    	requires(Robot.grabber);
    }
    protected void initialize() {
    }
    protected void execute() {
    	Robot.grabber.getSolenoid().set(Value.kReverse);
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}