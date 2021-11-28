// Variável global;
var area = window.document.getElementById("area");

// Observadores de Eventos;
area.addEventListener('click', clicar);
area.addEventListener("mouseenter", entrar);
area.addEventListener('mouseout', sair);

function clicar(){
    area.innerHTML = "Clicou!";
    area.style.background = "red";
}

function entrar(){
    area.innerText = "Entrou!";
    area.style.background = "blue";
}

function sair(){
    area.innerText = "Saiu!";
    area.style.background = "green";
}

// ====== SCRIPT DE SOMA ===========================================

// Variáveis Globais;
var objNome = window.document.getElementById('nome');
var objN1 = window.document.getElementById('n1');
var objN2 = window.document.getElementById('n2');
var objTexto = window.document.getElementById('texto');
var objResult = window.document.getElementById('result');

// Observadores de Eventos;
btnSomar.addEventListener('click', somar);
btnLimpar.addEventListener('click', limpar);



function somar(){

    var n1 = Number(objN1.value);
    var n2 = Number(objN2.value);
    var nome = String(objNome.value);

    var soma = n1 + n2;

    
    objTexto.style.display = 'block';
    objTexto.innerHTML = `Olá <span>${nome}</span>, sejá bem Vindo!`;

    objResult.innerHTML = `A soma entre <span>${n1}</span> e <span>${n2}</span> é igual a <span>${soma}</span>`;

}

function limpar(){

    objNome.value = null;

    objN1.value = null;
    objN2.value = null;

    objResult.innerText = 'Resultado!';
    objResult.style.color = 'black';

    objTexto.style.display = 'none';
}
