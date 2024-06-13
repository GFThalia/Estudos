const prompt = require('readline-sync');
const idade = Number(prompt.question('Qual sua idade?'));
const eMaiorDeIdade = idade >= 18;

// condicional simples
if (eMaiorDeIdade){
    console.log('Você é maior de idade');
}else{
    console.log('Você não é maior de idade');
}

// else if
const mediaDoAluno = 7;
if(mediaDoAluno >=7){
    console;log('Aprovado!')
} else if (mediaDoAluno < 7 && mediaDoAluno >= 5){
    console.log('Prova Final');
}else {
    console.log('Reprovado!')
}

//switch case
const permissoes = 'aluno'
switch(permissoes){
    case 'aluno':
        console.log('Visualiza apenas as aulas');
        break;
    case 'professor':
        console.log('Pode configurar as aulas');
        break;
    case 'adm':
        console.log('Acesso total aos sistema');
        break;
    default: 
        console.log('Erro');
}

//operador ternario
const idade1 = 21;
idade1 >= 18 ? console.log('maior de idade') : console.log('menor de idade');

const mensagem = idade1 >= 18 ? 'menor de idade': 'maior de idade'
console.log(mensagem);
