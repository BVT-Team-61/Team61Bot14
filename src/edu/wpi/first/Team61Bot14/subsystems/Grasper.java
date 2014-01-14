/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Bot14.subsystems;

import edu.wpi.first.Team61Bot14.RobotMap;
import edu.wpi.first.Team61Bot14.commands.GraspReturn;
import edu.wpi.first.Team61Bot14.commands.GraspDoNothing;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Jack Cone
 */
public class Grasper extends Subsystem {
    
private boolean debugging = true;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
   
private Solenoid driveShift = new Solenoid (RobotMap.driveSolenoid) ;
private Solenoid armShift = new Solenoid (RobotMap.armSolenoid) ;
 

public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GraspDoNothing());
   
    
    }
    public void doNothing() {
        ;
    }
public void shiftToGraspOn ()
{
//insert command here     
    if (debugging) {
        System.out.println("shiftToDrive - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    driveShift.set(true);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
 }
public void shiftToGraspOff ()
{
//insert command here     
    if (debugging) {
        System.out.println("shiftToDrive - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    driveShift.set(false);
    if (debugging) {
        System.out.println("shiftToDrive - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
 }
public void shiftToReleaseOn ()

{
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    armShift.set(true);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
}       
public void shiftToReleaseOff ()

{
    if (debugging) {
        System.out.println("shiftToClimb - before");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
    armShift.set(false);

    if (debugging) {
        System.out.println("shiftToClimb - after");
        System.out.println("Drive Solenoid set to " + driveShift.get());
        System.out.println("Arm Solenoid set to  " + armShift.get());
    }
}           
        
        
        
}       
