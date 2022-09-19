//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Implementar a classe retângulo.


public class Funcionario {
    String nome;
    Double salarioBruto, desconto;

    public Funcionario(String nome, Double salarioBruto, Double desconto){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.desconto = desconto;
    }


    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    public double setSalarioBruto(double valor){
        return this.salarioBruto = valor;
    }

    public double salarioLiquido(){
        return this.getSalarioBruto()- desconto;
    }

    public void aumentarSalario(double porcentagem){
        this.setSalarioBruto(this.salarioBruto + (this.salarioBruto * (porcentagem /100)));
    }

    @Override
    public String toString(){
        return "Dados do funcionário " + this.nome + ":"
                + "\nSalário líquido: " + String.format("%.2f", salarioLiquido());
    }
}
