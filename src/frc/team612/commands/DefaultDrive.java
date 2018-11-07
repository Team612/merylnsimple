package frc.team612.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.team612.OI;
import frc.team612.Robot;


public class DefaultDrive extends Command {

    final double DEADZONE = 0.07;
    public static double magnitude;
    public static double angle;
    public static double rotation;
    double direction_x;
    double direction_y;
    public DefaultDrive() {
        requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }


    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {
    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    protected  void doDead(){
        if(Math.abs(direction_x) < DEADZONE){
            direction_x =0;
        }
        if(Math.abs(direction_y) < DEADZONE){
            direction_y=0;
        }
        if(Math.abs(rotation) < DEADZONE){
            rotation =0;
        }
    }
    protected void getInput() {

        direction_y = OI.driver.getX(GenericHID.Hand.kLeft) ;
        direction_x = OI.driver.getY(GenericHID.Hand.kLeft) *-1;
        rotation    = OI.driver.getX(GenericHID.Hand.kRight);

    }
    protected void toPolar() {
        magnitude = Math.sqrt(direction_x * direction_x + direction_y * direction_y);
        if (magnitude > 1.0) {
            magnitude = 1.0;
        }
        angle = Math.atan2(direction_y, direction_x) * 180 / Math.PI;
    }
    protected void execute() {
        getInput();
        toPolar();
        doDead();
        Robot.drivetrain.getDriveTrain().drivePolar(magnitude, angle, rotation);
       // Robot.drivetrain.getTalon(1).set(Robot.oi.driver.getY(GenericHID.Hand.kLeft));
        //  Robot.drivetrain.getTalon(3).set(Robot.oi.driver.getY(GenericHID.Hand.kLeft));
        //Robot.drivetrain.getTalon(2).set((Robot.oi.driver.getY(GenericHID.Hand.kRight)));
        //Robot.drivetrain.getTalon(4).set((Robot.oi.driver.getY(GenericHID.Hand.kRight)));
        //System.out.println(Robot.oi.driver.getY(GenericHID.Hand.kRight) + "this is right ");





       // System.out.println("WORKING");
    }


    /**
     * <p>
     * Returns whether this command is finished. If it is, then the command will be removed and
     * {@link #end()} will be called.
     * </p><p>
     * It may be useful for a team to reference the {@link #isTimedOut()}
     * method for time-sensitive commands.
     * </p><p>
     * Returning false will result in the command never ending automatically. It may still be
     * cancelled manually or interrupted by another command. Returning true will result in the
     * command executing once and finishing immediately. It is recommended to use
     * {@link edu.wpi.first.wpilibj.command.InstantCommand} (added in 2017) for this.
     * </p>
     *
     * @return whether this command is finished.
     * @see Command#isTimedOut() isTimedOut()
     */
    @Override
    protected boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }


    /**
     * Called once when the command ended peacefully; that is it is called once
     * after {@link #isFinished()} returns true. This is where you may want to
     * wrap up loose ends, like shutting off a motor that was being used in the
     * command.
     */
    @Override
    protected void end() {
        //Robot.drivetrain.getDriveTrain().driveCartesian(0,  0,  0);
       // System.out.print("END");
    }


    /**
     * <p>
     * Called when the command ends because somebody called {@link #cancel()} or
     * another command shared the same requirements as this one, and booted it out. For example,
     * it is called when another command which requires one or more of the same
     * subsystems is scheduled to run.
     * </p><p>
     * This is where you may want to wrap up loose ends, like shutting off a motor that was being
     * used in the command.
     * </p><p>
     * Generally, it is useful to simply call the {@link #end()} method within this
     * method, as done here.
     * </p>
     */
    @Override
    protected void interrupted() {
       // Robot.drivetrain.getDriveTrain().driveCartesian(0,  0,  0);
        super.interrupted();
    }
}
