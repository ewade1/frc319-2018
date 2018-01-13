package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.robot.commands.WristTest;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wrist extends Subsystem {

   public final BobTalonSRX wristMotor = new BobTalonSRX(1);
   
   public Wrist() {
	   
	   this.wristMotor.setInverted(false);
	   
}	
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new WristTest());
    }
    
    public void wristMove(ControlMode controlMode, double signal) {
    	wristMotor.set(controlMode, signal);
    }
}

