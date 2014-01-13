/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Bot14.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 * @author William
 */
public class DriveTrain extends PIDSubsystem  {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static final double Kp = 0.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;

    public DriveTrain() {
        super("DriveTrain", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double left, double right) {
    
    }
    
    public void reversedTankDrive(double left, double right) {
        
    }
    
    public void moveLeftMotor(double speed) {
    
    }

    public void moveRightMotor(double speed) {
        
    }
    
    protected double returnPIDInput() {
        // Nothing
        return 0.0;
    }

    protected void usePIDOutput(double output) {
        // Nothing
    }
}
