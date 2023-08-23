do{
    nota1 = prompt("Insira sua nota do 1º período")
} while(nota1 < 0 || nota1 > 100)

do{
    nota2 = prompt("Insira sua nota do 2º período")
} while(nota2 < 0 || nota2 > 100)

somaNotas = parseFloat(nota1) + parseFloat(nota2)

if(somaNotas >= 60.0){
    alert("você foi aprovado")
} else{
    alert("você foi reprovado")
}