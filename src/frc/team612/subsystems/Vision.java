package frc.team612.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.team612.commands.VisionProcess;
import org.opencv.video.Video;
import org.opencv.videoio.VideoCapture;

import javax.swing.*;

public class Vision extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public static int[] HSV_LOW = {0,0,0};
    public static int[] HSV_HIGH = {255,255,255};

    public static VideoCapture camera = new VideoCapture(1);

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
       // setDefaultCommand(new VisionProcess());
    }
}

