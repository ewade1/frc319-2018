package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSide extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (5.00,1.00,20.00)

	public ScaleToSwitchCubeLeftSide() {
		this(false);
	}

	public ScaleToSwitchCubeLeftSide(boolean flipped) {
		super();

		double[][] leftPoints = { { 0.141, 2.811, 10.000 }, { 0.703, 5.621, 10.000 }, { 1.967, 12.647, 10.000 },
				{ 4.216, 22.482, 10.000 }, { 7.728, 35.126, 10.000 }, { 12.786, 50.574, 10.000 },
				{ 19.668, 68.823, 10.000 }, { 28.514, 88.465, 10.000 }, { 39.323, 108.090, 10.000 },
				{ 52.093, 127.694, 10.000 }, { 66.820, 147.274, 10.000 }, { 83.503, 166.827, 10.000 },
				{ 102.138, 186.349, 10.000 }, { 122.721, 205.835, 10.000 }, { 145.250, 225.284, 10.000 },
				{ 169.719, 244.691, 10.000 }, { 196.124, 264.053, 10.000 }, { 224.461, 283.366, 10.000 },
				{ 254.723, 302.628, 10.000 }, { 286.907, 321.835, 10.000 }, { 321.005, 340.985, 10.000 },
				{ 357.013, 360.073, 10.000 }, { 394.923, 379.098, 10.000 }, { 434.728, 398.056, 10.000 },
				{ 476.423, 416.945, 10.000 }, { 519.999, 435.761, 10.000 }, { 565.449, 454.503, 10.000 },
				{ 612.766, 473.168, 10.000 }, { 661.941, 491.753, 10.000 }, { 712.967, 510.257, 10.000 },
				{ 765.835, 528.676, 10.000 }, { 820.536, 547.010, 10.000 }, { 877.061, 565.256, 10.000 },
				{ 935.402, 583.412, 10.000 }, { 995.550, 601.477, 10.000 }, { 1057.495, 619.449, 10.000 },
				{ 1121.228, 637.327, 10.000 }, { 1186.738, 655.109, 10.000 }, { 1254.018, 672.794, 10.000 },
				{ 1323.056, 690.381, 10.000 }, { 1393.843, 707.870, 10.000 }, { 1466.369, 725.259, 10.000 },
				{ 1540.624, 742.548, 10.000 }, { 1616.597, 759.737, 10.000 }, { 1694.280, 776.825, 10.000 },
				{ 1773.661, 793.811, 10.000 }, { 1854.731, 810.697, 10.000 }, { 1937.479, 827.482, 10.000 },
				{ 2021.895, 844.165, 10.000 }, { 2107.970, 860.749, 10.000 }, { 2195.694, 877.233, 10.000 },
				{ 2285.055, 893.618, 10.000 }, { 2376.046, 909.905, 10.000 }, { 2468.655, 926.095, 10.000 },
				{ 2562.874, 942.189, 10.000 }, { 2658.693, 958.189, 10.000 }, { 2756.103, 974.096, 10.000 },
				{ 2855.094, 989.913, 10.000 }, { 2955.658, 1005.640, 10.000 }, { 3057.786, 1021.281, 10.000 },
				{ 3161.470, 1036.837, 10.000 }, { 3266.701, 1052.311, 10.000 }, { 3373.472, 1067.706, 10.000 },
				{ 3481.774, 1083.025, 10.000 }, { 3591.601, 1098.270, 10.000 }, { 3702.946, 1113.446, 10.000 },
				{ 3815.801, 1128.555, 10.000 }, { 3930.161, 1143.602, 10.000 }, { 4046.020, 1158.590, 10.000 },
				{ 4163.373, 1173.523, 10.000 }, { 4282.213, 1188.407, 10.000 }, { 4402.538, 1203.245, 10.000 },
				{ 4524.342, 1218.042, 10.000 }, { 4647.622, 1232.804, 10.000 }, { 4772.376, 1247.535, 10.000 },
				{ 4898.600, 1262.242, 10.000 }, { 5026.293, 1276.930, 10.000 }, { 5155.454, 1291.605, 10.000 },
				{ 5286.081, 1306.273, 10.000 }, { 5418.175, 1320.941, 10.000 }, { 5551.737, 1335.616, 10.000 },
				{ 5686.767, 1350.303, 10.000 }, { 5823.268, 1365.012, 10.000 }, { 5961.243, 1379.748, 10.000 },
				{ 6100.695, 1394.520, 10.000 }, { 6241.629, 1409.335, 10.000 }, { 6384.049, 1424.202, 10.000 },
				{ 6527.962, 1439.128, 10.000 }, { 6673.374, 1454.122, 10.000 }, { 6820.293, 1469.192, 10.000 },
				{ 6968.728, 1484.347, 10.000 }, { 7118.687, 1499.596, 10.000 }, { 7270.182, 1514.948, 10.000 },
				{ 7423.223, 1530.412, 10.000 }, { 7577.823, 1545.996, 10.000 }, { 7733.994, 1561.711, 10.000 },
				{ 7891.750, 1577.566, 10.000 }, { 8051.107, 1593.569, 10.000 }, { 8212.080, 1609.730, 10.000 },
				{ 8374.686, 1626.058, 10.000 }, { 8538.942, 1642.563, 10.000 }, { 8704.868, 1659.253, 10.000 },
				{ 8872.481, 1676.137, 10.000 }, { 9041.804, 1693.225, 10.000 }, { 9212.856, 1710.525, 10.000 },
				{ 9385.661, 1728.045, 10.000 }, { 9560.240, 1745.793, 10.000 }, { 9736.618, 1763.778, 10.000 },
				{ 9914.819, 1782.007, 10.000 }, { 10094.867, 1800.488, 10.000 }, { 10276.790, 1819.226, 10.000 },
				{ 10460.492, 1837.019, 10.000 }, { 10645.757, 1852.653, 10.000 }, { 10832.369, 1866.119, 10.000 },
				{ 11020.110, 1877.404, 10.000 }, { 11208.759, 1886.493, 10.000 }, { 11398.061, 1893.022, 10.000 },
				{ 11587.636, 1895.745, 10.000 }, { 11777.133, 1894.971, 10.000 }, { 11966.322, 1891.889, 10.000 },
				{ 12154.968, 1886.469, 10.000 }, { 12342.837, 1878.681, 10.000 }, { 12529.686, 1868.490, 10.000 },
				{ 12715.307, 1856.212, 10.000 }, { 12899.612, 1843.057, 10.000 }, { 13082.602, 1829.898, 10.000 },
				{ 13264.274, 1816.722, 10.000 }, { 13444.626, 1803.520, 10.000 }, { 13623.655, 1790.281, 10.000 },
				{ 13801.354, 1776.997, 10.000 }, { 13977.720, 1763.659, 10.000 }, { 14152.746, 1750.259, 10.000 },
				{ 14326.425, 1736.791, 10.000 }, { 14498.750, 1723.247, 10.000 }, { 14669.712, 1709.622, 10.000 },
				{ 14839.303, 1695.911, 10.000 }, { 15007.514, 1682.108, 10.000 }, { 15174.335, 1668.209, 10.000 },
				{ 15339.756, 1654.211, 10.000 }, { 15503.767, 1640.109, 10.000 }, { 15666.357, 1625.901, 10.000 },
				{ 15827.515, 1611.585, 10.000 }, { 15987.231, 1597.157, 10.000 }, { 16145.493, 1582.617, 10.000 },
				{ 16302.289, 1567.962, 10.000 }, { 16457.608, 1553.191, 10.000 }, { 16611.438, 1538.303, 10.000 },
				{ 16763.768, 1523.297, 10.000 }, { 16914.585, 1508.174, 10.000 }, { 17063.879, 1492.933, 10.000 },
				{ 17211.636, 1477.573, 10.000 }, { 17357.845, 1462.095, 10.000 }, { 17502.495, 1446.500, 10.000 },
				{ 17645.574, 1430.788, 10.000 }, { 17787.070, 1414.959, 10.000 }, { 17926.972, 1399.016, 10.000 },
				{ 18065.268, 1382.958, 10.000 }, { 18201.946, 1366.787, 10.000 }, { 18336.997, 1350.504, 10.000 },
				{ 18470.408, 1334.111, 10.000 }, { 18602.169, 1317.609, 10.000 }, { 18732.268, 1300.999, 10.000 },
				{ 18860.697, 1284.284, 10.000 }, { 18987.443, 1267.465, 10.000 }, { 19112.498, 1250.544, 10.000 },
				{ 19235.850, 1233.523, 10.000 }, { 19357.490, 1216.404, 10.000 }, { 19477.409, 1199.188, 10.000 },
				{ 19595.597, 1181.878, 10.000 }, { 19712.045, 1164.475, 10.000 }, { 19826.743, 1146.983, 10.000 },
				{ 19939.683, 1129.402, 10.000 }, { 20050.857, 1111.736, 10.000 }, { 20160.255, 1093.985, 10.000 },
				{ 20267.870, 1076.153, 10.000 }, { 20373.695, 1058.241, 10.000 }, { 20477.720, 1040.252, 10.000 },
				{ 20579.939, 1022.188, 10.000 }, { 20680.344, 1004.050, 10.000 }, { 20778.928, 985.841, 10.000 },
				{ 20875.684, 967.563, 10.000 }, { 20970.606, 949.219, 10.000 }, { 21063.687, 930.810, 10.000 },
				{ 21154.921, 912.338, 10.000 }, { 21244.301, 893.805, 10.000 }, { 21331.823, 875.214, 10.000 },
				{ 21417.479, 856.566, 10.000 }, { 21501.266, 837.864, 10.000 }, { 21583.176, 819.108, 10.000 },
				{ 21663.207, 800.302, 10.000 }, { 21741.351, 781.447, 10.000 }, { 21817.606, 762.545, 10.000 },
				{ 21891.966, 743.598, 10.000 }, { 21964.426, 724.607, 10.000 }, { 22034.984, 705.574, 10.000 },
				{ 22103.634, 686.501, 10.000 }, { 22170.373, 667.390, 10.000 }, { 22235.197, 648.242, 10.000 },
				{ 22298.103, 629.059, 10.000 }, { 22359.087, 609.842, 10.000 }, { 22418.146, 590.593, 10.000 },
				{ 22475.278, 571.313, 10.000 }, { 22530.478, 552.004, 10.000 }, { 22583.745, 532.667, 10.000 },
				{ 22635.075, 513.304, 10.000 }, { 22684.467, 493.915, 10.000 }, { 22731.917, 474.503, 10.000 },
				{ 22777.424, 455.068, 10.000 }, { 22820.985, 435.612, 10.000 }, { 22862.599, 416.136, 10.000 },
				{ 22902.263, 396.641, 10.000 }, { 22939.975, 377.127, 10.000 }, { 22975.735, 357.597, 10.000 },
				{ 23009.540, 338.052, 10.000 }, { 23041.390, 318.491, 10.000 }, { 23071.281, 298.917, 10.000 },
				{ 23099.214, 279.330, 10.000 }, { 23125.187, 259.732, 10.000 }, { 23149.200, 240.122, 10.000 },
				{ 23171.250, 220.503, 10.000 }, { 23191.337, 200.874, 10.000 }, { 23209.461, 181.238, 10.000 },
				{ 23225.621, 161.594, 10.000 }, { 23239.815, 141.944, 10.000 }, { 23252.044, 122.288, 10.000 },
				{ 23262.306, 102.627, 10.000 }, { 23270.603, 82.962, 10.000 }, { 23276.972, 63.691, 10.000 },
				{ 23281.594, 46.220, 10.000 }, { 23284.749, 31.557, 10.000 }, { 23286.720, 19.705, 10.000 },
				{ 23287.786, 10.662, 10.000 }, { 23288.229, 4.430, 10.000 }, { 23288.330, 1.008, 10.000 },
				{ 23288.330, 0.000, 10.000 } };

		double[][] rightPoints = { { 0.141, 2.811, 10.000 }, { 0.703, 5.621, 10.000 }, { 1.967, 12.648, 10.000 },
				{ 4.216, 22.487, 10.000 }, { 7.730, 35.139, 10.000 }, { 12.791, 50.607, 10.000 },
				{ 19.680, 68.895, 10.000 }, { 28.541, 88.602, 10.000 }, { 39.373, 108.325, 10.000 },
				{ 52.180, 128.069, 10.000 }, { 66.964, 147.837, 10.000 }, { 83.727, 167.633, 10.000 },
				{ 102.473, 187.459, 10.000 }, { 123.205, 207.321, 10.000 }, { 145.927, 227.220, 10.000 },
				{ 170.643, 247.162, 10.000 }, { 197.358, 267.148, 10.000 }, { 226.076, 287.183, 10.000 },
				{ 256.803, 307.269, 10.000 }, { 289.544, 327.410, 10.000 }, { 324.305, 347.609, 10.000 },
				{ 361.092, 367.868, 10.000 }, { 399.911, 388.192, 10.000 }, { 440.769, 408.582, 10.000 },
				{ 483.673, 429.041, 10.000 }, { 528.631, 449.573, 10.000 }, { 575.648, 470.179, 10.000 },
				{ 624.735, 490.863, 10.000 }, { 675.897, 511.626, 10.000 }, { 729.144, 532.470, 10.000 },
				{ 784.484, 553.399, 10.000 }, { 841.926, 574.413, 10.000 }, { 901.477, 595.516, 10.000 },
				{ 963.148, 616.708, 10.000 }, { 1026.947, 637.991, 10.000 }, { 1092.884, 659.367, 10.000 },
				{ 1160.967, 680.838, 10.000 }, { 1231.208, 702.404, 10.000 }, { 1303.615, 724.067, 10.000 },
				{ 1378.197, 745.828, 10.000 }, { 1454.966, 767.687, 10.000 }, { 1533.931, 789.646, 10.000 },
				{ 1615.101, 811.705, 10.000 }, { 1698.488, 833.865, 10.000 }, { 1784.100, 856.125, 10.000 },
				{ 1871.949, 878.487, 10.000 }, { 1962.044, 900.949, 10.000 }, { 2054.395, 923.513, 10.000 },
				{ 2149.013, 946.177, 10.000 }, { 2245.907, 968.942, 10.000 }, { 2345.087, 991.806, 10.000 },
				{ 2446.564, 1014.769, 10.000 }, { 2550.347, 1037.831, 10.000 }, { 2656.446, 1060.989, 10.000 },
				{ 2764.871, 1084.243, 10.000 }, { 2875.630, 1107.591, 10.000 }, { 2988.733, 1131.032, 10.000 },
				{ 3104.189, 1154.564, 10.000 }, { 3222.008, 1178.184, 10.000 }, { 3342.197, 1201.892, 10.000 },
				{ 3464.765, 1225.684, 10.000 }, { 3589.721, 1249.558, 10.000 }, { 3717.072, 1273.511, 10.000 },
				{ 3846.826, 1297.540, 10.000 }, { 3978.990, 1321.643, 10.000 }, { 4113.572, 1345.816, 10.000 },
				{ 4250.577, 1370.054, 10.000 }, { 4390.013, 1394.356, 10.000 }, { 4531.885, 1418.716, 10.000 },
				{ 4676.198, 1443.131, 10.000 }, { 4822.957, 1467.596, 10.000 }, { 4972.168, 1492.106, 10.000 },
				{ 5123.833, 1516.657, 10.000 }, { 5277.958, 1541.243, 10.000 }, { 5434.544, 1565.860, 10.000 },
				{ 5593.594, 1590.501, 10.000 }, { 5755.110, 1615.161, 10.000 }, { 5919.093, 1639.834, 10.000 },
				{ 6085.545, 1664.514, 10.000 }, { 6254.464, 1689.194, 10.000 }, { 6425.851, 1713.868, 10.000 },
				{ 6599.704, 1738.528, 10.000 }, { 6776.021, 1763.168, 10.000 }, { 6954.799, 1787.780, 10.000 },
				{ 7136.034, 1812.356, 10.000 }, { 7319.723, 1836.889, 10.000 }, { 7505.860, 1861.370, 10.000 },
				{ 7694.439, 1885.793, 10.000 }, { 7885.454, 1910.147, 10.000 }, { 8078.897, 1934.425, 10.000 },
				{ 8274.758, 1958.618, 10.000 }, { 8473.030, 1982.717, 10.000 }, { 8673.701, 2006.713, 10.000 },
				{ 8876.761, 2030.597, 10.000 }, { 9082.197, 2054.361, 10.000 }, { 9289.996, 2077.994, 10.000 },
				{ 9500.145, 2101.488, 10.000 }, { 9712.628, 2124.833, 10.000 }, { 9927.430, 2148.020, 10.000 },
				{ 10144.534, 2171.039, 10.000 }, { 10363.923, 2193.883, 10.000 }, { 10585.577, 2216.541, 10.000 },
				{ 10809.477, 2239.004, 10.000 }, { 11035.604, 2261.265, 10.000 }, { 11263.935, 2283.313, 10.000 },
				{ 11494.449, 2305.141, 10.000 }, { 11727.123, 2326.741, 10.000 }, { 11961.933, 2348.104, 10.000 },
				{ 12198.856, 2369.223, 10.000 }, { 12437.865, 2390.091, 10.000 }, { 12678.935, 2410.700, 10.000 },
				{ 12921.879, 2429.445, 10.000 }, { 13166.352, 2444.728, 10.000 }, { 13412.008, 2456.557, 10.000 },
				{ 13658.502, 2464.946, 10.000 }, { 13905.493, 2469.910, 10.000 }, { 14152.595, 2471.018, 10.000 },
				{ 14399.266, 2466.707, 10.000 }, { 14645.012, 2457.461, 10.000 }, { 14889.502, 2444.902, 10.000 },
				{ 15132.408, 2429.059, 10.000 }, { 15373.405, 2409.964, 10.000 }, { 15612.170, 2387.651, 10.000 },
				{ 15848.429, 2362.597, 10.000 }, { 16082.070, 2336.403, 10.000 }, { 16313.091, 2310.215, 10.000 },
				{ 16541.495, 2284.042, 10.000 }, { 16767.285, 2257.897, 10.000 }, { 16990.464, 2231.787, 10.000 },
				{ 17211.036, 2205.723, 10.000 }, { 17429.007, 2179.714, 10.000 }, { 17644.384, 2153.765, 10.000 },
				{ 17857.173, 2127.886, 10.000 }, { 18067.381, 2102.081, 10.000 }, { 18275.016, 2076.358, 10.000 },
				{ 18480.089, 2050.721, 10.000 }, { 18682.606, 2025.176, 10.000 }, { 18882.579, 1999.727, 10.000 },
				{ 19080.017, 1974.377, 10.000 }, { 19274.930, 1949.130, 10.000 }, { 19467.329, 1923.990, 10.000 },
				{ 19657.224, 1898.958, 10.000 }, { 19844.628, 1874.038, 10.000 }, { 20029.551, 1849.230, 10.000 },
				{ 20212.005, 1824.537, 10.000 }, { 20392.001, 1799.960, 10.000 }, { 20569.551, 1775.500, 10.000 },
				{ 20744.667, 1751.157, 10.000 }, { 20917.360, 1726.932, 10.000 }, { 21087.642, 1702.826, 10.000 },
				{ 21255.526, 1678.837, 10.000 }, { 21421.023, 1654.967, 10.000 }, { 21584.144, 1631.214, 10.000 },
				{ 21744.902, 1607.578, 10.000 }, { 21903.308, 1584.058, 10.000 }, { 22059.373, 1560.653, 10.000 },
				{ 22213.109, 1537.363, 10.000 }, { 22364.528, 1514.186, 10.000 }, { 22513.640, 1491.121, 10.000 },
				{ 22660.457, 1468.166, 10.000 }, { 22804.989, 1445.320, 10.000 }, { 22947.247, 1422.581, 10.000 },
				{ 23087.241, 1399.948, 10.000 }, { 23224.983, 1377.419, 10.000 }, { 23360.482, 1354.991, 10.000 },
				{ 23493.749, 1332.664, 10.000 }, { 23624.792, 1310.436, 10.000 }, { 23753.623, 1288.303, 10.000 },
				{ 23880.249, 1266.265, 10.000 }, { 24004.681, 1244.319, 10.000 }, { 24126.928, 1222.464, 10.000 },
				{ 24246.997, 1200.696, 10.000 }, { 24364.899, 1179.014, 10.000 }, { 24480.640, 1157.417, 10.000 },
				{ 24594.230, 1135.901, 10.000 }, { 24705.677, 1114.464, 10.000 }, { 24814.987, 1093.105, 10.000 },
				{ 24922.169, 1071.822, 10.000 }, { 25027.231, 1050.611, 10.000 }, { 25130.178, 1029.472, 10.000 },
				{ 25231.018, 1008.401, 10.000 }, { 25329.758, 987.397, 10.000 }, { 25426.403, 966.458, 10.000 },
				{ 25520.962, 945.582, 10.000 }, { 25613.438, 924.767, 10.000 }, { 25703.839, 904.010, 10.000 },
				{ 25792.170, 883.309, 10.000 }, { 25878.436, 862.664, 10.000 }, { 25962.644, 842.071, 10.000 },
				{ 26044.796, 821.528, 10.000 }, { 26124.900, 801.035, 10.000 }, { 26202.959, 780.589, 10.000 },
				{ 26278.978, 760.188, 10.000 }, { 26352.961, 739.831, 10.000 }, { 26424.912, 719.516, 10.000 },
				{ 26494.836, 699.240, 10.000 }, { 26562.737, 679.004, 10.000 }, { 26628.617, 658.803, 10.000 },
				{ 26692.481, 638.639, 10.000 }, { 26754.332, 618.507, 10.000 }, { 26814.173, 598.408, 10.000 },
				{ 26872.007, 578.340, 10.000 }, { 26927.837, 558.300, 10.000 }, { 26981.665, 538.289, 10.000 },
				{ 27033.496, 518.304, 10.000 }, { 27083.330, 498.344, 10.000 }, { 27131.171, 478.408, 10.000 },
				{ 27177.021, 458.495, 10.000 }, { 27220.881, 438.603, 10.000 }, { 27262.754, 418.731, 10.000 },
				{ 27302.642, 398.878, 10.000 }, { 27340.546, 379.043, 10.000 }, { 27376.469, 359.225, 10.000 },
				{ 27410.411, 339.423, 10.000 }, { 27442.374, 319.635, 10.000 }, { 27472.361, 299.861, 10.000 },
				{ 27500.370, 280.099, 10.000 }, { 27526.405, 260.350, 10.000 }, { 27550.467, 240.611, 10.000 },
				{ 27572.555, 220.882, 10.000 }, { 27592.671, 201.163, 10.000 }, { 27610.816, 181.451, 10.000 },
				{ 27626.991, 161.747, 10.000 }, { 27641.196, 142.049, 10.000 }, { 27653.431, 122.357, 10.000 },
				{ 27663.698, 102.669, 10.000 }, { 27671.997, 82.986, 10.000 }, { 27678.367, 63.703, 10.000 },
				{ 27682.990, 46.225, 10.000 }, { 27686.146, 31.559, 10.000 }, { 27688.116, 19.705, 10.000 },
				{ 27689.182, 10.662, 10.000 }, { 27689.625, 4.430, 10.000 }, { 27689.726, 1.008, 10.000 },
				{ 27689.726, 0.000, 10.000 } };

		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}