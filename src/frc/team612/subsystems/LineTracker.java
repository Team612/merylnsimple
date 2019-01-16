package frc.team612.subsystems;


import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team612.RobotMap;
import frc.team612.commands.ReadLine;

public class LineTracker extends Subsystem {

    public static AnalogInput frontLeftLT = new AnalogInput(RobotMap.frontLeftLineTracker);
    public static AnalogInput frontRightLT = new AnalogInput(RobotMap.frontRightLineTracker);
    public static AnalogInput backCenterLT = new AnalogInput(RobotMap.backCenterLineTracker);


    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new ReadLine());
    }
}

