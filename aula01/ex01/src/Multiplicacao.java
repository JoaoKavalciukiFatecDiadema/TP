//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Soma de dois números  (revisar conceito de manipulação de variável e de entrada e saída de dados)

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe dois números: ");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        sc.nextLine();

        System.out.printf("\nA multiplicação de %.2f por %.2f é %.2f.", a, b, (a*b));

        sc.close();
    }
}
