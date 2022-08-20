//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Uso de operador mod(%) para chegar ao resto de uma divisão

import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com número que quer saber o resto da divisão por 6: ");
        Double numero = sc.nextDouble();

        System.out.printf("O resto de %.2f por 6 é %.1f", numero, (numero%6));
        sc.close();
    }
}
