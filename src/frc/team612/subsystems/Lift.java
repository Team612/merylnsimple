package frc.team612.subsystems;


import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;
import frc.team612.commands.DefaultLift;

public class Lift extends Subsystem {
    WPI_TalonSRX lift_talon = new WPI_TalonSRX(RobotMap.talon_lift);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.



    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
            setDefaultCommand(new DefaultLift());
        lift_talon.setNeutralMode(NeutralMode.Brake);

        lift_talon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 300);

        lift_talon.selectProfileSlot(0, 0);

        lift_talon.config_kF(0, 0.2, 100); //The 100 is the time out

        lift_talon.config_kP(0, 1.3, 100);//for setting  the configuration.(in milliseconds).

        lift_talon.config_kI(0, 0, 100);

        lift_talon.config_kD(0, 0,100);

    }
    public WPI_TalonSRX getTalon(){
        return lift_talon;
    }

}

