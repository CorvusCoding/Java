var randomInteger = function(val) {
	var ival = Math.random()*26+97;
	ival = Math.floor(ival);
	return ival;
}
var rInt ;
var i;
for (i = 0; i < 65536; i++){
	rInt	= randomInteger();
	letter = String.fromCharCode(rInt);
	process.stdout.write(letter);
	
} 
