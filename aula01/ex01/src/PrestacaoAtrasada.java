//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulçação de var´iavel float para cálculo de prestação atrasada

import java.util.Scanner;

public class PrestacaoAtrasada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor da prestação em atraso: ");
        float valorPrestacaoAtrasada = sc.nextFloat();
        sc.nextLine();

        System.out.println("Entre com a taxa de juros");
        float taxaDeJuros = sc.nextFloat();
        sc.nextLine();

        System.out.println("Quantos dias a prestação está atrasada");
        int diasEmAtraso = sc.nextInt();
        float valorASerPago = valorPrestacaoAtrasada + (valorPrestacaoAtrasada + (taxaDeJuros/100) * diasEmAtraso);
        System.out.printf("O valor da prestação com o juros é R$%.2f", valorASerPago);
        sc.close();
    }
}