 var contrastButton= document.getElementById('contrastButton'),
   bodyContrast= document.getElementById('bodyContrast'),     
          contador=0;

	function changeColor(){
	   if(contador ==0){
	   bodyContrast.classList.add('Natural');
                    contador=1;
	    }else {
	    bodyContrast.classList.remove('Natural');
                    contador=0;
	}
 }

contrastButton.addEventListener('click',changeColor,true);

var buttonFontSize=document.getElementById('buttonFontSize'),
         bodyContrast=document.getElementById('bodyContrast'), 
                contador=0;

	function changefontSize(){
	if (contador==0){
                 bodyContrast.classList.add('FontSize');
                 contador=1;
                } else{
                  bodyContrast.classList.remove(FontSize);
                 contador=0;
    }
}
 buttonFontSize.addEventListener('click',changefontSize,true);

 

function functionCricketyChangeColor(){
  document.getElementById("cricketyChangeColor").style.color="yellow";
}


function myFunctionresizePosition(){
document.getElementById("currenlyPdfAttribute").classList.add('newBox');
 
}
