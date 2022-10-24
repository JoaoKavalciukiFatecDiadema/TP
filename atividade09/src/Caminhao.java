public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(){
    }

    public int getEixos() {
        return this.eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.setEixos(eixos);
    }

    @Override
    public void exibirDados(){
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Quantidade de eixos: " + this.getEixos());
    }
}