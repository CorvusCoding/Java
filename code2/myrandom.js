//myrqdmon.js  by sid

var randomInteger = function(val) {
	var ival = Math.random()*256;
//	console.log(ival);
	ival = Math.floor(ival);
	//console.log(ival);
	return ival;
	
}
var rInt ;
var i;
for (i = 0; i < 65; i++) {
rInt = randomInteger();
process.stdout.write(rInt+",");
}
