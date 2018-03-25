package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (23.13,19.79,0.00)
	// (17.13,18.29,0.00)
	
    public ScaleToSwitchCubeLeftSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleToSwitchCubeLeftSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.595,11.910,10.000,0.000},
				{2.977,35.730,10.000,180.000},
				{8.337,71.460,10.000,180.000},
				{17.865,119.100,10.000,180.000},
				{32.752,178.650,10.000,180.000},
				{54.190,250.110,10.000,180.000},
				{83.370,333.480,10.000,180.000},
				{121.482,428.760,10.000,180.000},
				{169.717,535.950,10.000,180.001},
				{229.267,655.050,10.000,180.001},
				{301.323,786.060,10.000,180.002},
				{387.075,928.980,10.000,180.004},
				{487.714,1083.810,10.000,180.006},
				{604.432,1250.549,10.000,180.009},
				{738.420,1429.199,10.000,180.014},
				{890.868,1619.759,10.000,180.020},
				{1062.967,1822.229,10.000,180.028},
				{1255.909,2036.609,10.000,180.039},
				{1470.884,2262.899,10.000,180.053},
				{1709.084,2501.099,10.000,180.072},
				{1971.104,2739.299,10.000,180.095},
				{2256.944,2977.499,10.000,180.124},
				{2566.604,3215.699,10.000,180.160},
				{2900.084,3453.899,10.000,180.203},
				{3257.384,3692.098,10.000,180.254},
				{3638.503,3930.298,10.000,180.316},
				{4043.443,4168.498,10.000,180.387},
				{4472.203,4406.698,10.000,180.471},
				{4924.783,4644.898,10.000,180.567},
				{5401.183,4883.098,10.000,180.678},
				{5901.402,5121.298,10.000,180.803},
				{6425.442,5359.498,10.000,180.944},
				{6973.302,5597.698,10.000,181.103},
				{7544.982,5835.897,10.000,181.281},
				{8140.481,6074.097,10.000,181.478},
				{8759.801,6312.297,10.000,181.696},
				{9402.941,6550.497,10.000,181.936},
				{10069.901,6788.697,10.000,182.199},
				{10760.680,7026.897,10.000,182.486},
				{11475.280,7265.097,10.000,182.798},
				{12213.700,7503.297,10.000,183.135},
				{12975.939,7741.497,10.000,183.499},
				{13761.999,7979.697,10.000,183.890},
				{14571.879,8217.896,10.000,184.309},
				{15405.578,8456.096,10.000,184.756},
				{16263.098,8694.296,10.000,185.232},
				{17144.438,8932.496,10.000,185.736},
				{18049.597,9170.696,10.000,186.269},
				{18978.577,9408.896,10.000,186.831},
				{19931.376,9647.096,10.000,187.420},
				{20907.996,9885.296,10.000,188.037},
				{21908.436,10123.496,10.000,188.680},
				{22932.695,10361.696,10.000,189.348},
				{23980.775,10599.895,10.000,190.040},
				{25052.674,10838.095,10.000,190.754},
				{26148.394,11076.295,10.000,191.488},
				{27267.933,11314.495,10.000,192.240},
				{28411.293,11552.695,10.000,193.007},
				{29578.472,11790.895,10.000,193.786},
				{30769.472,12029.095,10.000,194.574},
				{31984.291,12267.295,10.000,195.369},
				{33222.931,12505.495,10.000,196.165},
				{34485.390,12743.694,10.000,196.960},
				{35771.074,12969.984,10.000,197.749},
				{37078.791,13184.364,10.000,198.528},
				{38407.351,13386.834,10.000,199.291},
				{39755.563,13577.394,10.000,200.034},
				{41122.235,13756.044,10.000,200.753},
				{42506.176,13922.784,10.000,201.444},
				{43906.196,14077.614,10.000,202.101},
				{45321.103,14220.534,10.000,202.723},
				{46749.707,14351.544,10.000,203.304},
				{48190.817,14470.644,10.000,203.842},
				{49643.241,14577.834,10.000,204.334},
				{51105.788,14673.114,10.000,204.777},
				{52577.268,14756.484,10.000,205.170},
				{54056.489,14827.944,10.000,205.509},
				{55542.261,14887.494,10.000,205.795},
				{57033.392,14935.134,10.000,206.024},
				{58528.692,14970.864,10.000,206.197},
				{60026.970,14994.684,10.000,206.312},
				{61527.033,15006.594,10.000,206.369},
				{63027.665,15006.040,10.000,206.367},
				{64527.646,14993.576,10.000,206.308},
				{66025.785,14969.202,10.000,206.190},
				{67520.891,14932.918,10.000,206.015},
				{69011.773,14884.724,10.000,205.782},
				{70497.240,14824.620,10.000,205.495},
				{71976.101,14752.606,10.000,205.153},
				{73447.166,14668.682,10.000,204.758},
				{74909.242,14572.849,10.000,204.312},
				{76361.140,14465.105,10.000,203.818},
				{77801.668,14345.451,10.000,203.278},
				{79229.635,14213.887,10.000,202.695},
				{80643.850,14070.413,10.000,202.072},
				{82043.122,13915.029,10.000,201.412},
				{83426.260,13747.736,10.000,200.721},
				{84792.073,13568.532,10.000,200.000},
				{86139.371,13377.418,10.000,199.256},
				{87466.962,13174.394,10.000,198.492},
				{88773.654,12959.460,10.000,197.713},
				{90058.258,12732.617,10.000,196.923},
				{91319.610,12494.417,10.000,196.128},
				{92557.141,12256.217,10.000,195.332},
				{93770.853,12018.017,10.000,194.538},
				{94960.745,11779.817,10.000,193.750},
				{96126.816,11541.617,10.000,192.971},
				{97269.068,11303.417,10.000,192.205},
				{98387.500,11065.217,10.000,191.454},
				{99482.112,10827.017,10.000,190.721},
				{100552.903,10588.817,10.000,190.008},
				{101599.875,10350.618,10.000,189.317},
				{102623.027,10112.418,10.000,188.650},
				{103622.359,9874.218,10.000,188.008},
				{104597.870,9636.018,10.000,187.392},
				{105549.562,9397.818,10.000,186.804},
				{106477.434,9159.618,10.000,186.244},
				{107381.486,8921.418,10.000,185.713},
				{108261.718,8683.218,10.000,185.210},
				{109118.130,8445.018,10.000,184.735},
				{109950.721,8206.819,10.000,184.289},
				{110759.493,7968.619,10.000,183.872},
				{111544.445,7730.419,10.000,183.482},
				{112305.577,7492.219,10.000,183.119},
				{113042.889,7254.019,10.000,182.783},
				{113756.381,7015.819,10.000,182.472},
				{114446.053,6777.619,10.000,182.187},
				{115111.905,6539.419,10.000,181.925},
				{115753.937,6301.219,10.000,181.686},
				{116372.149,6063.019,10.000,181.469},
				{116966.540,5824.820,10.000,181.273},
				{117537.112,5586.620,10.000,181.096},
				{118083.864,5348.420,10.000,180.938},
				{118606.796,5110.220,10.000,180.797},
				{119105.908,4872.020,10.000,180.672},
				{119581.200,4633.820,10.000,180.563},
				{120032.672,4395.620,10.000,180.467},
				{120460.324,4157.420,10.000,180.384},
				{120864.156,3919.220,10.000,180.313},
				{121244.168,3681.020,10.000,180.252},
				{121600.361,3442.821,10.000,180.201},
				{121932.733,3204.621,10.000,180.158},
				{122241.285,2966.421,10.000,180.123},
				{122526.017,2728.221,10.000,180.094},
				{122786.929,2490.021,10.000,180.071},
				{123024.049,2252.375,10.000,180.053},
				{123237.999,2026.639,10.000,180.038},
				{123429.972,1812.813,10.000,180.028},
				{123601.157,1610.897,10.000,180.019},
				{123752.747,1420.891,10.000,180.013},
				{123885.931,1242.795,10.000,180.009},
				{124001.901,1076.609,10.000,180.006},
				{124101.848,922.333,10.000,180.004},
				{124186.963,779.967,10.000,180.002},
				{124258.437,649.511,10.000,180.001},
				{124317.461,530.965,10.000,180.001},
				{124365.226,424.329,10.000,180.000},
				{124402.922,329.603,10.000,180.000},
				{124431.742,246.787,10.000,180.000},
				{124452.875,175.880,10.000,180.000},
				{124467.513,116.884,10.000,180.000},
				{124476.847,69.798,10.000,180.000},
				{124482.068,34.622,10.000,180.000},
				{124484.367,11.356,10.000,180.000},
				{124484.935,0.000,10.000,180.000},
				{124484.935,0.000,10.000,180.000}		};

}