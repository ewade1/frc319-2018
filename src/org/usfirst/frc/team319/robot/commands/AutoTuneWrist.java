package org.usfirst.frc.team319.robot.commands;



import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoTuneWrist extends CommandGroup {

    public AutoTuneWrist() {

    	addSequential(new AutoTuneVelocityConfigure(Robot.wrist, Robot.wrist.wristMotor, 
    			Robot.wrist.WRIST_PROFILE, FeedbackDevice.CTRE_MagEncoder_Relative, true, false));

    	addSequential(new AutoTuneVelocity(Robot.wrist, Robot.wrist.wristMotor,
    			Robot.wrist.WRIST_PROFILE, 850, 50));
    }
}