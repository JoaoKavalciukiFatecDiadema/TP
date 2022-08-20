//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Utilização de varáveis float para conversão de dólar para real.

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a cotação atual do dólar: ");
        float cotacao = sc.nextFloat();
        sc.nextLine();
        System.out.print("Quantos dólares você tem? ");
        float dolares = sc.nextFloat();

        float reais = dolares * cotacao;

        System.out.printf("Ao trocar seu dinheiro na casa de câmbio você receberá: R$%.2f", reais);
        sc.close();
    }
}
