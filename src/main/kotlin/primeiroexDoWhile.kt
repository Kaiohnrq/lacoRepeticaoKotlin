fun main(){
    /*
    5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
     */
    var num = 0
    var soma = 0
    do{
        print("Digite um numero: ")
        num = readln().toInt()

        soma += num
    }while(num > 0)
    print("A soma dos numeros digitados é de: $soma")

}