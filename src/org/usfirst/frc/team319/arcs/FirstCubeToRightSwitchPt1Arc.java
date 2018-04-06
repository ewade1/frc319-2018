package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FirstCubeToRightSwitchPt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (8.00,12.58,60.00)
	// (5.50,9.08,0.00)
	
    public FirstCubeToRightSwitchPt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FirstCubeToRightSwitchPt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.550,-11.008,10.000,60.000},
				{-2.752,-33.025,10.000,60.000},
				{-7.706,-66.050,10.000,60.000},
				{-16.512,-110.083,10.000,60.000},
				{-30.273,-165.125,10.000,60.000},
				{-50.088,-231.175,10.000,60.000},
				{-77.058,-308.233,10.000,60.001},
				{-112.285,-396.300,10.000,60.002},
				{-156.869,-495.374,10.000,60.003},
				{-211.910,-605.458,10.000,60.005},
				{-278.511,-726.549,10.000,60.009},
				{-357.770,-858.649,10.000,60.015},
				{-450.791,-1001.757,10.000,60.024},
				{-558.672,-1155.874,10.000,60.037},
				{-681.966,-1309.990,10.000,60.056},
				{-820.670,-1464.107,10.000,60.080},
				{-974.787,-1618.223,10.000,60.113},
				{-1144.315,-1772.340,10.000,60.154},
				{-1329.255,-1926.456,10.000,60.207},
				{-1529.606,-2080.573,10.000,60.273},
				{-1745.369,-2234.689,10.000,60.353},
				{-1976.544,-2388.806,10.000,60.449},
				{-2223.131,-2542.922,10.000,60.564},
				{-2485.129,-2697.039,10.000,60.699},
				{-2762.538,-2851.155,10.000,60.856},
				{-3055.360,-3005.272,10.000,61.037},
				{-3363.593,-3159.388,10.000,61.245},
				{-3687.237,-3313.505,10.000,61.480},
				{-4026.294,-3467.621,10.000,61.745},
				{-4380.762,-3621.738,10.000,62.041},
				{-4750.641,-3775.854,10.000,62.371},
				{-5135.932,-3929.971,10.000,62.734},
				{-5536.635,-4084.087,10.000,63.133},
				{-5952.750,-4238.204,10.000,63.569},
				{-6384.276,-4392.320,10.000,64.042},
				{-6831.214,-4546.437,10.000,64.552},
				{-7293.563,-4700.553,10.000,65.100},
				{-7771.325,-4854.670,10.000,65.686},
				{-8264.497,-5008.786,10.000,66.309},
				{-8773.082,-5162.903,10.000,66.968},
				{-9297.078,-5317.019,10.000,67.663},
				{-9836.486,-5471.136,10.000,68.390},
				{-10391.305,-5625.252,10.000,69.150},
				{-10961.536,-5779.369,10.000,69.938},
				{-11547.179,-5933.485,10.000,70.752},
				{-12148.233,-6087.602,10.000,71.589},
				{-12764.699,-6241.718,10.000,72.446},
				{-13396.577,-6395.835,10.000,73.320},
				{-14043.866,-6549.951,10.000,74.205},
				{-14706.567,-6704.068,10.000,75.099},
				{-15384.680,-6858.184,10.000,75.997},
				{-16078.204,-7012.301,10.000,76.894},
				{-16787.140,-7166.417,10.000,77.788},
				{-17511.488,-7320.534,10.000,78.672},
				{-18251.247,-7474.650,10.000,79.544},
				{-19006.418,-7628.767,10.000,80.399},
				{-19777.000,-7782.883,10.000,81.234},
				{-20562.994,-7937.000,10.000,82.045},
				{-21364.400,-8091.116,10.000,82.828},
				{-22181.218,-8245.233,10.000,83.581},
				{-23013.447,-8399.349,10.000,84.300},
				{-23861.088,-8553.466,10.000,84.982},
				{-24724.140,-8707.582,10.000,85.625},
				{-25602.604,-8861.699,10.000,86.226},
				{-26496.480,-9015.815,10.000,86.782},
				{-27405.767,-9169.932,10.000,87.292},
				{-28330.466,-9324.048,10.000,87.752},
				{-29270.577,-9478.165,10.000,88.161},
				{-30226.099,-9632.281,10.000,88.515},
				{-31197.033,-9786.398,10.000,88.813},
				{-32183.379,-9940.514,10.000,89.051},
				{-33185.136,-10094.631,10.000,89.227},
				{-34202.305,-10248.747,10.000,89.336},
				{-35234.885,-10402.864,10.000,89.375},
				{-36282.327,-10545.972,10.000,89.339},
				{-37343.529,-10678.072,10.000,89.223},
				{-38417.391,-10799.164,10.000,89.023},
				{-39502.812,-10909.247,10.000,88.732},
				{-40598.690,-11008.322,10.000,88.344},
				{-41703.926,-11096.388,10.000,87.851},
				{-42817.417,-11173.446,10.000,87.246},
				{-43938.065,-11239.496,10.000,86.520},
				{-45064.766,-11294.538,10.000,85.661},
				{-46196.422,-11338.571,10.000,84.660},
				{-47331.930,-11371.596,10.000,83.504},
				{-48470.191,-11393.613,10.000,82.179},
				{-49610.055,-11403.671,10.000,80.671},
				{-50749.824,-11391.713,10.000,78.966},
				{-51887.847,-11368.746,10.000,77.052},
				{-53023.023,-11334.772,10.000,74.915},
				{-54154.251,-11289.788,10.000,72.548},
				{-55280.430,-11233.797,10.000,69.944},
				{-56400.460,-11166.797,10.000,67.107},
				{-57513.239,-11088.789,10.000,64.048},
				{-58617.667,-10999.772,10.000,60.791},
				{-59712.643,-10899.747,10.000,57.373},
				{-60797.066,-10788.714,10.000,53.841},
				{-61869.836,-10666.673,10.000,50.251},
				{-62929.850,-10533.623,10.000,46.667},
				{-63976.010,-10389.565,10.000,43.147},
				{-65007.260,-10235.448,10.000,39.746},
				{-66023.099,-10081.332,10.000,36.504},
				{-67023.527,-9927.215,10.000,33.449},
				{-68008.542,-9773.099,10.000,30.599},
				{-68978.147,-9618.982,10.000,27.958},
				{-69932.339,-9464.866,10.000,25.526},
				{-70871.120,-9310.749,10.000,23.295},
				{-71794.489,-9156.633,10.000,21.255},
				{-72702.446,-9002.516,10.000,19.392},
				{-73594.992,-8848.400,10.000,17.694},
				{-74472.126,-8694.283,10.000,16.145},
				{-75333.849,-8540.167,10.000,14.732},
				{-76180.160,-8386.050,10.000,13.444},
				{-77011.059,-8231.934,10.000,12.268},
				{-77826.546,-8077.817,10.000,11.194},
				{-78626.622,-7923.701,10.000,10.212},
				{-79411.287,-7769.584,10.000,9.313},
				{-80180.539,-7615.468,10.000,8.490},
				{-80934.380,-7461.351,10.000,7.736},
				{-81672.809,-7307.235,10.000,7.045},
				{-82395.827,-7153.118,10.000,6.410},
				{-83103.433,-6999.002,10.000,5.828},
				{-83795.627,-6844.885,10.000,5.293},
				{-84472.410,-6690.769,10.000,4.802},
				{-85133.781,-6536.652,10.000,4.351},
				{-85779.741,-6382.536,10.000,3.937},
				{-86410.288,-6228.419,10.000,3.556},
				{-87025.424,-6074.303,10.000,3.207},
				{-87625.149,-5920.186,10.000,2.887},
				{-88209.462,-5766.070,10.000,2.594},
				{-88778.363,-5611.953,10.000,2.325},
				{-89331.852,-5457.837,10.000,2.079},
				{-89869.930,-5303.720,10.000,1.854},
				{-90392.596,-5149.604,10.000,1.649},
				{-90899.851,-4995.487,10.000,1.462},
				{-91391.694,-4841.371,10.000,1.292},
				{-91868.125,-4687.254,10.000,1.138},
				{-92329.145,-4533.138,10.000,0.998},
				{-92774.753,-4379.021,10.000,0.872},
				{-93204.949,-4224.905,10.000,0.759},
				{-93619.734,-4070.788,10.000,0.657},
				{-94019.107,-3916.672,10.000,0.566},
				{-94403.068,-3762.555,10.000,0.485},
				{-94771.618,-3608.439,10.000,0.413},
				{-95124.756,-3454.322,10.000,0.349},
				{-95462.482,-3300.206,10.000,0.293},
				{-95784.797,-3146.089,10.000,0.244},
				{-96091.700,-2991.973,10.000,0.202},
				{-96383.192,-2837.856,10.000,0.165},
				{-96659.271,-2683.740,10.000,0.134},
				{-96919.939,-2529.623,10.000,0.107},
				{-97165.196,-2375.507,10.000,0.085},
				{-97395.041,-2221.390,10.000,0.066},
				{-97609.474,-2067.274,10.000,0.051},
				{-97808.496,-1913.157,10.000,0.038},
				{-97992.105,-1759.041,10.000,0.029},
				{-98160.304,-1604.924,10.000,0.021},
				{-98313.090,-1450.808,10.000,0.015},
				{-98450.465,-1296.691,10.000,0.010},
				{-98572.429,-1142.575,10.000,0.007},
				{-98679.028,-989.408,10.000,0.004},
				{-98770.861,-847.250,10.000,0.003},
				{-98849.028,-716.100,10.000,0.002},
				{-98914.631,-595.958,10.000,0.001},
				{-98968.770,-486.825,10.000,0.001},
				{-99012.546,-388.700,10.000,0.000},
				{-99047.061,-301.583,10.000,0.000},
				{-99073.414,-225.475,10.000,0.000},
				{-99092.706,-160.375,10.000,0.000},
				{-99106.039,-106.283,10.000,0.000},
				{-99114.513,-63.200,10.000,0.000},
				{-99119.229,-31.125,10.000,0.000},
				{-99121.289,-10.058,10.000,0.000},
				{-99121.792,-0.000,10.000,-0.000},
				{-99121.792,-0.000,10.000,-0.000}		};

}