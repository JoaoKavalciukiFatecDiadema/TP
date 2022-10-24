public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(){
        super();
    }

    public int getAssentos() {
        return this.assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.setAssentos(assentos);
    }

    public void exibirDados(){
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Quantidade de assentos: " + this.getAssentos());
    }
}


