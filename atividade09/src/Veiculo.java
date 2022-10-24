public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(){
    }

    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public Veiculo(String placa, int ano){
        this.setPlaca(placa);
        this.setAno(ano);
    }

    public void exibirDados(){
        System.out.println("Dados do veiculo:");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
    }
}