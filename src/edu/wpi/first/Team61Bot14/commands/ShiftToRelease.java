/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Bot14.commands;

/**
 *
 * @author Jack Cone
 */
public class ShiftToRelease extends CommandBase {
    
    public ShiftToRelease() {
        // Use requires() here to declare subsystem dependencies
         requires(shifter);
         setTimeout(0.2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    shifter.shiftToGraspOn();
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once aftisTimedOut()er isFinished returns true
    protected void end() {
        shifter.shiftToGraspOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
