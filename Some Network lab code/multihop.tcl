# Simulator Instance Creation
set ns [new Simulator]
set tf [open wireless.tr w]
$ns trace-all $tf
set tf1 [open wireless1.nam w]
$ns namtrace-all-wireless $tf1 900 900

#Fixing the co-ordinate of simulation area
set val(x) 600
set val(y) 600

# Define options
set val(chan)           Channel/WirelessChannel;	# channel type
set val(prop) 			Propagation/TwoRayGround;	# radio-propagation model
set val(netif1)       	Phy/WirelessPhy;			# network interface type
set val(netif2)       	Phy/WirelessPhy;			# network interface type
set val(mac)            Mac/802_11;					# MAC type
set val(ifq)    		Queue/DropTail/PriQueue;	# interface queue type
set val(ll)             LL;							# link layer type
set val(ant)     		Antenna/OmniAntenna;		# antenna model
set val(ifqlen)         50;							# max packet in ifq
set val(nn)             6;							# number of mobilenodes
set val(rp)             AODV;						# routing protocol
set val(x)              1200;						# X dimension of topography
set val(y)              1000;						# Y dimension of topography  
set val(stop)			10.0;						# time of simulation end
set val(energymodel)    EnergyModel;				#Energy set up


# set up topography object
set topo       [new Topography]
$topo load_flatgrid $val(x) $val(y)

# general operational descriptor- storing the hop details in the network
create-god $val(nn)
#Transmission range setup
#**********************************       UNITY GAIN, 1.5m HEIGHT OMNI DIRECTIONAL ANTENNA SET UP      **************

Antenna/OmniAntenna set X_ 0
Antenna/OmniAntenna set Y_ 0
Antenna/OmniAntenna set Z_ 1.5
Antenna/OmniAntenna set Gt_ 1.0
Antenna/OmniAntenna set Gr_ 1.0

#**********************************     SET UP COMMUNICATION AND SENSING RANGE       ***********************************
#default communication range 250m
# Initialize the SharedMedia interface with parameters to make
# it work like the 914MHz Lucent WaveLAN DSSS radio interface

$val(netif1) set CPThresh_ 10.0
$val(netif1) set CSThresh_ 2.28289e-11;		#sensing range of 500m
$val(netif1) set RXThresh_ 2.28289e-11;		#communication range of 500m
$val(netif1) set Rb_ 2*1e6
$val(netif1) set Pt_ 0.2818
$val(netif1) set freq_ 914e+6 
$val(netif1) set L_ 1.0

# Initialize the SharedMedia interface with parameters to make
# it work like the 914MHz Lucent WaveLAN DSSS radio interface
$val(netif2) set CPThresh_ 10.0
$val(netif2) set CSThresh_ 8.91754e-10;		#sensing range of 200m
$val(netif2) set RXThresh_ 8.91754e-10;		#communication range of 200m
$val(netif2) set Rb_ 2*1e6
$val(netif2) set Pt_ 0.2818
$val(netif2) set freq_ 914e+6 
$val(netif2) set L_ 1.0

# configure the first 5 nodes with transmission range of 500m 
        $ns node-config -adhocRouting $val(rp) \
			 -llType $val(ll) \
			 -macType $val(mac) \
			 -ifqType $val(ifq) \
			 -ifqLen $val(ifqlen) \
			 -antType $val(ant) \
			 -propType $val(prop) \
			 -phyType $val(netif1) \
			 -channelType $val(chan) \
			 -topoInstance $topo \
             -energyModel $val(energymodel) \
			 -initialEnergy 10 \
             -rxPower 0.5 \
			 -txPower 1.0 \
             -idlePower 0.0 \
			 -sensePower 0.3 \
			 -agentTrace ON \
			 -routerTrace ON \
			 -macTrace OFF \
			 -movementTrace ON

# Node Creation

#node 1
set energy(0) 1000

$ns node-config -initialEnergy 1000 \
                -rxPower 0.5 \
		    	-txPower 1.0 \
                -idlePower 0.0 \
		    	-sensePower 0.3 

	set node_(0) [$ns node]
	$node_(0) color black

#node 2	
set energy(1) 1000

$ns node-config -initialEnergy 1000 \
                -rxPower 0.5 \
		    	-txPower 1.0 \
                -idlePower 0.0 \
		    	-sensePower 0.3 

	set node_(1) [$ns node]
	$node_(1) color black

#node 3	
set energy(2) 1000

$ns node-config -initialEnergy 1000 \
                -rxPower 0.5 \
		    	-txPower 1.0 \
                -idlePower 0.0 \
		    	-sensePower 0.3 

	set node_(2) [$ns node]
	$node_(2) color black
	
#node 4
set energy(3) 1000

$ns node-config -initialEnergy 1000 \
                -rxPower 0.5 \
		    	-txPower 1.0 \
                -idlePower 0.0 \
		    	-sensePower 0.3 

	set node_(3) [$ns node]
	$node_(3) color black
	
# configure the remaining 5 nodes with transmission range of 200m 
        $ns node-config -adhocRouting $val(rp) \
			 -llType $val(ll) \
			 -macType $val(mac) \
			 -ifqType $val(ifq) \
			 -ifqLen $val(ifqlen) \
			 -antType $val(ant) \
			 -propType $val(prop) \
			 -phyType $val(netif2) \
			 -channelType $val(chan) \
			 -topoInstance $topo \
             -energyModel $val(energymodel) \
			 -initialEnergy 10 \
             -rxPower 0.5 \
			 -txPower 1.0 \
             -idlePower 0.0 \
			 -sensePower 0.3 \
			 -agentTrace ON \
			 -routerTrace ON \
			 -macTrace OFF \
			 -movementTrace ON


for {set i 4} {$i < 18} {incr i} {
set energy($i) [expr rand()*500]
$ns node-config -initialEnergy $energy($i) \
                -rxPower 0.5 \
		    	-txPower 1.0 \
                -idlePower 0.0 \
		    	-sensePower 0.3 

	set node_($i) [$ns node]
	$node_($i) color black
}
$node_(0) set X_ 252.0
$node_(0) set Y_ 673.0

$node_(1) set X_ 326.0
$node_(1) set Y_ 512.0

$node_(2) set X_ 445.0
$node_(2) set Y_ 696.0

$node_(3) set X_ 541.0
$node_(3) set Y_ 569.0

$node_(4) set X_ 614.0
$node_(4) set Y_ 711.0

$node_(5) set X_ 751.0
$node_(5) set Y_ 578.0

$ns initial_node_pos $node_(0) 30
$ns initial_node_pos $node_(1) 30
$ns initial_node_pos $node_(2) 30
$ns initial_node_pos $node_(3) 30
$ns initial_node_pos $node_(4) 30
$ns initial_node_pos $node_(5) 30


set tcp1 [new Agent/TCP]
$ns attach-agent $node_(0) $tcp1

set sink1 [new Agent/TCPSink]
$ns attach-agent $node_(5) $sink1
$ns connect $tcp1 $sink1

set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1	


$ns at 0.5 "$ftp1 start"



$ns at 60.0 "finish"

proc finish {} {
global ns tf tf1
$ns flush-trace
close $tf
close $tf1
exec nam wireless1.nam &
exit 0
}

$ns run
