//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Ser o entry point da atividade.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Entre com as medidas do retângulo: ");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        sc.nextLine();

        retangulo.largura = largura;
        retangulo.altura = altura;
        System.out.println(retangulo + "\n");
        Funcionario funcionario = new Funcionario("João", 5000.00, 500.00);

        System.out.println(funcionario + "\n");
        System.out.print("Olá, digite a porcentagem de aumento do salário do funcionário " +
                funcionario.nome + ": ");

        double porcentagem = sc.nextDouble();
        sc.nextLine();

        System.out.println();
        funcionario.aumentarSalario(porcentagem);

        System.out.println(funcionario);
        sc.close();
    }
}
