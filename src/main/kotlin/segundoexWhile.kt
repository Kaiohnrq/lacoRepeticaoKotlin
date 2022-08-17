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
    var menor18 = 0
    var maior40 = 0

    while(entrevistado <= 5){
        print("Qual a sua idade?")
        idade = readln().toInt()
        print("Qual o seu sexo? (1 - F, 2 - M, 3 - Outros")

    }
}