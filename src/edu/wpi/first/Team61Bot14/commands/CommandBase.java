package edu.wpi.first.Team61Bot14.commands;

import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.Team61Bot14.OI;
import edu.wpi.first.Team61Bot14.subsystems.DriveTrain;
import edu.wpi.first.Team61Bot14.subsystems.Arm;
import edu.wpi.first.Team61Bot14.subsystems.Shifter;
import edu.wpi.first.Team61Bot14.subsystems.Launcher;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    //public static ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    public static DriveTrain drivetrain = new DriveTrain();
    public static Arm arm = new Arm();
    public static Launcher launcher = new Launcher();
    public static Shifter shifter = new Shifter();
    
    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(exampleSubsystem);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
