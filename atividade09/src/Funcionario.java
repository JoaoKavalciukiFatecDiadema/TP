public class Funcionario {
    private String nome, cpf;
    private double salario;

    public Funcionario(){
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public Funcionario(String nome, String cpf, double salario){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
    }


    
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("Dados do Funcionario:\n");
        string.append("Nome: ");
        string.append(this.getNome() + "\n");
        string.append("CPF: ");
        string.append(this.getCpf()+ "\n");
        string.append("Salario: R$");
        string.append(String.format("%.2f",this.getSalario()));
        return string.toString();
    }
}
