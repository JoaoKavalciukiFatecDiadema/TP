public class Main {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente("Fernando", "1234", false,
                1500.00, 'M', 29);
        ContaCorrente conta2 = new ContaCorrente("Maria", "5312", true,
                530.11, 'F', 45);
        ContaCorrente conta3 = new ContaCorrente("João", "9621", true,
                4325.12, 'M', 53);

        System.out.println(conta1);
        System.out.println();
        System.out.println(conta2);
        System.out.println();
        System.out.println(conta3);
        System.out.println();

        Aluno aluno = new Aluno("Yohanan", "111111 - DSM", 7.5, 5.0, 0.0);
        System.out.println(aluno);
    }
}
