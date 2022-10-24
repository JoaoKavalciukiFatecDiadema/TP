public class Main {
    public static void main(String[] args) {
        Funcionario yohanan = new Funcionario("Yohanan", "11111111111", 3500);
        Gerente joao = new Gerente("Joao", "36040659840", 6000.00);
        Caminhao scaniaP310 = new Caminhao("BRA3N52", 2019, 9);
        Onibus apacheVipIV = new Onibus("BEE4R22", 2014, 40);

        System.out.println(joao);
        System.out.println();
        System.out.println(yohanan);
        System.out.println();
        scaniaP310.exibirDados();
        System.out.println();
        apacheVipIV.exibirDados();
    }
}