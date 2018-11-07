package frc.team612.subsystems;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.team612.RobotMap;
import frc.team612.commands.DefaultDrive;


public class Drivetrain extends Subsystem {
    WPI_TalonSRX talon_FL = new WPI_TalonSRX(RobotMap.TALON_PORT_FL);
    WPI_TalonSRX talon_FR = new WPI_TalonSRX(RobotMap.TALON_PORT_FR);
    WPI_TalonSRX talon_BL = new WPI_TalonSRX(RobotMap.TALON_PORT_BL);
    WPI_TalonSRX talon_BR = new WPI_TalonSRX(RobotMap.TALON_PORT_BR);
    MecanumDrive drivetrain;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Drivetrain(){
        talon_FR.setNeutralMode(NeutralMode.Brake);
        talon_FL.setNeutralMode(NeutralMode.Brake);
        talon_BR.setNeutralMode(NeutralMode.Brake);
        talon_BL.setNeutralMode(NeutralMode.Brake);
      //  talon_FR.setInverted(true);
       // talon_BR.setInverted(true);
        drivetrain = new MecanumDrive(talon_FL, talon_BL, talon_FR, talon_BR);
    }

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
    public MecanumDrive getDriveTrain() {
        return drivetrain;
    }
    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDrive());
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
    }

}

