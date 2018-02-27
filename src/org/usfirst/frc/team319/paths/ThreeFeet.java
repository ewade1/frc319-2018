package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ThreeFeet extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.00,0.00,0.00)

	public ThreeFeet() {
		this(false);
	}

	public ThreeFeet(boolean flipped) {
		super();

		double[][] leftPoints = { { 0.125, 2.508, 10.000 }, { 0.627, 5.016, 10.000 }, { 1.756, 11.286, 10.000 },
				{ 3.762, 20.063, 10.000 }, { 6.897, 31.349, 10.000 }, { 11.411, 45.142, 10.000 },
				{ 17.555, 61.443, 10.000 }, { 25.581, 80.253, 10.000 }, { 35.737, 101.570, 10.000 },
				{ 48.277, 125.395, 10.000 }, { 63.450, 151.727, 10.000 }, { 81.507, 180.568, 10.000 },
				{ 102.698, 211.917, 10.000 }, { 127.276, 245.773, 10.000 }, { 155.489, 282.138, 10.000 },
				{ 187.590, 321.010, 10.000 }, { 223.829, 362.390, 10.000 }, { 264.332, 405.025, 10.000 },
				{ 309.098, 447.659, 10.000 }, { 358.127, 490.293, 10.000 }, { 411.420, 532.927, 10.000 },
				{ 468.976, 575.561, 10.000 }, { 530.795, 618.195, 10.000 }, { 596.878, 660.830, 10.000 },
				{ 667.225, 703.464, 10.000 }, { 741.835, 746.098, 10.000 }, { 820.708, 788.732, 10.000 },
				{ 903.844, 831.366, 10.000 }, { 991.244, 874.001, 10.000 }, { 1082.908, 916.635, 10.000 },
				{ 1178.835, 959.269, 10.000 }, { 1279.025, 1001.903, 10.000 }, { 1383.479, 1044.537, 10.000 },
				{ 1492.196, 1087.171, 10.000 }, { 1605.177, 1129.806, 10.000 }, { 1722.421, 1172.440, 10.000 },
				{ 1843.928, 1215.074, 10.000 }, { 1969.699, 1257.708, 10.000 }, { 2099.733, 1300.342, 10.000 },
				{ 2234.031, 1342.976, 10.000 }, { 2372.466, 1384.357, 10.000 }, { 2514.789, 1423.229, 10.000 },
				{ 2660.748, 1459.593, 10.000 }, { 2810.093, 1493.450, 10.000 }, { 2962.573, 1524.799, 10.000 },
				{ 3117.937, 1553.639, 10.000 }, { 3275.935, 1579.972, 10.000 }, { 3436.314, 1603.797, 10.000 },
				{ 3598.826, 1625.114, 10.000 }, { 3763.218, 1643.923, 10.000 }, { 3929.240, 1660.225, 10.000 },
				{ 4096.642, 1674.018, 10.000 }, { 4265.173, 1685.304, 10.000 }, { 4434.581, 1694.081, 10.000 },
				{ 4604.616, 1700.351, 10.000 }, { 4775.027, 1704.113, 10.000 }, { 4945.564, 1705.367, 10.000 },
				{ 5116.101, 1705.367, 10.000 }, { 5286.637, 1705.367, 10.000 }, { 5457.174, 1705.367, 10.000 },
				{ 5627.711, 1705.367, 10.000 }, { 5798.247, 1705.367, 10.000 }, { 5968.784, 1705.367, 10.000 },
				{ 6139.321, 1705.367, 10.000 }, { 6309.857, 1705.367, 10.000 }, { 6480.394, 1705.367, 10.000 },
				{ 6650.931, 1705.367, 10.000 }, { 6821.467, 1705.367, 10.000 }, { 6992.004, 1705.367, 10.000 },
				{ 7162.541, 1705.367, 10.000 }, { 7333.077, 1705.367, 10.000 }, { 7503.614, 1705.367, 10.000 },
				{ 7674.151, 1705.367, 10.000 }, { 7844.688, 1705.367, 10.000 }, { 8015.224, 1705.367, 10.000 },
				{ 8185.636, 1704.113, 10.000 }, { 8355.671, 1700.351, 10.000 }, { 8525.079, 1694.081, 10.000 },
				{ 8693.609, 1685.304, 10.000 }, { 8861.011, 1674.018, 10.000 }, { 9027.033, 1660.225, 10.000 },
				{ 9191.426, 1643.923, 10.000 }, { 9353.937, 1625.114, 10.000 }, { 9514.317, 1603.797, 10.000 },
				{ 9672.314, 1579.972, 10.000 }, { 9827.678, 1553.639, 10.000 }, { 9980.158, 1524.799, 10.000 },
				{ 10129.503, 1493.450, 10.000 }, { 10275.462, 1459.593, 10.000 }, { 10417.785, 1423.229, 10.000 },
				{ 10556.221, 1384.357, 10.000 }, { 10690.519, 1342.976, 10.000 }, { 10820.553, 1300.342, 10.000 },
				{ 10946.324, 1257.708, 10.000 }, { 11067.831, 1215.074, 10.000 }, { 11185.075, 1172.440, 10.000 },
				{ 11298.055, 1129.806, 10.000 }, { 11406.773, 1087.171, 10.000 }, { 11511.226, 1044.537, 10.000 },
				{ 11611.417, 1001.903, 10.000 }, { 11707.343, 959.269, 10.000 }, { 11799.007, 916.635, 10.000 },
				{ 11886.407, 874.001, 10.000 }, { 11969.544, 831.366, 10.000 }, { 12048.417, 788.732, 10.000 },
				{ 12123.027, 746.098, 10.000 }, { 12193.373, 703.464, 10.000 }, { 12259.456, 660.830, 10.000 },
				{ 12321.276, 618.195, 10.000 }, { 12378.832, 575.561, 10.000 }, { 12432.124, 532.927, 10.000 },
				{ 12481.154, 490.293, 10.000 }, { 12525.920, 447.659, 10.000 }, { 12566.422, 405.025, 10.000 },
				{ 12602.661, 362.390, 10.000 }, { 12634.762, 321.010, 10.000 }, { 12662.976, 282.138, 10.000 },
				{ 12687.553, 245.773, 10.000 }, { 12708.745, 211.917, 10.000 }, { 12726.802, 180.568, 10.000 },
				{ 12741.975, 151.727, 10.000 }, { 12754.514, 125.395, 10.000 }, { 12764.671, 101.570, 10.000 },
				{ 12772.696, 80.253, 10.000 }, { 12778.841, 61.443, 10.000 }, { 12783.355, 45.142, 10.000 },
				{ 12786.490, 31.349, 10.000 }, { 12788.496, 20.063, 10.000 }, { 12789.624, 11.286, 10.000 },
				{ 12790.126, 5.016, 10.000 }, { 12790.251, 1.254, 10.000 }, { 12790.251, 0.000, 10.000 } };

		double[][] rightPoints = { { 0.125, 2.508, 10.000 }, { 0.627, 5.016, 10.000 }, { 1.756, 11.286, 10.000 },
				{ 3.762, 20.063, 10.000 }, { 6.897, 31.349, 10.000 }, { 11.411, 45.142, 10.000 },
				{ 17.555, 61.443, 10.000 }, { 25.581, 80.253, 10.000 }, { 35.737, 101.570, 10.000 },
				{ 48.277, 125.395, 10.000 }, { 63.450, 151.727, 10.000 }, { 81.507, 180.568, 10.000 },
				{ 102.698, 211.917, 10.000 }, { 127.276, 245.773, 10.000 }, { 155.489, 282.138, 10.000 },
				{ 187.590, 321.010, 10.000 }, { 223.829, 362.390, 10.000 }, { 264.332, 405.025, 10.000 },
				{ 309.098, 447.659, 10.000 }, { 358.127, 490.293, 10.000 }, { 411.420, 532.927, 10.000 },
				{ 468.976, 575.561, 10.000 }, { 530.795, 618.195, 10.000 }, { 596.878, 660.830, 10.000 },
				{ 667.225, 703.464, 10.000 }, { 741.835, 746.098, 10.000 }, { 820.708, 788.732, 10.000 },
				{ 903.844, 831.366, 10.000 }, { 991.244, 874.001, 10.000 }, { 1082.908, 916.635, 10.000 },
				{ 1178.835, 959.269, 10.000 }, { 1279.025, 1001.903, 10.000 }, { 1383.479, 1044.537, 10.000 },
				{ 1492.196, 1087.171, 10.000 }, { 1605.177, 1129.806, 10.000 }, { 1722.421, 1172.440, 10.000 },
				{ 1843.928, 1215.074, 10.000 }, { 1969.699, 1257.708, 10.000 }, { 2099.733, 1300.342, 10.000 },
				{ 2234.031, 1342.976, 10.000 }, { 2372.466, 1384.357, 10.000 }, { 2514.789, 1423.229, 10.000 },
				{ 2660.748, 1459.593, 10.000 }, { 2810.093, 1493.450, 10.000 }, { 2962.573, 1524.799, 10.000 },
				{ 3117.937, 1553.639, 10.000 }, { 3275.935, 1579.972, 10.000 }, { 3436.314, 1603.797, 10.000 },
				{ 3598.826, 1625.114, 10.000 }, { 3763.218, 1643.923, 10.000 }, { 3929.240, 1660.225, 10.000 },
				{ 4096.642, 1674.018, 10.000 }, { 4265.173, 1685.304, 10.000 }, { 4434.581, 1694.081, 10.000 },
				{ 4604.616, 1700.351, 10.000 }, { 4775.027, 1704.113, 10.000 }, { 4945.564, 1705.367, 10.000 },
				{ 5116.101, 1705.367, 10.000 }, { 5286.637, 1705.367, 10.000 }, { 5457.174, 1705.367, 10.000 },
				{ 5627.711, 1705.367, 10.000 }, { 5798.247, 1705.367, 10.000 }, { 5968.784, 1705.367, 10.000 },
				{ 6139.321, 1705.367, 10.000 }, { 6309.857, 1705.367, 10.000 }, { 6480.394, 1705.367, 10.000 },
				{ 6650.931, 1705.367, 10.000 }, { 6821.467, 1705.367, 10.000 }, { 6992.004, 1705.367, 10.000 },
				{ 7162.541, 1705.367, 10.000 }, { 7333.077, 1705.367, 10.000 }, { 7503.614, 1705.367, 10.000 },
				{ 7674.151, 1705.367, 10.000 }, { 7844.688, 1705.367, 10.000 }, { 8015.224, 1705.367, 10.000 },
				{ 8185.636, 1704.113, 10.000 }, { 8355.671, 1700.351, 10.000 }, { 8525.079, 1694.081, 10.000 },
				{ 8693.609, 1685.304, 10.000 }, { 8861.011, 1674.018, 10.000 }, { 9027.033, 1660.225, 10.000 },
				{ 9191.426, 1643.923, 10.000 }, { 9353.937, 1625.114, 10.000 }, { 9514.317, 1603.797, 10.000 },
				{ 9672.314, 1579.972, 10.000 }, { 9827.678, 1553.639, 10.000 }, { 9980.158, 1524.799, 10.000 },
				{ 10129.503, 1493.450, 10.000 }, { 10275.462, 1459.593, 10.000 }, { 10417.785, 1423.229, 10.000 },
				{ 10556.221, 1384.357, 10.000 }, { 10690.519, 1342.976, 10.000 }, { 10820.553, 1300.342, 10.000 },
				{ 10946.324, 1257.708, 10.000 }, { 11067.831, 1215.074, 10.000 }, { 11185.075, 1172.440, 10.000 },
				{ 11298.055, 1129.806, 10.000 }, { 11406.773, 1087.171, 10.000 }, { 11511.226, 1044.537, 10.000 },
				{ 11611.417, 1001.903, 10.000 }, { 11707.343, 959.269, 10.000 }, { 11799.007, 916.635, 10.000 },
				{ 11886.407, 874.001, 10.000 }, { 11969.544, 831.366, 10.000 }, { 12048.417, 788.732, 10.000 },
				{ 12123.027, 746.098, 10.000 }, { 12193.373, 703.464, 10.000 }, { 12259.456, 660.830, 10.000 },
				{ 12321.276, 618.195, 10.000 }, { 12378.832, 575.561, 10.000 }, { 12432.124, 532.927, 10.000 },
				{ 12481.154, 490.293, 10.000 }, { 12525.920, 447.659, 10.000 }, { 12566.422, 405.025, 10.000 },
				{ 12602.661, 362.390, 10.000 }, { 12634.762, 321.010, 10.000 }, { 12662.976, 282.138, 10.000 },
				{ 12687.553, 245.773, 10.000 }, { 12708.745, 211.917, 10.000 }, { 12726.802, 180.568, 10.000 },
				{ 12741.975, 151.727, 10.000 }, { 12754.514, 125.395, 10.000 }, { 12764.671, 101.570, 10.000 },
				{ 12772.696, 80.253, 10.000 }, { 12778.841, 61.443, 10.000 }, { 12783.355, 45.142, 10.000 },
				{ 12786.490, 31.349, 10.000 }, { 12788.496, 20.063, 10.000 }, { 12789.624, 11.286, 10.000 },
				{ 12790.126, 5.016, 10.000 }, { 12790.251, 1.254, 10.000 }, { 12790.251, 0.000, 10.000 } };

		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}