//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Manipulçação da biblioteca LocalDate para cálculo de idade.

import java.time.LocalDate;
import java.util.Scanner;

public class Idade{
    public static void main(String[] args){
        //Padrão ISO 8601 Data (sem hora)
        //2022-08-14 (dia que eu fiz o exercício)
        //2002-05-02 (usei meu aniversário como teste)

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua data de aniversário (AAAA-MM-DD):");
        String dataNascimento = sc.nextLine();
        LocalDate dataAtualISO = LocalDate.parse(LocalDate.now().toString());
        LocalDate dataNascimentoISO = LocalDate.parse(dataNascimento);
        //Quantos dias teve de 1970 até hoje.
        long diasAteHoje = dataAtualISO.toEpochDay();
        //Quantos dias teve de 1970 até o nascimento da pessoa
        long diasAteONascimento = dataNascimentoISO.toEpochDay();
        long diasDeVida = diasAteHoje - diasAteONascimento;

        System.out.printf("Você tem %d dias de vida", diasDeVida);
        sc.close();
    }
}
