
package frc.team612.commands.pneumatic;

import frc.team612.OI;
import frc.team612.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DefaultGrabber extends Command {
	private static boolean toggle = false;
    public DefaultGrabber() {
    	
    	requires(Robot.grabber);
    }
    protected void initialize() {
    	
    }
    protected void execute() {
    	if(OI.GRABBER_POS) {
    		Robot.grabber.getSolenoid().set(Value.kReverse);
    	} else  {
    		Robot.grabber.getSolenoid().set(Value.kForward);	
    	}
    	OI.GRABBER_POS = !OI.GRABBER_POS;
    }
    protected boolean isFinished() {
        return true;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}
