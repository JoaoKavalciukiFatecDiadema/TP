//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulçação de variáveis e controle de ponto flutuante na saída de uma resposta através da conversão de temperatura.

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a temperatura em ºC: ");
        float c = sc.nextFloat();
        float f = (9 * c + 160) / 5f;

        System.out.printf("%.1f ºC em Fahrenheit é: %.1f ºF", c, f);

        sc.close();
    }
}
