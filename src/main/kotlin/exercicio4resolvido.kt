fun main(){
    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0
    var pCalmas = 0
    var mNerv = 0
    var hAgre = 0
    var outCalm = 0
    var pNMaior40 = 0
    var pCMenor18 = 0

    while(cont < 6){

        println("***Pessoa:  ${cont+1}***")

        print("Digite a sua idade: ")
        idade = readln().toInt()

        print("Digite o seu sexo (1 - Feminino / 2 - Masculino / 3 - Outros): ")
        sexo = readln().toInt()

        print("Digite as opções ( 1 - Calmo / 2 - Nervoso / 3 - Agressivo): ")
        opc = readln().toInt()

        if( opc == 1){
            pCalmas++
        }

        if(sexo == 1 && opc == 2){
            mNerv++
        }

        if(sexo == 2 && opc == 3){
            hAgre++
        }

        if(sexo == 3 && opc == 1){
            outCalm++
        }

        if(idade > 40 && opc == 3){
            pNMaior40++
        }

        if(idade < 18 && opc == 1){
            pCMenor18++
        }

        cont++
    }

    println(pCalmas)
    println(mNerv)
    println(hAgre)
    println(outCalm)
    println(pNMaior40)
    println(pCMenor18)


}