public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {return senha;}

    public void setSenha(int senha) {this.senha = senha;}

    public boolean autenticar(int senha){
        return this.getSenha() == senha;
    }

    public Gerente(){
    }

    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("Dados do gerente: \n");
        string.append("Nome: ");
        string.append(this.getNome() + "\n");
        string.append("CPF: ");
        string.append(this.getCpf() + "\n");
        string.append("Salario: R$");
        string.append(String.format("%.2f", this.getSalario()) + "\n									");
        //O ubuntu 2204 da minha maquina ta com problema no layout do teclado, por isso o exercicio ta sem acentos.
        if(this.autenticar(this.getSenha())) string.append("O gerente esta autenticado"); else string.append("O gerente nao esta autenticado");
        return string.toString();
    }
}
