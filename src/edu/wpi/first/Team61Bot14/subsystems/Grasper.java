/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Bot14.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author William
 */
public class Grasper extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void graspIn() {
        
    }
    
    public void graspOut() {
        
    }

    public boolean getGrasp() {
        //returns grasp state
        //True if grasped - False if released
        return false;
    }
    
}
