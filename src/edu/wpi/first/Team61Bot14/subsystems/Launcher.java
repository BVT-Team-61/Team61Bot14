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
public class Launcher extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void kickUp() {
        // Fast as possible
    }
    
    public void kickDown() {
        // Less speed to reduce impact
    }
    
    public boolean getPos() {
        //returns current position of launcher
        // True is up - False is down
        return false;
    }
}
