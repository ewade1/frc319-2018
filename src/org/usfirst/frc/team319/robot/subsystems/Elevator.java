package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	private int[] elevatorFollowers = {12, 13};
    public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(11, elevatorFollowers);
    
    public Elevator() {
		
    	this.elevatorLead.setInverted(false);
	}
    
    public void initDefaultCommand() {
        setDefaultCommand(new ElevatorStop());
    }
    
    public void elevatorTest(ControlMode controlMode, double signal) {
    	elevatorLead.set(controlMode, signal);
    }
}
