fun main(){
    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     */
        var par = 0
        var impar = 0

        for(i in 1..10 ){
        print("Digite um numero: ")
        var num = readln().toInt()

        if(num % 2 == 0){
            par++
        } else {
            impar++
        }

        }
        println("Voce Digitou $par numeros pares!")
        print("Voce digitou $impar numeros impares!")
}