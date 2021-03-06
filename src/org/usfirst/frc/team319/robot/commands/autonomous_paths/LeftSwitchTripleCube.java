package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.FirstCubeToLeftSwitchPt1Arc;
import org.usfirst.frc.team319.arcs.FirstCubeToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToLeftScaleArc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToRightScalePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToRightScalePt2Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToFirstCubePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToFirstCubePt2Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToRightScaleArc;
import org.usfirst.frc.team319.arcs.LeftSwitchToSecondCubePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToSecondCubePt2Arc;
import org.usfirst.frc.team319.arcs.TripleCubeCenterToLeftSwitchArc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.GoToCollectSecondLevelCubePose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSwitchTripleCube extends CommandGroup {

    public LeftSwitchTripleCube(GameState gameState) {
       
    	addParallel(new GoToSwitchPose(0.0));
    	addSequential(new FollowArc(new TripleCubeCenterToLeftSwitchArc()));
    	addParallel(new CubeCollectorSpit(-.75), 0.2);
    	addSequential(new FollowArc(new LeftSwitchToFirstCubePt1Arc()));
    	addSequential(new GoToCollectPose(0.0));
    	addParallel(new AutoCollectCubeClosed(false));
    	addSequential(new FollowArc(new LeftSwitchToFirstCubePt2Arc()));
    	/*
    	addSequential(new FollowArc(new FirstCubeToLeftSwitchPt1Arc()));
    	addParallel(new GoToCollectPose(0.0));
    	addSequential(new FollowArc(new FirstCubeToLeftSwitchPt2Arc()));
    	addParallel(new CubeCollectorSpit(-0.75), 0.2);
    	addSequential(new FollowArc(new LeftSwitchToSecondCubePt1Arc()));
    	
    	
    	if (gameState.scaleSide == Side.LEFT) {
    		addParallel(new GoToCollectSecondLevelCubePose());
        	addParallel(new AutoCollectCubeClosed(true));
    		addSequential(new FollowArc(new LeftSwitchToSecondCubePt2Arc()));
			addSequential(new FollowArc(new LeftSecondCubeToLeftScaleArc()));
		}else {
			addParallel(new GoToCollectPose(0.0));
	    	addParallel(new AutoCollectCubeClosed(true));
			addSequential(new FollowArc(new LeftSwitchToRightScaleArc()));
		}
    	*/
    }
}
