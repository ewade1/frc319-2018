package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightSwitchPt2 extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (2.00,-1.00,-30.00)

	public RightWallToRightSwitchPt2() {
		this(false);
	}

	public RightWallToRightSwitchPt2(boolean flipped) {
		super();

		double[][] leftPoints = { { 0.141, 2.818, 10.000 }, { 0.705, 5.637, 10.000 }, { 1.974, 12.690, 10.000 },
				{ 4.232, 22.581, 10.000 }, { 7.766, 35.339, 10.000 }, { 12.866, 51.006, 10.000 },
				{ 19.831, 69.648, 10.000 }, { 28.823, 89.924, 10.000 }, { 39.871, 110.481, 10.000 },
				{ 53.009, 131.379, 10.000 }, { 68.277, 152.676, 10.000 }, { 85.720, 174.431, 10.000 },
				{ 105.390, 196.698, 10.000 }, { 127.343, 219.531, 10.000 }, { 151.641, 242.982, 10.000 },
				{ 178.351, 267.102, 10.000 }, { 207.545, 291.937, 10.000 }, { 239.298, 317.534, 10.000 },
				{ 273.692, 343.936, 10.000 }, { 310.810, 371.184, 10.000 }, { 350.742, 399.319, 10.000 },
				{ 393.580, 428.378, 10.000 }, { 439.419, 458.395, 10.000 }, { 488.360, 489.406, 10.000 },
				{ 540.504, 521.441, 10.000 }, { 595.957, 554.531, 10.000 }, { 654.828, 588.705, 10.000 },
				{ 717.227, 623.990, 10.000 }, { 783.268, 660.411, 10.000 }, { 853.067, 697.992, 10.000 },
				{ 926.742, 736.755, 10.000 }, { 1004.415, 776.720, 10.000 }, { 1086.205, 817.907, 10.000 },
				{ 1172.238, 860.331, 10.000 }, { 1262.639, 904.006, 10.000 }, { 1357.533, 948.943, 10.000 },
				{ 1457.048, 995.147, 10.000 }, { 1561.310, 1042.621, 10.000 }, { 1670.446, 1091.361, 10.000 },
				{ 1784.582, 1141.357, 10.000 }, { 1903.841, 1192.592, 10.000 }, { 2028.345, 1245.038, 10.000 },
				{ 2158.211, 1298.656, 10.000 }, { 2293.550, 1353.395, 10.000 }, { 2434.469, 1409.188, 10.000 },
				{ 2581.064, 1465.950, 10.000 }, { 2733.422, 1523.578, 10.000 }, { 2891.616, 1581.943, 10.000 },
				{ 3055.706, 1640.895, 10.000 }, { 3225.731, 1700.255, 10.000 }, { 3401.712, 1759.812, 10.000 },
				{ 3583.645, 1819.327, 10.000 }, { 3771.498, 1878.526, 10.000 }, { 3965.208, 1937.104, 10.000 },
				{ 4164.680, 1994.720, 10.000 }, { 4369.781, 2051.006, 10.000 }, { 4580.337, 2105.564, 10.000 },
				{ 4796.134, 2157.974, 10.000 }, { 5016.914, 2207.799, 10.000 }, { 5242.374, 2254.595, 10.000 },
				{ 5472.166, 2297.919, 10.000 }, { 5705.900, 2337.340, 10.000 }, { 5943.145, 2372.453, 10.000 },
				{ 6183.433, 2402.885, 10.000 }, { 6426.265, 2428.314, 10.000 }, { 6671.112, 2448.473, 10.000 },
				{ 6917.428, 2463.161, 10.000 }, { 7164.653, 2472.249, 10.000 }, { 7412.221, 2475.683, 10.000 },
				{ 7659.570, 2473.483, 10.000 }, { 7906.144, 2465.742, 10.000 }, { 8151.406, 2452.617, 10.000 },
				{ 8394.838, 2434.322, 10.000 }, { 8635.709, 2408.708, 10.000 }, { 8873.106, 2373.977, 10.000 },
				{ 9106.205, 2330.987, 10.000 }, { 9334.269, 2280.638, 10.000 }, { 9556.653, 2223.843, 10.000 },
				{ 9772.804, 2161.506, 10.000 }, { 9982.099, 2092.951, 10.000 }, { 10184.020, 2019.214, 10.000 },
				{ 10378.292, 1942.718, 10.000 }, { 10564.709, 1864.170, 10.000 }, { 10743.130, 1784.215, 10.000 },
				{ 10913.474, 1703.434, 10.000 }, { 11075.709, 1622.349, 10.000 }, { 11229.972, 1542.636, 10.000 },
				{ 11376.578, 1466.053, 10.000 }, { 11515.870, 1392.927, 10.000 }, { 11648.190, 1323.192, 10.000 },
				{ 11773.867, 1256.776, 10.000 }, { 11893.228, 1193.608, 10.000 }, { 12006.590, 1133.620, 10.000 },
				{ 12114.264, 1076.744, 10.000 }, { 12216.556, 1022.914, 10.000 }, { 12313.762, 972.066, 10.000 },
				{ 12406.176, 924.135, 10.000 }, { 12494.082, 879.059, 10.000 }, { 12577.759, 836.772, 10.000 },
				{ 12657.480, 797.207, 10.000 }, { 12733.509, 760.295, 10.000 }, { 12806.105, 725.960, 10.000 },
				{ 12875.518, 694.125, 10.000 }, { 12941.988, 664.705, 10.000 }, { 13005.749, 637.611, 10.000 },
				{ 13067.024, 612.747, 10.000 }, { 13126.025, 590.011, 10.000 }, { 13182.955, 569.297, 10.000 },
				{ 13238.004, 550.491, 10.000 }, { 13291.351, 533.474, 10.000 }, { 13343.164, 518.125, 10.000 },
				{ 13393.596, 504.318, 10.000 }, { 13442.788, 491.922, 10.000 }, { 13490.869, 480.808, 10.000 },
				{ 13537.953, 470.842, 10.000 }, { 13584.142, 461.892, 10.000 }, { 13629.525, 453.827, 10.000 },
				{ 13674.177, 446.517, 10.000 }, { 13718.160, 439.834, 10.000 }, { 13761.525, 433.655, 10.000 },
				{ 13804.311, 427.859, 10.000 }, { 13846.544, 422.330, 10.000 }, { 13888.240, 416.959, 10.000 },
				{ 13929.405, 411.642, 10.000 }, { 13970.033, 406.280, 10.000 }, { 14010.111, 400.782, 10.000 },
				{ 14049.617, 395.062, 10.000 }, { 14088.521, 389.043, 10.000 }, { 14126.787, 382.654, 10.000 },
				{ 14164.370, 375.832, 10.000 }, { 14201.222, 368.519, 10.000 }, { 14237.288, 360.668, 10.000 },
				{ 14272.512, 352.236, 10.000 }, { 14306.831, 343.188, 10.000 }, { 14340.180, 333.496, 10.000 },
				{ 14372.494, 323.140, 10.000 }, { 14403.705, 312.105, 10.000 }, { 14433.743, 300.383, 10.000 },
				{ 14462.540, 287.972, 10.000 }, { 14490.028, 274.877, 10.000 }, { 14516.139, 261.109, 10.000 },
				{ 14540.807, 246.681, 10.000 }, { 14563.969, 231.617, 10.000 }, { 14585.563, 215.940, 10.000 },
				{ 14605.531, 199.681, 10.000 }, { 14623.819, 182.876, 10.000 }, { 14640.375, 165.563, 10.000 },
				{ 14655.153, 147.783, 10.000 }, { 14668.111, 129.582, 10.000 }, { 14679.212, 111.008, 10.000 },
				{ 14688.423, 92.113, 10.000 }, { 14695.718, 72.950, 10.000 }, { 14701.183, 54.649, 10.000 },
				{ 14705.052, 38.682, 10.000 }, { 14707.595, 25.435, 10.000 }, { 14709.091, 14.954, 10.000 },
				{ 14709.817, 7.267, 10.000 }, { 14710.056, 2.389, 10.000 }, { 14710.089, 0.327, 10.000 },
				{ 14710.089, 0.000, 10.000 } };

		double[][] rightPoints = { { 0.141, 2.818, 10.000 }, { 0.704, 5.635, 10.000 }, { 1.972, 12.672, 10.000 },
				{ 4.222, 22.506, 10.000 }, { 7.733, 35.110, 10.000 }, { 12.777, 50.440, 10.000 },
				{ 19.620, 68.432, 10.000 }, { 28.381, 87.606, 10.000 }, { 39.031, 106.501, 10.000 },
				{ 51.536, 125.054, 10.000 }, { 65.857, 143.207, 10.000 }, { 81.947, 160.904, 10.000 },
				{ 99.756, 178.089, 10.000 }, { 119.227, 194.707, 10.000 }, { 140.298, 210.706, 10.000 },
				{ 162.901, 226.038, 10.000 }, { 186.967, 240.654, 10.000 }, { 212.418, 254.508, 10.000 },
				{ 239.173, 267.558, 10.000 }, { 267.150, 279.760, 10.000 }, { 296.257, 291.077, 10.000 },
				{ 326.404, 301.469, 10.000 }, { 357.494, 310.903, 10.000 }, { 389.429, 319.344, 10.000 },
				{ 422.105, 326.759, 10.000 }, { 455.417, 333.120, 10.000 }, { 489.256, 338.397, 10.000 },
				{ 523.513, 342.564, 10.000 }, { 558.072, 345.594, 10.000 }, { 592.819, 347.464, 10.000 },
				{ 627.634, 348.152, 10.000 }, { 662.398, 347.638, 10.000 }, { 696.988, 345.902, 10.000 },
				{ 731.281, 342.929, 10.000 }, { 765.151, 338.705, 10.000 }, { 798.473, 333.219, 10.000 },
				{ 831.120, 326.466, 10.000 }, { 862.964, 318.443, 10.000 }, { 893.880, 309.154, 10.000 },
				{ 923.740, 298.608, 10.000 }, { 952.423, 286.824, 10.000 }, { 979.806, 273.828, 10.000 },
				{ 1005.772, 259.661, 10.000 }, { 1030.209, 244.372, 10.000 }, { 1053.012, 228.030, 10.000 },
				{ 1074.084, 210.718, 10.000 }, { 1093.338, 192.541, 10.000 }, { 1110.700, 173.625, 10.000 },
				{ 1126.113, 154.123, 10.000 }, { 1139.534, 134.214, 10.000 }, { 1150.944, 114.106, 10.000 },
				{ 1160.349, 94.040, 10.000 }, { 1167.778, 74.290, 10.000 }, { 1173.294, 55.162, 10.000 },
				{ 1176.993, 36.995, 10.000 }, { 1179.009, 20.158, 10.000 }, { 1179.514, 5.050, 10.000 },
				{ 1180.305, 7.911, 10.000 }, { 1182.134, 18.286, 10.000 }, { 1184.697, 25.633, 10.000 },
				{ 1187.648, 29.508, 10.000 }, { 1190.596, 29.480, 10.000 }, { 1193.110, 25.143, 10.000 },
				{ 1194.723, 16.125, 10.000 }, { 1194.933, 2.104, 10.000 }, { 1196.652, 17.188, 10.000 },
				{ 1200.847, 41.951, 10.000 }, { 1208.078, 72.314, 10.000 }, { 1218.912, 108.331, 10.000 },
				{ 1233.910, 149.983, 10.000 }, { 1253.628, 197.177, 10.000 }, { 1278.603, 249.755, 10.000 },
				{ 1309.353, 307.503, 10.000 }, { 1346.328, 369.752, 10.000 }, { 1389.877, 435.483, 10.000 },
				{ 1440.260, 503.837, 10.000 }, { 1497.652, 573.915, 10.000 }, { 1562.132, 644.802, 10.000 },
				{ 1633.692, 715.597, 10.000 }, { 1712.173, 784.808, 10.000 }, { 1797.313, 851.400, 10.000 },
				{ 1888.824, 915.116, 10.000 }, { 1986.349, 975.246, 10.000 }, { 2089.464, 1031.148, 10.000 },
				{ 2197.688, 1082.240, 10.000 }, { 2310.487, 1127.998, 10.000 }, { 2427.379, 1168.914, 10.000 },
				{ 2547.984, 1206.047, 10.000 }, { 2671.956, 1239.722, 10.000 }, { 2798.956, 1270.006, 10.000 },
				{ 2928.654, 1296.971, 10.000 }, { 3060.722, 1320.688, 10.000 }, { 3194.845, 1341.224, 10.000 },
				{ 3330.710, 1358.649, 10.000 }, { 3468.012, 1373.028, 10.000 }, { 3606.455, 1384.424, 10.000 },
				{ 3745.745, 1392.903, 10.000 }, { 3885.598, 1398.528, 10.000 }, { 4025.734, 1401.364, 10.000 },
				{ 4165.882, 1401.477, 10.000 }, { 4305.776, 1398.938, 10.000 }, { 4445.158, 1393.821, 10.000 },
				{ 4583.779, 1386.205, 10.000 }, { 4721.396, 1376.174, 10.000 }, { 4857.778, 1363.817, 10.000 },
				{ 4992.701, 1349.230, 10.000 }, { 5125.952, 1332.514, 10.000 }, { 5257.330, 1313.777, 10.000 },
				{ 5386.643, 1293.132, 10.000 }, { 5513.713, 1270.698, 10.000 }, { 5638.372, 1246.595, 10.000 },
				{ 5760.467, 1220.952, 10.000 }, { 5879.857, 1193.897, 10.000 }, { 5996.413, 1165.560, 10.000 },
				{ 6110.021, 1136.075, 10.000 }, { 6220.578, 1105.574, 10.000 }, { 6327.997, 1074.187, 10.000 },
				{ 6432.201, 1042.046, 10.000 }, { 6533.129, 1009.278, 10.000 }, { 6630.730, 976.007, 10.000 },
				{ 6724.965, 942.352, 10.000 }, { 6815.808, 908.429, 10.000 }, { 6903.243, 874.349, 10.000 },
				{ 6987.264, 840.215, 10.000 }, { 7067.877, 806.126, 10.000 }, { 7145.094, 772.174, 10.000 },
				{ 7218.939, 738.442, 10.000 }, { 7289.440, 705.010, 10.000 }, { 7356.634, 671.948, 10.000 },
				{ 7420.566, 639.319, 10.000 }, { 7481.284, 607.180, 10.000 }, { 7538.842, 575.580, 10.000 },
				{ 7593.298, 544.562, 10.000 }, { 7644.714, 514.158, 10.000 }, { 7693.154, 484.399, 10.000 },
				{ 7738.685, 455.304, 10.000 }, { 7781.373, 426.888, 10.000 }, { 7821.289, 399.159, 10.000 },
				{ 7858.501, 372.118, 10.000 }, { 7893.077, 345.762, 10.000 }, { 7925.085, 320.079, 10.000 },
				{ 7954.591, 295.055, 10.000 }, { 7981.658, 270.669, 10.000 }, { 8006.347, 246.895, 10.000 },
				{ 8028.717, 223.702, 10.000 }, { 8048.823, 201.056, 10.000 }, { 8066.715, 178.918, 10.000 },
				{ 8082.439, 157.247, 10.000 }, { 8096.039, 135.997, 10.000 }, { 8107.551, 115.119, 10.000 },
				{ 8117.007, 94.563, 10.000 }, { 8124.435, 74.275, 10.000 }, { 8129.964, 55.289, 10.000 },
				{ 8133.859, 38.953, 10.000 }, { 8136.412, 25.531, 10.000 }, { 8137.910, 14.980, 10.000 },
				{ 8138.637, 7.271, 10.000 }, { 8138.876, 2.389, 10.000 }, { 8138.909, 0.327, 10.000 },
				{ 8138.909, 0.000, 10.000 } };

		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}