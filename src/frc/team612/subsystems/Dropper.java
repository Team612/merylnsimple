package frc.team612.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;

public class Dropper extends Subsystem {
    DoubleSolenoid solenoid_drop = new DoubleSolenoid(RobotMap.PCM_solenoid_D,RobotMap.solenoid_D_one,RobotMap.solenoid_D_two);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DoubleSolenoid getSolenoid() {

        return solenoid_drop;

    }
    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

