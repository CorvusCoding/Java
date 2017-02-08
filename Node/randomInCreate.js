var randomInterger = function(val) {
	var ival = Math.random()*256;
	ival = Math.floor(ival);
	return ival;
	
}
var rInt ;
var i;
for (i = 0; i < 65; i++) {
rInt	= randomInterger();
process.stdout.write(rInt=",");
}
