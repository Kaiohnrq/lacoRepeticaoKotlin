fun main(){
    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.
     */
    var idade: Int
    var entrevistado = 0
    var pessoaCalma = 0
    var mulherNervosa = 0
    var homemAgressivo = 0
    var outrosCalmo = 0
    var nervosa40 = 0
    var calma18 = 0

    while(entrevistado < 5){
        print("Qual a sua idade? ")
        idade = readln().toInt()
        print("Qual o seu sexo? (1 - F, 2 - M, 3 - Outros) ")
        var resp = readln()
        print("Voce é: 1 - Calmo, 2 - Nervoso, 3 - Agressivo? ")
        var psico = readln()
        if(psico == "1"){
            pessoaCalma++
        }
        if(resp == "1" && psico == "2"){
            mulherNervosa++
        }
        if(resp == "2" && psico == "3"){
            homemAgressivo++
        }
        if(resp == "3" && psico == "1"){
            outrosCalmo++
        }
        if(psico == "2" && idade > 40){
            nervosa40++
        }
        if(psico == "1" && idade < 18){
            calma18++
        }
        entrevistado++
    }
    println("Foram entrevistados $entrevistado pessoas!")
    println("O numero de pessoas que se declararam calmas é de: $pessoaCalma")
    println("O numero de mulheres que se declararam nervosas é de: $mulherNervosa")
    println("O numero de homens que se declararam agressivos é de: $homemAgressivo")
    println("O numero de pessoas que se declararam como Outro e se dizem calmo é de: $outrosCalmo")
    println("O numero de pessoas que tem acima de 40 anos e se declaram nervosas é de: $nervosa40")
    println("O numero de pessoas que tem abaixo de 18 anos e se declaram calmas é de: $calma18")

}