package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt3 extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.25,5.25,45.00)

	public CenterToRightSwitchPt3() {
		this(false);
	}

	public CenterToRightSwitchPt3(boolean flipped) {
		super();

		double[][] leftPoints = { { 0.125, 2.508, 10.000 }, { 0.627, 5.016, 10.000 }, { 1.755, 11.285, 10.000 },
				{ 3.762, 20.061, 10.000 }, { 6.896, 31.342, 10.000 }, { 11.408, 45.125, 10.000 },
				{ 17.549, 61.406, 10.000 }, { 25.567, 80.180, 10.000 }, { 35.711, 101.439, 10.000 },
				{ 48.228, 125.174, 10.000 }, { 63.365, 151.372, 10.000 }, { 81.367, 180.020, 10.000 },
				{ 102.477, 211.100, 10.000 }, { 126.936, 244.592, 10.000 }, { 154.984, 280.473, 10.000 },
				{ 186.855, 318.715, 10.000 }, { 222.784, 359.288, 10.000 }, { 262.876, 400.918, 10.000 },
				{ 307.110, 442.338, 10.000 }, { 355.462, 483.526, 10.000 }, { 407.908, 524.461, 10.000 },
				{ 464.421, 565.125, 10.000 }, { 524.970, 605.495, 10.000 }, { 589.525, 645.551, 10.000 },
				{ 658.053, 685.274, 10.000 }, { 730.517, 724.642, 10.000 }, { 806.880, 763.635, 10.000 },
				{ 887.104, 802.232, 10.000 }, { 971.145, 840.410, 10.000 }, { 1058.959, 878.148, 10.000 },
				{ 1150.502, 915.422, 10.000 }, { 1245.722, 952.207, 10.000 }, { 1344.570, 988.477, 10.000 },
				{ 1446.990, 1024.204, 10.000 }, { 1552.926, 1059.359, 10.000 }, { 1662.317, 1093.909, 10.000 },
				{ 1775.099, 1127.818, 10.000 }, { 1891.204, 1161.049, 10.000 }, { 2010.560, 1193.559, 10.000 },
				{ 2133.090, 1225.302, 10.000 }, { 2258.599, 1255.093, 10.000 }, { 2386.777, 1281.780, 10.000 },
				{ 2517.314, 1305.367, 10.000 }, { 2649.900, 1325.856, 10.000 }, { 2784.225, 1343.252, 10.000 },
				{ 2919.981, 1357.558, 10.000 }, { 3056.859, 1368.780, 10.000 }, { 3194.551, 1376.923, 10.000 },
				{ 3332.750, 1381.993, 10.000 }, { 3471.150, 1383.997, 10.000 }, { 3609.444, 1382.945, 10.000 },
				{ 3747.329, 1378.848, 10.000 }, { 3884.501, 1371.721, 10.000 }, { 4020.659, 1361.581, 10.000 },
				{ 4155.504, 1348.452, 10.000 }, { 4288.740, 1332.360, 10.000 }, { 4420.074, 1313.340, 10.000 },
				{ 4549.312, 1292.375, 10.000 }, { 4676.350, 1270.377, 10.000 }, { 4801.076, 1247.261, 10.000 },
				{ 4923.369, 1222.938, 10.000 }, { 5043.101, 1197.313, 10.000 }, { 5160.129, 1170.283, 10.000 },
				{ 5274.303, 1141.739, 10.000 }, { 5385.459, 1111.562, 10.000 }, { 5493.422, 1079.627, 10.000 },
				{ 5598.002, 1045.801, 10.000 }, { 5698.996, 1009.944, 10.000 }, { 5796.187, 971.905, 10.000 },
				{ 5889.340, 931.531, 10.000 }, { 5978.206, 888.660, 10.000 }, { 6062.519, 843.126, 10.000 },
				{ 6141.995, 794.764, 10.000 }, { 6216.336, 743.407, 10.000 }, { 6285.226, 688.899, 10.000 },
				{ 6348.335, 631.094, 10.000 }, { 6405.322, 569.867, 10.000 }, { 6455.834, 505.126, 10.000 },
				{ 6499.516, 436.821, 10.000 }, { 6536.013, 364.964, 10.000 }, { 6564.977, 289.643, 10.000 },
				{ 6586.082, 211.049, 10.000 }, { 6599.032, 129.496, 10.000 }, { 6603.577, 45.450, 10.000 },
				{ 6607.621, 40.444, 10.000 }, { 6620.355, 127.340, 10.000 }, { 6641.772, 214.171, 10.000 },
				{ 6671.736, 299.640, 10.000 }, { 6709.959, 382.230, 10.000 }, { 6755.982, 460.229, 10.000 },
				{ 6809.160, 531.780, 10.000 }, { 6868.656, 594.964, 10.000 }, { 6933.446, 647.899, 10.000 },
				{ 7002.333, 688.863, 10.000 }, { 7073.974, 716.416, 10.000 }, { 7146.926, 729.519, 10.000 },
				{ 7219.688, 727.621, 10.000 }, { 7290.759, 710.711, 10.000 }, { 7358.691, 679.321, 10.000 },
				{ 7422.139, 634.473, 10.000 }, { 7479.898, 577.598, 10.000 }, { 7530.940, 510.415, 10.000 },
				{ 7574.421, 434.809, 10.000 }, { 7609.692, 352.709, 10.000 }, { 7636.290, 265.982, 10.000 },
				{ 7653.925, 176.355, 10.000 }, { 7662.462, 85.362, 10.000 }, { 7663.031, 5.692, 10.000 },
				{ 7672.602, 95.716, 10.000 }, { 7690.989, 183.866, 10.000 }, { 7717.938, 269.489, 10.000 },
				{ 7753.149, 352.116, 10.000 }, { 7796.292, 431.429, 10.000 }, { 7847.017, 507.243, 10.000 },
				{ 7904.964, 579.469, 10.000 }, { 7969.774, 648.103, 10.000 }, { 8041.094, 713.200, 10.000 },
				{ 8118.580, 774.861, 10.000 }, { 8201.902, 833.217, 10.000 }, { 8290.744, 888.421, 10.000 },
				{ 8384.808, 940.642, 10.000 }, { 8483.813, 990.052, 10.000 }, { 8587.496, 1036.826, 10.000 },
				{ 8695.610, 1081.140, 10.000 }, { 8807.926, 1123.163, 10.000 }, { 8924.232, 1163.059, 10.000 },
				{ 9044.331, 1200.987, 10.000 }, { 9168.040, 1237.096, 10.000 }, { 9295.193, 1271.528, 10.000 },
				{ 9425.635, 1304.419, 10.000 }, { 9559.224, 1335.894, 10.000 }, { 9695.832, 1366.074, 10.000 },
				{ 9835.339, 1395.069, 10.000 }, { 9977.637, 1422.985, 10.000 }, { 10122.629, 1449.922, 10.000 },
				{ 10270.227, 1475.972, 10.000 }, { 10420.349, 1501.223, 10.000 }, { 10572.925, 1525.757, 10.000 },
				{ 10727.890, 1549.654, 10.000 }, { 10885.189, 1572.987, 10.000 }, { 11044.772, 1595.828, 10.000 },
				{ 11206.596, 1618.242, 10.000 }, { 11370.625, 1640.294, 10.000 }, { 11536.830, 1662.047, 10.000 },
				{ 11705.186, 1683.559, 10.000 }, { 11875.674, 1704.888, 10.000 }, { 12048.283, 1726.090, 10.000 },
				{ 12223.005, 1747.219, 10.000 }, { 12399.838, 1768.329, 10.000 }, { 12578.786, 1789.472, 10.000 },
				{ 12759.855, 1810.700, 10.000 }, { 12943.062, 1832.063, 10.000 }, { 13128.423, 1853.612, 10.000 },
				{ 13315.963, 1875.399, 10.000 }, { 13505.710, 1897.473, 10.000 }, { 13697.699, 1919.886, 10.000 },
				{ 13891.967, 1942.687, 10.000 }, { 14088.560, 1965.929, 10.000 }, { 14287.526, 1989.661, 10.000 },
				{ 14488.920, 2013.936, 10.000 }, { 14692.801, 2038.805, 10.000 }, { 14899.233, 2064.319, 10.000 },
				{ 15108.286, 2090.530, 10.000 }, { 15320.034, 2117.487, 10.000 }, { 15534.558, 2145.241, 10.000 },
				{ 15751.942, 2173.840, 10.000 }, { 15972.276, 2203.331, 10.000 }, { 16195.651, 2233.755, 10.000 },
				{ 16422.167, 2265.154, 10.000 }, { 16651.923, 2297.562, 10.000 }, { 16885.023, 2331.007, 10.000 },
				{ 17121.574, 2365.508, 10.000 }, { 17361.682, 2401.078, 10.000 }, { 17605.453, 2437.714, 10.000 },
				{ 17852.993, 2475.399, 10.000 }, { 18104.403, 2514.099, 10.000 }, { 18359.779, 2553.761, 10.000 },
				{ 18619.210, 2594.304, 10.000 }, { 18882.772, 2635.623, 10.000 }, { 19150.530, 2677.579, 10.000 },
				{ 19422.530, 2719.998, 10.000 }, { 19698.797, 2762.668, 10.000 }, { 19979.330, 2805.332, 10.000 },
				{ 20264.099, 2847.692, 10.000 }, { 20553.039, 2889.401, 10.000 }, { 20846.046, 2930.066, 10.000 },
				{ 21142.971, 2969.250, 10.000 }, { 21443.618, 3006.476, 10.000 }, { 21747.742, 3041.233, 10.000 },
				{ 22055.040, 3072.983, 10.000 }, { 22365.158, 3101.178, 10.000 }, { 22677.541, 3123.837, 10.000 },
				{ 22991.350, 3138.083, 10.000 }, { 23305.599, 3142.494, 10.000 }, { 23619.264, 3136.651, 10.000 },
				{ 23931.294, 3120.297, 10.000 }, { 24240.629, 3093.354, 10.000 }, { 24546.222, 3055.928, 10.000 },
				{ 24847.053, 3008.312, 10.000 }, { 25142.150, 2950.966, 10.000 }, { 25430.600, 2884.498, 10.000 },
				{ 25711.563, 2809.638, 10.000 }, { 25984.283, 2727.200, 10.000 }, { 26248.089, 2638.054, 10.000 },
				{ 26502.398, 2543.093, 10.000 }, { 26746.718, 2443.202, 10.000 }, { 26980.642, 2339.240, 10.000 },
				{ 27203.844, 2232.018, 10.000 }, { 27416.197, 2123.530, 10.000 }, { 27617.830, 2016.328, 10.000 },
				{ 27808.981, 1911.506, 10.000 }, { 27989.911, 1809.300, 10.000 }, { 28160.899, 1709.886, 10.000 },
				{ 28322.238, 1613.387, 10.000 }, { 28474.226, 1519.885, 10.000 }, { 28617.169, 1429.426, 10.000 },
				{ 28751.371, 1342.026, 10.000 }, { 28877.139, 1257.677, 10.000 }, { 28994.774, 1176.350, 10.000 },
				{ 29104.574, 1098.000, 10.000 }, { 29206.831, 1022.568, 10.000 }, { 29301.829, 949.981, 10.000 },
				{ 29389.845, 880.158, 10.000 }, { 29471.145, 813.005, 10.000 }, { 29545.988, 748.422, 10.000 },
				{ 29614.617, 686.299, 10.000 }, { 29677.269, 626.516, 10.000 }, { 29734.164, 568.949, 10.000 },
				{ 29785.510, 513.461, 10.000 }, { 29831.501, 459.912, 10.000 }, { 29872.316, 408.150, 10.000 },
				{ 29908.201, 358.844, 10.000 }, { 29939.512, 313.112, 10.000 }, { 29966.633, 271.213, 10.000 },
				{ 29989.925, 232.915, 10.000 }, { 30009.726, 198.013, 10.000 }, { 30026.359, 166.328, 10.000 },
				{ 30040.129, 137.705, 10.000 }, { 30051.331, 112.014, 10.000 }, { 30060.245, 89.145, 10.000 },
				{ 30067.146, 69.009, 10.000 }, { 30072.300, 51.537, 10.000 }, { 30075.967, 36.674, 10.000 },
				{ 30078.405, 24.379, 10.000 }, { 30079.868, 14.626, 10.000 }, { 30080.607, 7.397, 10.000 },
				{ 30080.876, 2.682, 10.000 }, { 30080.923, 0.476, 10.000 }, { 30080.923, 0.000, 10.000 } };

		double[][] rightPoints = { { 0.125, 2.508, 10.000 }, { 0.627, 5.016, 10.000 }, { 1.756, 11.286, 10.000 },
				{ 3.762, 20.065, 10.000 }, { 6.898, 31.356, 10.000 }, { 11.414, 45.159, 10.000 },
				{ 17.562, 61.481, 10.000 }, { 25.594, 80.325, 10.000 }, { 35.764, 101.700, 10.000 },
				{ 48.326, 125.616, 10.000 }, { 63.534, 152.083, 10.000 }, { 81.646, 181.116, 10.000 },
				{ 102.919, 212.734, 10.000 }, { 127.615, 246.955, 10.000 }, { 155.995, 283.803, 10.000 },
				{ 188.325, 323.305, 10.000 }, { 224.875, 365.493, 10.000 }, { 265.788, 409.131, 10.000 },
				{ 311.086, 452.980, 10.000 }, { 360.792, 497.060, 10.000 }, { 414.931, 541.393, 10.000 },
				{ 473.531, 585.998, 10.000 }, { 536.621, 630.896, 10.000 }, { 604.231, 676.108, 10.000 },
				{ 676.397, 721.654, 10.000 }, { 753.152, 767.554, 10.000 }, { 834.535, 813.829, 10.000 },
				{ 920.585, 860.501, 10.000 }, { 1011.344, 907.591, 10.000 }, { 1106.856, 955.121, 10.000 },
				{ 1207.168, 1003.116, 10.000 }, { 1312.328, 1051.599, 10.000 }, { 1422.388, 1100.597, 10.000 },
				{ 1537.402, 1150.138, 10.000 }, { 1657.427, 1200.252, 10.000 }, { 1782.524, 1250.971, 10.000 },
				{ 1912.757, 1302.330, 10.000 }, { 2048.193, 1354.367, 10.000 }, { 2188.906, 1407.125, 10.000 },
				{ 2334.971, 1460.650, 10.000 }, { 2486.333, 1513.620, 10.000 }, { 2642.801, 1564.677, 10.000 },
				{ 2804.183, 1613.819, 10.000 }, { 2970.287, 1661.043, 10.000 }, { 3140.921, 1706.344, 10.000 },
				{ 3315.893, 1749.719, 10.000 }, { 3495.010, 1791.163, 10.000 }, { 3678.076, 1830.670, 10.000 },
				{ 3864.900, 1868.234, 10.000 }, { 4055.285, 1903.848, 10.000 }, { 4249.035, 1937.502, 10.000 },
				{ 4445.953, 1969.185, 10.000 }, { 4645.842, 1998.883, 10.000 }, { 4848.499, 2026.577, 10.000 },
				{ 5053.724, 2052.246, 10.000 }, { 5261.310, 2075.860, 10.000 }, { 5471.049, 2097.388, 10.000 },
				{ 5682.884, 2118.352, 10.000 }, { 5896.919, 2140.349, 10.000 }, { 6113.265, 2163.465, 10.000 },
				{ 6332.044, 2187.786, 10.000 }, { 6553.385, 2213.410, 10.000 }, { 6777.429, 2240.439, 10.000 },
				{ 7004.327, 2268.982, 10.000 }, { 7234.243, 2299.158, 10.000 }, { 7467.352, 2331.091, 10.000 },
				{ 7703.843, 2364.915, 10.000 }, { 7943.921, 2400.771, 10.000 }, { 8187.801, 2438.807, 10.000 },
				{ 8435.719, 2479.178, 10.000 }, { 8687.924, 2522.047, 10.000 }, { 8944.682, 2567.578, 10.000 },
				{ 9206.275, 2615.937, 10.000 }, { 9473.004, 2667.289, 10.000 }, { 9745.183, 2721.793, 10.000 },
				{ 10023.143, 2779.594, 10.000 }, { 10307.224, 2840.815, 10.000 }, { 10597.779, 2905.550, 10.000 },
				{ 10895.164, 2973.848, 10.000 }, { 11199.734, 3045.698, 10.000 }, { 11511.835, 3121.010, 10.000 },
				{ 11831.794, 3199.596, 10.000 }, { 12159.908, 3281.139, 10.000 }, { 12496.426, 3365.173, 10.000 },
				{ 12841.531, 3451.055, 10.000 }, { 13195.325, 3537.939, 10.000 }, { 13557.801, 3624.756, 10.000 },
				{ 13928.822, 3710.212, 10.000 }, { 14308.101, 3792.789, 10.000 }, { 14695.178, 3870.774, 10.000 },
				{ 15089.409, 3942.312, 10.000 }, { 15489.958, 4005.485, 10.000 }, { 15895.799, 4058.411, 10.000 },
				{ 16305.736, 4099.367, 10.000 }, { 16718.427, 4126.915, 10.000 }, { 17132.429, 4140.014, 10.000 },
				{ 17546.240, 4138.117, 10.000 }, { 17958.361, 4121.211, 10.000 }, { 18367.344, 4089.826, 10.000 },
				{ 18771.843, 4044.987, 10.000 }, { 19170.655, 3988.122, 10.000 }, { 19562.750, 3920.952, 10.000 },
				{ 19947.286, 3845.359, 10.000 }, { 20323.613, 3763.272, 10.000 }, { 20691.269, 3676.559, 10.000 },
				{ 21049.964, 3586.947, 10.000 }, { 21399.561, 3495.967, 10.000 }, { 21740.054, 3404.930, 10.000 },
				{ 22071.545, 3314.914, 10.000 }, { 22394.222, 3226.775, 10.000 }, { 22708.339, 3141.162, 10.000 },
				{ 23014.193, 3058.545, 10.000 }, { 23312.117, 2979.239, 10.000 }, { 23602.460, 2903.434, 10.000 },
				{ 23885.582, 2831.214, 10.000 }, { 24161.840, 2762.586, 10.000 }, { 24431.590, 2697.494, 10.000 },
				{ 24695.174, 2635.838, 10.000 }, { 24952.922, 2577.487, 10.000 }, { 25205.151, 2522.286, 10.000 },
				{ 25452.158, 2470.068, 10.000 }, { 25694.224, 2420.662, 10.000 }, { 25931.613, 2373.889, 10.000 },
				{ 26164.571, 2329.578, 10.000 }, { 26393.326, 2287.557, 10.000 }, { 26618.093, 2247.663, 10.000 },
				{ 26839.066, 2209.737, 10.000 }, { 27056.429, 2173.629, 10.000 }, { 27270.349, 2139.198, 10.000 },
				{ 27480.980, 2106.308, 10.000 }, { 27688.463, 2074.834, 10.000 }, { 27892.929, 2044.655, 10.000 },
				{ 28094.495, 2015.661, 10.000 }, { 28293.269, 1987.745, 10.000 }, { 28489.350, 1960.809, 10.000 },
				{ 28682.826, 1934.760, 10.000 }, { 28873.777, 1909.509, 10.000 }, { 29062.275, 1884.975, 10.000 },
				{ 29248.382, 1861.079, 10.000 }, { 29432.157, 1837.746, 10.000 }, { 29613.648, 1814.906, 10.000 },
				{ 29792.897, 1792.492, 10.000 }, { 29969.941, 1770.439, 10.000 }, { 30144.809, 1748.687, 10.000 },
				{ 30317.527, 1727.175, 10.000 }, { 30488.111, 1705.846, 10.000 }, { 30656.576, 1684.644, 10.000 },
				{ 30822.927, 1663.514, 10.000 }, { 30987.168, 1642.404, 10.000 }, { 31149.294, 1621.261, 10.000 },
				{ 31309.297, 1600.034, 10.000 }, { 31467.164, 1578.670, 10.000 }, { 31622.876, 1557.121, 10.000 },
				{ 31776.410, 1535.334, 10.000 }, { 31927.736, 1513.259, 10.000 }, { 32076.820, 1490.846, 10.000 },
				{ 32223.625, 1468.044, 10.000 }, { 32368.105, 1444.802, 10.000 }, { 32510.212, 1421.069, 10.000 },
				{ 32649.891, 1396.793, 10.000 }, { 32787.083, 1371.924, 10.000 }, { 32921.724, 1346.409, 10.000 },
				{ 33053.744, 1320.198, 10.000 }, { 33183.068, 1293.240, 10.000 }, { 33309.617, 1265.485, 10.000 },
				{ 33433.305, 1236.884, 10.000 }, { 33554.044, 1207.393, 10.000 }, { 33671.741, 1176.967, 10.000 },
				{ 33786.298, 1145.567, 10.000 }, { 33897.614, 1113.158, 10.000 }, { 34005.585, 1079.711, 10.000 },
				{ 34110.105, 1045.208, 10.000 }, { 34211.069, 1009.636, 10.000 }, { 34308.369, 972.999, 10.000 },
				{ 34401.900, 935.311, 10.000 }, { 34491.561, 896.608, 10.000 }, { 34577.255, 856.944, 10.000 },
				{ 34658.895, 816.398, 10.000 }, { 34736.403, 775.076, 10.000 }, { 34809.714, 733.117, 10.000 },
				{ 34878.784, 690.694, 10.000 }, { 34943.586, 648.021, 10.000 }, { 35004.121, 605.353, 10.000 },
				{ 35060.420, 562.989, 10.000 }, { 35112.548, 521.277, 10.000 }, { 35160.609, 480.608, 10.000 },
				{ 35204.750, 441.419, 10.000 }, { 35245.169, 404.189, 10.000 }, { 35282.112, 369.429, 10.000 },
				{ 35315.880, 337.675, 10.000 }, { 35346.828, 309.478, 10.000 }, { 35375.354, 285.259, 10.000 },
				{ 35401.893, 265.392, 10.000 }, { 35426.927, 250.344, 10.000 }, { 35450.981, 240.535, 10.000 },
				{ 35474.603, 236.223, 10.000 }, { 35498.351, 237.485, 10.000 }, { 35522.773, 244.215, 10.000 },
				{ 35548.385, 256.120, 10.000 }, { 35575.659, 272.740, 10.000 }, { 35605.006, 293.466, 10.000 },
				{ 35636.763, 317.570, 10.000 }, { 35671.186, 344.235, 10.000 }, { 35708.446, 372.594, 10.000 },
				{ 35748.621, 401.752, 10.000 }, { 35791.703, 430.822, 10.000 }, { 35837.598, 458.948, 10.000 },
				{ 35886.130, 485.318, 10.000 }, { 35937.079, 509.494, 10.000 }, { 35990.222, 531.431, 10.000 },
				{ 36045.321, 550.988, 10.000 }, { 36102.114, 567.928, 10.000 }, { 36160.321, 582.076, 10.000 },
				{ 36219.652, 593.308, 10.000 }, { 36279.806, 601.543, 10.000 }, { 36340.480, 606.735, 10.000 },
				{ 36401.367, 608.868, 10.000 }, { 36462.162, 607.949, 10.000 }, { 36522.562, 604.008, 10.000 },
				{ 36582.271, 597.090, 10.000 }, { 36640.997, 587.255, 10.000 }, { 36698.454, 574.574, 10.000 },
				{ 36754.367, 559.129, 10.000 }, { 36808.468, 541.013, 10.000 }, { 36860.501, 520.328, 10.000 },
				{ 36910.220, 497.183, 10.000 }, { 36957.389, 471.697, 10.000 }, { 37001.789, 443.996, 10.000 },
				{ 37043.210, 414.216, 10.000 }, { 37081.460, 382.497, 10.000 }, { 37116.359, 348.990, 10.000 },
				{ 37147.818, 314.584, 10.000 }, { 37175.884, 280.668, 10.000 }, { 37200.678, 247.934, 10.000 },
				{ 37222.339, 216.616, 10.000 }, { 37241.031, 186.917, 10.000 }, { 37256.933, 159.017, 10.000 },
				{ 37270.240, 133.071, 10.000 }, { 37281.161, 109.209, 10.000 }, { 37289.915, 87.540, 10.000 },
				{ 37296.730, 68.153, 10.000 }, { 37301.842, 51.120, 10.000 }, { 37305.491, 36.493, 10.000 },
				{ 37307.923, 24.313, 10.000 }, { 37309.383, 14.607, 10.000 }, { 37310.123, 7.393, 10.000 },
				{ 37310.391, 2.681, 10.000 }, { 37310.438, 0.476, 10.000 }, { 37310.438, 0.000, 10.000 } };

		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}