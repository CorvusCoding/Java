<canvas id="myCanvasMatrix" width="500" height="200" style="border:1px solid #c3c3c3;">
Please Upgrade your browser
</canvas>
var c1=document.getElementById("myCanvasMatrix");
var ctx1=c1.getContext("2d");
var Matrix=function(){
ctx1.fillStyle='rgba(0,0,0,.05)';
ctx1.fillRect(0,0,500,500);
ctx1.fillStyle="#0f0";
ctx1.fillText('Matrix', Math.random()*(500), Math.random()*(500));
};
setInterval(Matrix,30);
