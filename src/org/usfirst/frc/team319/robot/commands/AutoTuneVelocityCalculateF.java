package org.usfirst.frc.team319.robot.commands;


import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.utils.BobCircularBuffer;
import org.usfirst.frc.team319.utils.HelperFunctions;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocityCalculateF extends Command {

	private int samplesRequired;
	private int samplesGathered = 0;
	private int paramterSlot = 0;
	
	private BobTalonSRX _talon;
	private StringBuilder _sb;
	private BobCircularBuffer cBuff;
    
    public AutoTuneVelocityCalculateF(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot, int numSamplesRequired) {
    	this._talon = talon;
    	this.samplesRequired = numSamplesRequired;
    	this.cBuff = new BobCircularBuffer(samplesRequired);
    	this.paramterSlot = srxParameterSlot;
    	requires(requiredSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Gathering Data...");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double outputSignal = _talon.getMotorOutputVoltage() / _talon.getBusVoltage();
    	double speed = _talon.getSelectedSensorVelocity(0);
    	
    	cBuff.addLast(speed);
    	samplesGathered++;
    	
    	_sb.append("\tOutput: ");
    	_sb.append(outputSignal);
    	_sb.append("\tSpeed: ");
    	_sb.append(speed);
    	
    	System.out.println(_sb.toString());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return samplesGathered >= samplesRequired;
    }

    // Called once after isFinished returns true
    protected void end() {
    	double kF = 1023 / HelperFunctions.mean(cBuff.toArray());
    	_talon.config_kF(paramterSlot, kF);
    	System.out.println("Calculated F gain = " + kF);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	_talon.set(ControlMode.PercentOutput, 0);
    }
}