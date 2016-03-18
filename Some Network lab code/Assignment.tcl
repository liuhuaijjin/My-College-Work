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
set tf1 [open wireless1.nam w]
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
set node3 [$ns node]
set node4 [$ns node]

$node0 set X_ 50.0
$node0 set Y_ 50.0
$node1 set X_ 50.0
$node1 set Y_ 100.0
$node2 set X_ 100.0
$node2 set Y_ 100.0
$node3 set X_ 50.0
$node3 set Y_ 150.0
$node4 set X_ 50.0
$node4 set Y_ 200.0

$ns initial_node_pos $node0 30
$ns initial_node_pos $node1 30
$ns initial_node_pos $node2 30
$ns initial_node_pos $node3 30
$ns initial_node_pos $node4 30


set tcp0 [new Agent/TCP]
$ns attach-agent $node0 $tcp0
set tcp1 [new Agent/TCP]
$ns attach-agent $node1 $tcp1
set tcp3 [new Agent/TCP]
$ns attach-agent $node3 $tcp3
set tcp4 [new Agent/TCP]
$ns attach-agent $node4 $tcp4

set sink1 [new Agent/TCPSink]
$ns attach-agent $node2 $sink1
$ns connect $tcp0 $sink1
set sink2 [new Agent/TCPSink]
$ns attach-agent $node2 $sink2
$ns connect $tcp1 $sink2
set sink3 [new Agent/TCPSink]
$ns attach-agent $node2 $sink3
$ns connect $tcp3 $sink3
set sink4 [new Agent/TCPSink]
$ns attach-agent $node2 $sink4
$ns connect $tcp4 $sink4

set ftp0 [new Application/FTP]
$ftp0 attach-agent $tcp0
set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1
set ftp3 [new Application/FTP]
$ftp3 attach-agent $tcp3
set ftp4 [new Application/FTP]
$ftp4 attach-agent $tcp4

$ns at 0.5 "$ftp0 start"
$ns at 0.5 "$ftp1 start"
$ns at 0.5 "$ftp3 start"
$ns at 0.5 "$ftp4 start"
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
