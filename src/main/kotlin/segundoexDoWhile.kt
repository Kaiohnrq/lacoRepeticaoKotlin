fun main(){
    /*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
     */
    var soma = 0.0
    var media: Double
    var cont = 0
    do{
        print("Digite um numero: ")
        var num = readln().toInt()

        if(num % 3 == 0){
            soma += num
            cont++
        }
    } while(num > 0)
    media = soma/(cont - 1)
    print("a media dos numeros é $media")

}