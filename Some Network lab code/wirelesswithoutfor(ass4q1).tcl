set val(chan) Channel/WirelessChannel
set val(prop) Propagation/TwoRayGround
set val(netif) Phy/WirelessPhy
set val(mac) Mac/802_11
set val(ifq) Queue/DropTail/PriQueue
set val(ll) LL
set val(ant) Antenna/OmniAntenna
set val(ifqlen) 50
set val(nn) 3
set val(rp) DSDV

set ns [new Simulator]
set tf [open wireless.tr w]
$ns trace-all $tf
set tf1 [open wireless.nam w]
$ns namtrace-all-wireless $tf1 500 500

set topo [new Topography]
$topo load_flatgrid 500 500

create-god $val(nn)
$ns node-config -adhocRouting $val(rp) \
-llType $val(ll) \
-macType $val(mac) \
-ifqType $val(ifq) \
-ifqLen $val(ifqlen) \
-antType $val(ant) \
-propType $val(prop) \
-phyType $val(netif) \
-channelType $val(chan) \
-topoInstance $topo \
-agentTrace ON \
-routerTrace ON \
-macTrace ON \
-movementTrace OFF \

set node0 [$ns node]
set node1 [$ns node]
set node2 [$ns node]

$node0 set X_ 50.0
$node0 set Y_ 50.0

$node1 set X_ 100.0
$node1 set Y_ 200.0

$node2 set X_ 150.0
$node2 set Y_ 450.0

$ns initial_node_pos $node0 30
$ns initial_node_pos $node1 30
$ns initial_node_pos $node2 30


set tcp1 [new Agent/TCP]
$ns attach-agent $node0 $tcp1

set sink1 [new Agent/TCPSink]
$ns attach-agent $node2 $sink1
$ns connect $tcp1 $sink1

set ftp [new Application/FTP]
$ftp attach-agent $tcp1

$ns at 0.5 "$ftp start"
$ns at 2.0 "$node2 setdest 50.0 350.0 10.0"
$ns at 2.0 "$node1 setdest 75.0 450.0 300.0"
$ns at 2.0 "$node0 setdest 100.0 200.0 100.0"
$ns at 60.0 "finish"

proc finish {} {
global ns tf tf1
$ns flush-trace
close $tf
close $tf1
exec nam wireless.nam &
exit 0
}

$ns run
