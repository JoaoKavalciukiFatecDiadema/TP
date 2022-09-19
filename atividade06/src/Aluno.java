
//Nome: João Kavalciuki dos Santos Sanches
//RA: 2171392221024
//Objetivo Implementar a classe aluno
public class Aluno {
    private String nome, matricula;
    private double nota1, nota2, notaReavaliacao;

    public Aluno(){
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getMatricula(){return this.matricula;}
    public void setMatricula(String matricula){this.matricula = matricula;}

    public double getNota1(){return this.nota1;}
    public void setNota1(double nota1){this.nota1 = nota1;}

    public double getNota2(){return this.nota2;}
    public void setNota2(double nota2){this.nota2 = nota2;}

    public double getNotaReavaliacao() {return notaReavaliacao;}

    public void setNotaReavaliacao(double notaReavaliacao) {this.notaReavaliacao = notaReavaliacao;}

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNotaReavaliacao(notaReavaliacao);
    }

    public double calcularMedia(){return (nota1+nota2) / 2;}

    public double calcularMediaFinal(){
        if(calcularMedia() >= 6) return calcularMedia();
        return (calcularMedia() + notaReavaliacao) / 2;
    }

    @Override
    public String toString(){
        return "Dados do aluno de matricula " + this.getMatricula() + ": "
                + "\nNome: " + this.getNome()
                + "\nPrimeira nota: " + String.format("%.1f", this.getNota1())
                + "\nSegunda nota: " + String.format("%.1f", this.getNota2())
                + "\nNota Reavaliativa: " + String.format("%.1f", this.getNotaReavaliacao())
                + "\nMédia Final: " + String.format("%.1f", calcularMedia());
    }
}
