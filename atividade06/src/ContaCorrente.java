public class ContaCorrente{
    private String nomeCorrentista, numeroConta;
    private char sexo;
    private int idade;
    private double saldo;
    private boolean contaConjunta = false;
    //Não coloquei final porque n permite alteração
    private  char TIPO_DE_CONTA = 'I';

    public ContaCorrente(){
    }

    public String getNomeCorrentista(){return this.nomeCorrentista;}
    public void setNomeCorrentista(String nomeCorrentista){this.nomeCorrentista = nomeCorrentista;}

    public String getNumeroConta(){return this.numeroConta;}
    public void setNumeroConta(String numeroConta){this.numeroConta = numeroConta;}

    public char getSexo(){return  this.sexo;}
    public void setSexo(char sexo){this.sexo = sexo;}

    public int getIdade(){return this.idade;}
    public void setIdade(int idade){this.idade = idade;}

    public double getSaldo(){return this.saldo;}
    public void setSaldo(double saldo){this.saldo = saldo;}

    public boolean getContaConjunta(){return this.contaConjunta;}
    public void setContaConjunta(boolean contaConjunta){
        this.contaConjunta = contaConjunta;
        if(this.contaConjunta) this.TIPO_DE_CONTA = 'C';
    }

    public char getTIPO_DE_CONTA() {return TIPO_DE_CONTA;}

    public void sacar(double valor)throws Exception{
        if(this.saldo < valor) throw new Exception("Valor informado maior do que o existente na conta " + this.getNumeroConta() + ".");
        this.setSaldo((this.saldo - valor));
    }

    public void depositar(double valor){this.setSaldo((this.saldo + valor));}

    public ContaCorrente(String nomeCorrentista, String numeroConta, boolean contaConjunta, double saldo, char sexo,
                         int idade)
    {
        this.setNomeCorrentista(nomeCorrentista);
        this.setNumeroConta(numeroConta);
        this.setSexo(sexo);
        this.setIdade(idade);
        this.setSaldo(saldo);
        this.setContaConjunta(contaConjunta);
    }

    @Override
    public String toString(){
        // I = individual C = Conjunta
        return "Dados da conta " + this.getNumeroConta() + ": "
                + "\nNome do correntista: " + this.getNomeCorrentista()
                + "\nSexo do dono: " + this.getSexo()
                + "\nIdade do correntista: " + this.getIdade() + " anos"
                + "\nTipo de conta: " + this.getTIPO_DE_CONTA()
                + "\nSaldo em conta: R$" + String.format("%.2f", this.getSaldo());
    }
}
