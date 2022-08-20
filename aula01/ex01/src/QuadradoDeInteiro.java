//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulçação de inteiros para chegar à um quadrado.

import java.util.Scanner;

public class QuadradoDeInteiro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número inteiro que deseja saber o quadrado: ");
        Integer numero = sc.nextInt();
        System.out.printf("O quadrado de %d é %d", numero, (numero*numero));
        sc.close();
    }
}
