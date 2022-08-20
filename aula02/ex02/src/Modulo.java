import java.util.Scanner;

public class Modulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        if(n < 0) System.out.print("Módulo: " + n*-1); else System.out.print("Módulo: " + n);
        sc.close();
    }
}
