import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Números: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        if(n1>n2){
            System.out.printf("\nDiferença entre %.2f e %.2f é de %.2f", n1, n2, n1-n2);
        } else {
            System.out.printf("\nDiferença entre %.2f e %.2f é de %.2f", n2, n1, n2-n1);;
        }
        sc.close();
    }
}
