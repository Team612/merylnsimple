package frc.team612.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;
import frc.team612.commands.DefaultDrive;


public class Drivetrain extends Subsystem {
    WPI_TalonSRX talon_FL = new WPI_TalonSRX(RobotMap.TALON_PORT_FL);
    WPI_TalonSRX talon_FR = new WPI_TalonSRX(RobotMap.TALON_PORT_FR);
    WPI_TalonSRX talon_BL = new WPI_TalonSRX(RobotMap.TALON_PORT_BL);
    WPI_TalonSRX talon_BR = new WPI_TalonSRX(RobotMap.TALON_PORT_BR);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public WPI_TalonSRX getTalon(int num){
        switch(num) {
            case 1:
                return talon_FL;
            case 2:
                return talon_FR;
            case 3:
                return talon_BL;
            case 4:
                return talon_BR;
            default:
                return null;
        }
    }
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDrive());
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }
}

