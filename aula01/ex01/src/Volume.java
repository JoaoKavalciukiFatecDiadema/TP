//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulão de tipos diferentes de varíaveis com ponto flutuante.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Para efetuar o cálculo do volume da lata de óleo entre com as seguintes informações:");
        System.out.print("Raio da lata (cm): ");
        float raio = sc.nextFloat();
        sc.nextLine();
        System.out.print("Altura da lata (cm): ");
        Double altura = sc.nextDouble();
        sc.nextLine();
        Double volume = 3.14159 * Math.pow(raio, 2) * altura;
        System.out.printf("o volume da lata é: %.2f", volume);
        sc.close();
    }
}
