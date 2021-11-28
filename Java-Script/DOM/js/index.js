/** Seleção por Marca (TAG);
 * 
 * O comando abaixo guarda na váriavel p1 tudo o que está
 * dentro da TAG p.
 * 
 * Como posso ter mais de um OBJETO da TAG p, eu posso
 * escolher o p desejado definindo sua posição [0], [1] e etc...
 * 
 * Vale lembrar que nesse caso estou pegando tudo que tem dentro
 * do p, não só o texto, mas todas as caracteristicas que podem
 * estar no CSS, seu tamanho, seu tipo e etc...
 */

// ===== PEGANDO TODO O CONTEÚDO DENTRO DE UM TAG =====

var p1 = window.document.getElementsByTagName("p")[0];

// Mostro tudo o que tem dentro do p na posição 0;
console.log(p1);

// Para mostrar apenas o texto dentro do p na posição 0;
console.log(p1.innerText);


// ===== PEGANDO APENAS O TEXTO DENTRO DA TAG =====

// Se eu quiser pegar apenas o texto que está dentro do p e guardar em uma váriavel, basta acrescentar o .innerText no final do get...
var p1Texto = window.document.getElementsByTagName("p")[0].innerText;

console.log(p1Texto);

/**
 * O comando inner tem dois tipos:
 * innerText - Vem o texto sem nenhuma formatação;
 * innerHTML - Vem o texto com a formação e suas caracteristicas.
 */

var p2TextoFormatado = window.document.getElementsByTagName('p')[1].innerHTML;

var p2TextoSemFormatacao = window.document.getElementsByTagName('p')[1].innerText;

console.log(p2TextoFormatado);
console.log(p2TextoSemFormatacao);

// ===== MUDANDO AS PROPRIEDADES DE UM OBJETO =====

// Depois de guardado o objeto que desejo manipular, posso fazer o que quiser com ele. Como por exemplo mudar a sua cor!

// Nesse caso, é preciso selecionar o OBJETO inteiro e não apenas seu conteúdo.

p1.style.backgroundColor = 'white';
p1.style.padding = '10px';
p1.style.color = '#3d3d3d';

// ===== TROCANDO O TEXTO DE UM OBJETO =====

p1.innerText = "Mudei esse texto!";