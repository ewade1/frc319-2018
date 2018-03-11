package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitchPt4Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.13,13.08,0.00)
	// (4.03,13.08,0.00)
	
    public CenterToLeftSwitchPt4Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchPt4Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.443,-8.852,10.000,0.000},
				{-2.213,-17.705,10.000,0.000},
				{-6.197,-39.836,10.000,0.000},
				{-13.279,-70.819,10.000,0.000},
				{-24.344,-110.654,10.000,0.000},
				{-40.278,-159.342,10.000,0.000},
				{-61.966,-216.882,10.000,0.000},
				{-90.294,-283.275,10.000,0.000},
				{-126.146,-358.520,10.000,0.000},
				{-170.408,-442.617,10.000,0.000},
				{-223.964,-535.567,10.000,0.000},
				{-287.701,-637.369,10.000,0.000},
				{-362.503,-748.023,10.000,0.000},
				{-449.256,-867.529,10.000,0.000},
				{-548.845,-995.888,10.000,0.000},
				{-662.155,-1133.100,10.000,0.000},
				{-790.071,-1279.163,10.000,0.000},
				{-933.479,-1434.079,10.000,0.000},
				{-1093.264,-1597.848,10.000,0.000},
				{-1270.311,-1770.468,10.000,0.000},
				{-1465.062,-1947.515,10.000,0.000},
				{-1677.519,-2124.562,10.000,0.000},
				{-1907.680,-2301.609,10.000,0.000},
				{-2155.545,-2478.656,10.000,0.000},
				{-2421.115,-2655.702,10.000,0.000},
				{-2704.390,-2832.749,10.000,0.000},
				{-3005.370,-3009.796,10.000,0.000},
				{-3324.054,-3186.843,10.000,0.000},
				{-3660.443,-3363.890,10.000,0.000},
				{-4014.537,-3540.936,10.000,0.000},
				{-4386.335,-3717.983,10.000,0.000},
				{-4775.838,-3895.030,10.000,0.000},
				{-5183.046,-4072.077,10.000,0.000},
				{-5607.958,-4249.124,10.000,0.000},
				{-6050.575,-4426.171,10.000,0.000},
				{-6510.897,-4603.217,10.000,0.000},
				{-6988.923,-4780.264,10.000,0.000},
				{-7484.654,-4957.311,10.000,0.000},
				{-7998.090,-5134.358,10.000,0.000},
				{-8529.231,-5311.405,10.000,0.000},
				{-9078.076,-5488.452,10.000,0.000},
				{-9644.626,-5665.498,10.000,0.000},
				{-10228.438,-5838.119,10.000,0.000},
				{-10828.626,-6001.887,10.000,0.000},
				{-11444.307,-6156.803,10.000,0.000},
				{-12074.593,-6302.867,10.000,0.000},
				{-12718.601,-6440.078,10.000,0.000},
				{-13375.445,-6568.437,10.000,0.000},
				{-14044.239,-6687.944,10.000,0.000},
				{-14724.099,-6798.598,10.000,0.000},
				{-15414.139,-6900.400,10.000,0.000},
				{-16113.474,-6993.349,10.000,0.000},
				{-16821.219,-7077.447,10.000,0.000},
				{-17536.488,-7152.692,10.000,0.000},
				{-18258.396,-7219.084,10.000,0.000},
				{-18986.059,-7276.624,10.000,0.000},
				{-19718.590,-7325.312,10.000,0.000},
				{-20455.105,-7365.148,10.000,0.000},
				{-21194.718,-7396.131,10.000,0.000},
				{-21936.544,-7418.262,10.000,0.000},
				{-22679.698,-7431.540,10.000,0.000},
				{-23423.207,-7435.085,10.000,0.000},
				{-24166.096,-7428.897,10.000,0.000},
				{-24907.482,-7413.856,10.000,0.000},
				{-25646.478,-7389.962,10.000,0.000},
				{-26382.200,-7357.217,10.000,0.000},
				{-27113.762,-7315.619,10.000,0.000},
				{-27840.278,-7265.168,10.000,0.000},
				{-28560.865,-7205.865,10.000,0.000},
				{-29274.636,-7137.710,10.000,0.000},
				{-29980.706,-7060.703,10.000,0.000},
				{-30678.191,-6974.843,10.000,0.000},
				{-31366.204,-6880.131,10.000,0.000},
				{-32043.860,-6776.567,10.000,0.000},
				{-32710.275,-6664.150,10.000,0.000},
				{-33364.563,-6542.881,10.000,0.000},
				{-34005.839,-6412.760,10.000,0.000},
				{-34633.218,-6273.786,10.000,0.000},
				{-35245.814,-6125.960,10.000,0.000},
				{-35842.742,-5969.281,10.000,0.000},
				{-36423.117,-5803.750,10.000,0.000},
				{-36986.142,-5630.248,10.000,0.000},
				{-37531.462,-5453.202,10.000,0.000},
				{-38059.078,-5276.155,10.000,0.000},
				{-38568.988,-5099.108,10.000,0.000},
				{-39061.195,-4922.061,10.000,0.000},
				{-39535.696,-4745.014,10.000,0.000},
				{-39992.493,-4567.968,10.000,0.000},
				{-40431.585,-4390.921,10.000,0.000},
				{-40852.972,-4213.874,10.000,0.000},
				{-41256.655,-4036.827,10.000,0.000},
				{-41642.633,-3859.780,10.000,0.000},
				{-42010.906,-3682.733,10.000,0.000},
				{-42361.475,-3505.687,10.000,0.000},
				{-42694.339,-3328.640,10.000,0.000},
				{-43009.498,-3151.593,10.000,0.000},
				{-43306.953,-2974.546,10.000,0.000},
				{-43586.703,-2797.499,10.000,0.000},
				{-43848.748,-2620.452,10.000,0.000},
				{-44093.089,-2443.406,10.000,0.000},
				{-44319.724,-2266.359,10.000,0.000},
				{-44528.656,-2089.312,10.000,0.000},
				{-44719.882,-1912.265,10.000,0.000},
				{-44893.492,-1736.100,10.000,0.000},
				{-45050.016,-1565.241,10.000,0.000},
				{-45190.340,-1403.236,10.000,0.000},
				{-45315.348,-1250.082,10.000,0.000},
				{-45425.926,-1105.781,10.000,0.000},
				{-45522.959,-970.332,10.000,0.000},
				{-45607.333,-843.736,10.000,0.000},
				{-45679.932,-725.992,10.000,0.000},
				{-45741.642,-617.100,10.000,0.000},
				{-45793.348,-517.060,10.000,0.000},
				{-45835.935,-425.873,10.000,0.000},
				{-45870.289,-343.539,10.000,0.000},
				{-45897.295,-270.056,10.000,0.000},
				{-45917.838,-205.426,10.000,0.000},
				{-45932.802,-149.648,10.000,0.000},
				{-45943.075,-102.723,10.000,0.000},
				{-45949.540,-64.650,10.000,0.000},
				{-45953.083,-35.429,10.000,0.000},
				{-45954.589,-15.061,10.000,0.000},
				{-45954.943,-3.545,10.000,0.000},
				{-45954.943,-0.000,10.000,0.000}		};

}