//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulçação de variáveis e controle de ponto flutuante na saída de uma resposta através da conversão de temperatura.

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a temperatura em ºF: ");
        Double f = sc.nextDouble();
        Double c = (f-32) * (5/9);

        System.out.printf("%.1f ºF em celsius é: %.1f ºC", f, c);
        sc.close();
    }
}
