package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightScaleNullZoneArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (23.63,1.79,0.00)
	// (26.63,4.79,89.99)
	
    public RightWallToRightScaleNullZoneArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightScaleNullZoneArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.591,-11.824,10.000,0.000},
				{-2.956,-35.473,10.000,360.000},
				{-8.277,-70.945,10.000,360.000},
				{-17.736,-118.242,10.000,360.000},
				{-32.517,-177.363,10.000,360.000},
				{-53.800,-248.308,10.000,360.000},
				{-82.769,-331.078,10.000,360.000},
				{-120.607,-425.671,10.000,360.000},
				{-168.495,-532.089,10.000,360.000},
				{-227.616,-650.331,10.000,360.000},
				{-299.152,-780.397,10.000,360.000},
				{-384.286,-922.288,10.000,360.000},
				{-484.201,-1076.002,10.000,360.000},
				{-600.078,-1241.541,10.000,360.000},
				{-733.100,-1418.904,10.000,360.000},
				{-884.450,-1608.091,10.000,359.999},
				{-1055.310,-1809.103,10.000,359.999},
				{-1246.862,-2021.938,10.000,359.999},
				{-1460.289,-2246.598,10.000,359.998},
				{-1696.773,-2483.082,10.000,359.998},
				{-1956.905,-2719.566,10.000,359.997},
				{-2240.686,-2956.050,10.000,359.996},
				{-2548.115,-3192.534,10.000,359.995},
				{-2879.193,-3429.018,10.000,359.993},
				{-3233.919,-3665.502,10.000,359.992},
				{-3612.293,-3901.986,10.000,359.990},
				{-4014.316,-4138.470,10.000,359.987},
				{-4439.987,-4374.954,10.000,359.985},
				{-4889.307,-4611.438,10.000,359.981},
				{-5362.275,-4847.922,10.000,359.978},
				{-5858.891,-5084.406,10.000,359.973},
				{-6379.156,-5320.890,10.000,359.968},
				{-6923.069,-5557.374,10.000,359.963},
				{-7490.631,-5793.858,10.000,359.957},
				{-8081.841,-6030.342,10.000,359.950},
				{-8696.699,-6266.826,10.000,359.942},
				{-9335.206,-6503.310,10.000,359.933},
				{-9997.361,-6739.794,10.000,359.924},
				{-10683.164,-6976.278,10.000,359.913},
				{-11392.616,-7212.762,10.000,359.902},
				{-12125.717,-7449.246,10.000,359.889},
				{-12882.466,-7685.730,10.000,359.875},
				{-13662.863,-7922.214,10.000,359.860},
				{-14466.908,-8158.698,10.000,359.844},
				{-15294.602,-8395.182,10.000,359.826},
				{-16145.945,-8631.666,10.000,359.807},
				{-17020.936,-8868.150,10.000,359.786},
				{-17919.575,-9104.634,10.000,359.764},
				{-18841.862,-9341.118,10.000,359.740},
				{-19787.798,-9577.602,10.000,359.715},
				{-20757.383,-9814.086,10.000,359.687},
				{-21750.615,-10050.570,10.000,359.658},
				{-22767.497,-10287.054,10.000,359.628},
				{-23808.026,-10523.538,10.000,359.595},
				{-24872.204,-10760.022,10.000,359.560},
				{-25960.031,-10996.506,10.000,359.523},
				{-27071.505,-11232.990,10.000,359.484},
				{-28206.628,-11469.474,10.000,359.443},
				{-29365.400,-11705.958,10.000,359.399},
				{-30547.820,-11942.442,10.000,359.354},
				{-31753.888,-12178.926,10.000,359.306},
				{-32983.605,-12415.410,10.000,359.255},
				{-34236.970,-12651.894,10.000,359.203},
				{-35513.984,-12888.378,10.000,359.147},
				{-36814.646,-13124.862,10.000,359.089},
				{-38138.956,-13361.346,10.000,359.029},
				{-39486.915,-13597.830,10.000,358.966},
				{-40858.522,-13834.314,10.000,358.900},
				{-42253.778,-14070.798,10.000,358.832},
				{-43672.682,-14307.282,10.000,358.761},
				{-45115.234,-14543.766,10.000,358.687},
				{-46581.435,-14780.250,10.000,358.610},
				{-48071.284,-15016.734,10.000,358.531},
				{-49584.782,-15253.218,10.000,358.449},
				{-51121.928,-15489.702,10.000,358.364},
				{-52682.722,-15726.186,10.000,358.276},
				{-54267.165,-15962.670,10.000,358.185},
				{-55875.256,-16199.154,10.000,358.092},
				{-57506.995,-16435.638,10.000,357.995},
				{-59162.383,-16672.122,10.000,357.896},
				{-60841.420,-16908.606,10.000,357.794},
				{-62544.105,-17145.090,10.000,357.689},
				{-64270.438,-17381.574,10.000,357.582},
				{-66020.419,-17618.058,10.000,357.472},
				{-67793.458,-17842.717,10.000,357.359},
				{-69588.372,-18055.553,10.000,357.243},
				{-71403.977,-18256.564,10.000,357.125},
				{-73239.093,-18445.752,10.000,357.005},
				{-75092.537,-18623.115,10.000,356.883},
				{-76963.125,-18788.653,10.000,356.758},
				{-78849.676,-18942.368,10.000,356.632},
				{-80751.007,-19084.258,10.000,356.504},
				{-82665.936,-19214.325,10.000,356.375},
				{-84593.281,-19332.567,10.000,356.244},
				{-86531.859,-19438.984,10.000,356.112},
				{-88480.487,-19533.578,10.000,355.979},
				{-90437.983,-19616.347,10.000,355.845},
				{-92403.165,-19687.293,10.000,355.710},
				{-94374.850,-19746.414,10.000,355.575},
				{-96351.856,-19793.710,10.000,355.440},
				{-98333.001,-19829.183,10.000,355.304},
				{-100317.102,-19852.831,10.000,355.169},
				{-102302.976,-19864.656,10.000,355.034},
				{-104289.442,-19864.656,10.000,354.899},
				{-106275.907,-19864.656,10.000,354.765},
				{-108262.373,-19864.656,10.000,354.631},
				{-110248.838,-19864.656,10.000,354.498},
				{-112235.304,-19864.656,10.000,354.366},
				{-114221.770,-19864.656,10.000,354.235},
				{-116208.235,-19864.656,10.000,354.105},
				{-118194.701,-19864.656,10.000,353.976},
				{-120181.166,-19864.656,10.000,353.848},
				{-122167.632,-19864.656,10.000,353.721},
				{-124154.097,-19864.656,10.000,353.596},
				{-126140.563,-19864.656,10.000,353.472},
				{-128127.028,-19864.656,10.000,353.349},
				{-130113.494,-19864.656,10.000,353.228},
				{-132099.960,-19864.656,10.000,353.109},
				{-134086.425,-19864.656,10.000,352.991},
				{-136072.891,-19864.656,10.000,352.876},
				{-138059.356,-19864.656,10.000,352.762},
				{-140045.822,-19864.656,10.000,352.649},
				{-142032.287,-19864.656,10.000,352.539},
				{-144018.753,-19864.656,10.000,352.431},
				{-146005.218,-19864.656,10.000,352.325},
				{-147991.684,-19864.656,10.000,352.221},
				{-149978.150,-19864.656,10.000,352.119},
				{-151964.615,-19864.656,10.000,352.020},
				{-153951.081,-19864.656,10.000,351.923},
				{-155937.546,-19864.656,10.000,351.828},
				{-157924.012,-19864.656,10.000,351.735},
				{-159910.477,-19864.656,10.000,351.645},
				{-161896.943,-19864.656,10.000,351.558},
				{-163883.408,-19864.656,10.000,351.473},
				{-165869.874,-19864.656,10.000,351.391},
				{-167856.340,-19864.656,10.000,351.311},
				{-169842.805,-19864.656,10.000,351.234},
				{-171829.271,-19864.656,10.000,351.159},
				{-173815.736,-19864.656,10.000,351.088},
				{-175802.202,-19864.656,10.000,351.019},
				{-177788.667,-19864.656,10.000,350.953},
				{-179775.133,-19864.656,10.000,350.890},
				{-181761.598,-19864.656,10.000,350.829},
				{-183748.064,-19864.656,10.000,350.772},
				{-185734.530,-19864.656,10.000,350.717},
				{-187720.995,-19864.656,10.000,350.666},
				{-189707.461,-19864.656,10.000,350.617},
				{-191693.926,-19864.656,10.000,350.572},
				{-193680.392,-19864.656,10.000,350.529},
				{-195666.857,-19864.656,10.000,350.490},
				{-197653.323,-19864.656,10.000,350.453},
				{-199639.788,-19864.656,10.000,350.420},
				{-201626.254,-19864.656,10.000,350.389},
				{-203612.720,-19864.656,10.000,350.362},
				{-205599.185,-19864.656,10.000,350.338},
				{-207585.651,-19864.656,10.000,350.317},
				{-209572.116,-19864.656,10.000,350.299},
				{-211558.582,-19864.656,10.000,350.285},
				{-213545.047,-19864.656,10.000,350.273},
				{-215531.513,-19864.656,10.000,350.265},
				{-217517.978,-19864.656,10.000,350.260},
				{-219504.444,-19864.656,10.000,350.258},
				{-221490.910,-19864.656,10.000,350.259},
				{-223477.375,-19864.656,10.000,350.263},
				{-225463.841,-19864.656,10.000,350.270},
				{-227450.306,-19864.656,10.000,350.281},
				{-229436.772,-19864.656,10.000,350.295},
				{-231423.237,-19864.656,10.000,350.312},
				{-233409.703,-19864.656,10.000,350.332},
				{-235396.168,-19864.656,10.000,350.355},
				{-237382.634,-19864.656,10.000,350.381},
				{-239369.100,-19864.656,10.000,350.410},
				{-241355.565,-19864.656,10.000,350.443},
				{-243342.031,-19864.656,10.000,350.478},
				{-245328.496,-19864.656,10.000,350.517},
				{-247314.962,-19864.656,10.000,350.559},
				{-249301.427,-19864.656,10.000,350.603},
				{-251287.893,-19864.656,10.000,350.651},
				{-253274.358,-19864.656,10.000,350.702},
				{-255260.824,-19864.656,10.000,350.755},
				{-257247.290,-19864.656,10.000,350.812},
				{-259233.755,-19864.656,10.000,350.871},
				{-261220.221,-19864.656,10.000,350.934},
				{-263206.686,-19864.656,10.000,350.999},
				{-265193.152,-19864.656,10.000,351.067},
				{-267179.617,-19864.656,10.000,351.138},
				{-269166.083,-19864.656,10.000,351.211},
				{-271152.549,-19864.656,10.000,351.288},
				{-273139.014,-19864.656,10.000,351.367},
				{-275125.480,-19864.656,10.000,351.448},
				{-277111.945,-19864.656,10.000,351.532},
				{-279098.411,-19864.656,10.000,351.619},
				{-281084.876,-19864.656,10.000,351.708},
				{-283071.342,-19864.656,10.000,351.800},
				{-285057.807,-19864.656,10.000,351.894},
				{-287044.273,-19864.656,10.000,351.991},
				{-289030.739,-19864.656,10.000,352.089},
				{-291017.204,-19864.656,10.000,352.191},
				{-293003.670,-19864.656,10.000,352.294},
				{-294990.135,-19864.656,10.000,352.399},
				{-296976.601,-19864.656,10.000,352.507},
				{-298963.066,-19864.656,10.000,352.616},
				{-300949.532,-19864.656,10.000,352.728},
				{-302935.997,-19864.656,10.000,352.841},
				{-304922.463,-19864.656,10.000,352.957},
				{-306908.929,-19864.656,10.000,353.074},
				{-308895.394,-19864.656,10.000,353.193},
				{-310881.860,-19864.656,10.000,353.313},
				{-312868.325,-19864.656,10.000,353.435},
				{-314854.791,-19864.656,10.000,353.559},
				{-316841.256,-19864.656,10.000,353.684},
				{-318827.722,-19864.656,10.000,353.810},
				{-320814.187,-19864.656,10.000,353.937},
				{-322800.653,-19864.656,10.000,354.066},
				{-324787.119,-19864.656,10.000,354.196},
				{-326773.584,-19864.656,10.000,354.327},
				{-328760.050,-19864.656,10.000,354.459},
				{-330746.515,-19864.656,10.000,354.591},
				{-332732.981,-19864.656,10.000,354.725},
				{-334719.446,-19864.656,10.000,354.859},
				{-336705.912,-19864.656,10.000,354.993},
				{-338692.377,-19864.656,10.000,355.129},
				{-340678.843,-19864.656,10.000,355.264},
				{-342665.309,-19864.656,10.000,355.400},
				{-344651.774,-19864.656,10.000,355.536},
				{-346638.240,-19864.656,10.000,355.672},
				{-348624.705,-19864.656,10.000,355.808},
				{-350611.171,-19864.656,10.000,355.944},
				{-352597.636,-19864.656,10.000,356.080},
				{-354584.102,-19864.656,10.000,356.215},
				{-356570.567,-19864.656,10.000,356.350},
				{-358557.033,-19864.656,10.000,356.484},
				{-360543.499,-19864.656,10.000,356.618},
				{-362529.964,-19864.656,10.000,356.751},
				{-364516.430,-19864.656,10.000,356.883},
				{-366502.895,-19864.656,10.000,357.014},
				{-368489.361,-19864.656,10.000,357.144},
				{-370475.826,-19864.656,10.000,357.273},
				{-372462.292,-19864.656,10.000,357.401},
				{-374448.757,-19864.656,10.000,357.527},
				{-376435.223,-19864.656,10.000,357.651},
				{-378421.689,-19864.656,10.000,357.774},
				{-380408.154,-19864.656,10.000,357.894},
				{-382394.620,-19864.656,10.000,358.013},
				{-384381.085,-19864.656,10.000,358.130},
				{-386367.551,-19864.656,10.000,358.245},
				{-388354.016,-19864.656,10.000,358.357},
				{-390340.482,-19864.656,10.000,358.466},
				{-392326.947,-19864.656,10.000,358.574},
				{-394313.413,-19864.656,10.000,358.678},
				{-396299.879,-19864.656,10.000,358.780},
				{-398286.344,-19864.656,10.000,358.878},
				{-400272.810,-19864.656,10.000,358.973},
				{-402259.275,-19864.656,10.000,359.066},
				{-404245.741,-19864.656,10.000,359.154},
				{-406232.206,-19864.656,10.000,359.239},
				{-408218.672,-19864.656,10.000,359.321},
				{-410205.137,-19864.656,10.000,359.398},
				{-412191.603,-19864.656,10.000,359.472},
				{-414178.069,-19864.656,10.000,359.541},
				{-416164.534,-19864.656,10.000,359.607},
				{-418151.000,-19864.656,10.000,359.667},
				{-420137.465,-19864.656,10.000,359.724},
				{-422123.931,-19864.656,10.000,359.775},
				{-424110.396,-19864.656,10.000,359.822},
				{-426096.862,-19864.656,10.000,359.863},
				{-428083.328,-19864.656,10.000,359.900},
				{-430069.793,-19864.656,10.000,359.931},
				{-432056.259,-19864.656,10.000,359.956},
				{-434042.724,-19864.656,10.000,359.976},
				{-436029.190,-19864.656,10.000,359.990},
				{-438015.655,-19864.656,10.000,359.998},
				{-440001.907,-19860.379,10.000,0.002},
				{-441987.140,-19844.279,10.000,0.068},
				{-443970.172,-19816.354,10.000,0.227},
				{-445949.820,-19776.605,10.000,0.477},
				{-447924.901,-19725.032,10.000,0.819},
				{-449894.235,-19661.635,10.000,1.253},
				{-451856.637,-19586.414,10.000,1.781},
				{-453810.926,-19499.368,10.000,2.406},
				{-455755.920,-19400.498,10.000,3.131},
				{-457690.435,-19289.804,10.000,3.962},
				{-459613.289,-19167.286,10.000,4.904},
				{-461523.301,-19032.944,10.000,5.963},
				{-463419.287,-18886.777,10.000,7.147},
				{-465300.065,-18728.786,10.000,8.462},
				{-467164.453,-18558.971,10.000,9.917},
				{-469011.268,-18377.332,10.000,11.520},
				{-470839.328,-18183.869,10.000,13.279},
				{-472647.451,-17978.581,10.000,15.201},
				{-474434.453,-17761.469,10.000,17.292},
				{-476199.153,-17532.533,10.000,19.553},
				{-477940.582,-17296.049,10.000,21.986},
				{-479658.363,-17059.565,10.000,24.585},
				{-481352.495,-16823.081,10.000,27.342},
				{-483022.979,-16586.597,10.000,30.240},
				{-484669.815,-16350.113,10.000,33.258},
				{-486293.002,-16113.629,10.000,36.366},
				{-487892.541,-15877.145,10.000,39.531},
				{-489468.431,-15640.661,10.000,42.715},
				{-491020.673,-15404.177,10.000,45.877},
				{-492549.266,-15167.693,10.000,48.982},
				{-494054.212,-14931.209,10.000,51.995},
				{-495535.508,-14694.725,10.000,54.888},
				{-496993.157,-14458.241,10.000,57.640},
				{-498427.157,-14221.757,10.000,60.237},
				{-499837.508,-13985.273,10.000,62.672},
				{-501224.211,-13748.789,10.000,64.941},
				{-502587.266,-13512.305,10.000,67.046},
				{-503926.672,-13275.821,10.000,68.993},
				{-505242.430,-13039.337,10.000,70.789},
				{-506534.540,-12802.853,10.000,72.443},
				{-507803.001,-12566.369,10.000,73.963},
				{-509047.814,-12329.885,10.000,75.359},
				{-510268.978,-12093.401,10.000,76.641},
				{-511466.494,-11856.917,10.000,77.818},
				{-512640.361,-11620.433,10.000,78.898},
				{-513790.580,-11383.949,10.000,79.888},
				{-514917.151,-11147.465,10.000,80.798},
				{-516020.074,-10910.981,10.000,81.632},
				{-517099.347,-10674.497,10.000,82.398},
				{-518154.973,-10438.013,10.000,83.101},
				{-519186.950,-10201.529,10.000,83.747},
				{-520195.279,-9965.045,10.000,84.339},
				{-521179.959,-9728.561,10.000,84.882},
				{-522140.991,-9492.077,10.000,85.380},
				{-523078.375,-9255.593,10.000,85.836},
				{-523992.110,-9019.109,10.000,86.254},
				{-524882.197,-8782.625,10.000,86.637},
				{-525748.635,-8546.141,10.000,86.987},
				{-526591.425,-8309.657,10.000,87.307},
				{-527410.566,-8073.173,10.000,87.598},
				{-528206.059,-7836.689,10.000,87.864},
				{-528977.904,-7600.205,10.000,88.106},
				{-529726.101,-7363.721,10.000,88.325},
				{-530450.648,-7127.237,10.000,88.524},
				{-531151.548,-6890.753,10.000,88.704},
				{-531828.799,-6654.269,10.000,88.866},
				{-532482.402,-6417.785,10.000,89.012},
				{-533112.356,-6181.301,10.000,89.142},
				{-533718.662,-5944.817,10.000,89.259},
				{-534301.320,-5708.333,10.000,89.363},
				{-534860.329,-5471.849,10.000,89.455},
				{-535395.690,-5235.365,10.000,89.537},
				{-535907.402,-4998.881,10.000,89.608},
				{-536395.466,-4762.397,10.000,89.671},
				{-536859.881,-4525.913,10.000,89.725},
				{-537300.649,-4289.429,10.000,89.772},
				{-537717.767,-4052.945,10.000,89.812},
				{-538111.238,-3816.461,10.000,89.846},
				{-538481.060,-3579.977,10.000,89.875},
				{-538827.233,-3343.493,10.000,89.899},
				{-539149.758,-3107.009,10.000,89.919},
				{-539448.635,-2870.525,10.000,89.935},
				{-539723.863,-2634.041,10.000,89.948},
				{-539975.443,-2397.557,10.000,89.959},
				{-540203.589,-2165.350,10.000,89.967},
				{-540409.104,-1944.966,10.000,89.973},
				{-540593.173,-1736.407,10.000,89.978},
				{-540756.977,-1539.672,10.000,89.982},
				{-540901.699,-1354.761,10.000,89.984},
				{-541028.520,-1181.674,10.000,89.986},
				{-541138.625,-1020.411,10.000,89.988},
				{-541233.194,-870.973,10.000,89.988},
				{-541313.410,-733.359,10.000,89.989},
				{-541380.457,-607.569,10.000,89.989},
				{-541435.515,-493.603,10.000,89.990},
				{-541479.769,-391.461,10.000,89.990},
				{-541514.399,-301.144,10.000,89.990},
				{-541540.589,-222.651,10.000,89.990},
				{-541559.520,-155.982,10.000,89.990},
				{-541572.376,-101.137,10.000,89.990},
				{-541580.339,-58.117,10.000,89.990},
				{-541584.591,-26.920,10.000,89.990},
				{-541586.314,-7.548,10.000,89.990},
				{-541586.692,-0.000,10.000,89.990},
				{-541586.692,-0.000,10.000,89.990}		};

}