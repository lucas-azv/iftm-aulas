nome = prompt("insira seu nome completo")

do {
    idade = prompt("Agora insira sua idade")
}
while(idade <= 0)

if(idade >= 18){
    alert("Você já tem idade para tirar CNH")
} else{
    alert(`Você ainda não tem idade para tirar CNH, ainda faltam ${18 - idade} anos`)
}