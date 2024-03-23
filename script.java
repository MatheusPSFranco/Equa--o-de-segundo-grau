var botao = document.getElementById("botao");
botao.addEventListener("click", alertar, false);
var n1 = document.getElementById("a");
var n2 = document.getElementById("b");
var n3 = document.getElementById("c");

var saida = document.getElementById("saida-de-dados");


function alertar(event){
    var a = parseInt(n1.value);
    var b = parseInt(n2.value);
    var c = parseInt(n3.value);
    var del = (b*b)-(4*a*c);
    var x1 = (-b + Math.sqrt(del))/ (2*a);
    var x2 = (-b - Math.sqrt(del))/ (2*a);
    if(isNaN(del)){
        if(isNaN(a)){
            alert("Coloque o valor do A");
            return;
        }
        if(isNaN(b)){
            alert("Coloque o valor do B");
            return;
        }
        if(isNaN(c)){
            alert("Coloque o valor do C");     
            return;
        }
    }
    if(del==0){
    saida.innerText = "Delta: " + del +
                      "\nX1 e X2 são: " + x1;
    
    document.getElementById("saida-de-dados").style.backgroundColor="#7ac0fa";
    document.getElementById("saida-de-dados").style.border="#000000 3px solid";
    }
    else if(del<0){
        saida.innerText = "Delta: " + del +
                      "\nPor tanto, não é possivel calcular X1 e X2";
    
    document.getElementById("saida-de-dados").style.backgroundColor="#7ac0fa";
    document.getElementById("saida-de-dados").style.border="#000000 3px solid";
    }
    else{
       saida.innerText = "Delta: " + del +
                      "\nX1: " + x1 +
                      "\nX2: " + x2;
    
    document.getElementById("saida-de-dados").style.backgroundColor="#7ac0fa";
    document.getElementById("saida-de-dados").style.border="#000000 3px solid"; 
    }
}
