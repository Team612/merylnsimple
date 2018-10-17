package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;
import frc.team612.commands.DefaultLift;

public class Lift extends Subsystem {
    WPI_TalonSRX lift_talon = new WPI_TalonSRX(RobotMap.talon_lift);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public WPI_TalonSRX getTalon() {
        return lift_talon;
    }


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
            setDefaultCommand(new DefaultLift());
    }
}

