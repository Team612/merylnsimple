package frc.team612.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class Grabber extends Subsystem {
    DoubleSolenoid solenoid_G = new DoubleSolenoid(RobotMap.PCM_solenoid_G,RobotMap.solenoid_G_one,RobotMap.solenoid_G_two);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DoubleSolenoid getSolenoid() {

        return solenoid_G;

    }
    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

