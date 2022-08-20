//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulação de variáveis e constantes em Java.

import java.util.Scanner;

public class AreaCircunferencia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;

        System.out.print("Entre o raio do círculo (cm):");
        float raio = sc.nextFloat();
        double area = PI * (Math.pow(raio, 2));
        System.out.printf("\nÁrea do círculo: %.2f", area);
        sc.close();
    }
}