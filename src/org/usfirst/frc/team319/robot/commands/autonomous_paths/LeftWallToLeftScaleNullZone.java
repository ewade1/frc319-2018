package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToLeftScaleNullZoneArc;
import org.usfirst.frc.team319.arcs.RightWallToRightScaleNullZoneArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.GoToCollectPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 
 */
public class LeftWallToLeftScaleNullZone extends CommandGroup {

    public LeftWallToLeftScaleNullZone() {
      
    	addSequential(new FollowArc(new LeftWallToLeftScaleNullZoneArc()));
    	addSequential(new GoToDunkPose(0.0));
    	addSequential(new CubeCollectorSpit(-0.75), 0.5);
    	addSequential(new GoToCollectPose());
    	
    	
    }
}
