package org.usfirst.frc.team319.robot.commands.wrist;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WristGoToSwitch extends Command {
	
	int targetPosition = 1000;
	
    public WristGoToSwitch() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.wrist);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		System.out.println("command called");
    	    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.wrist.wristMove(ControlMode.MotionMagic, targetPosition);	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.wrist.isWristInPostion(targetPosition);
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("wrist ended");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
