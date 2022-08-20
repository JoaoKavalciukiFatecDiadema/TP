//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Uso de três variáveis (duas com a entrada feita pelo usuário através do pacote Scanner) para efetuar a troca de valores.

import java.util.Scanner;

public class TrocaDeValores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre o valor de A: ");
        Integer a = sc.nextInt();
        System.out.print("Entre o valor de B: ");
        Integer b = sc.nextInt();
        System.out.println();
        System.out.printf("Valores inciais de A e B respectivamente: %d %d", a, b);

        Integer aux = a;
        a = b;
        b = aux;

        System.out.printf("Novos valores de A e B respectivamente %d %d", a, b);
        sc.close();
    }
}
