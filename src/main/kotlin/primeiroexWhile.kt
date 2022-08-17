fun main(){
    /*
    3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    idade for =-99.
     */
    print("Digite a sua idade: ")
    var idade = readln().toInt()

    var menor21 = 0
    var maior50 = 0

    while(idade!=-99){
        print("Digite a sua idade: ")
        idade = readln().toInt()
        if(idade < 21){
            menor21++
        }
        if(idade > 50){
            maior50++
        }


    }

    println("O numero de pessoas com idade inferior a 21 anos é de $menor21")
    print("O numero de pessoas com idade superior a 50 anos é de $maior50")

}