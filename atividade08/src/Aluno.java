public class Aluno {
    String nome;
    float n1, n2, n3;

    public Aluno(){
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, float n1, float n2, float n3){
        this.setNome(nome);
        this.setN1(n1);
        this.setN2(n2);
        this.setN3(n3);
    }

    public float calcularMedia(){
        return (this.getN1() + this.getN2() + this.getN3());
    }
    
    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("Aluno" + this.getNome() + ":\n");
        string.append("Nota final: " + this.calcularMedia() + "\n");
        if(calcularMedia() >= 60){
            string.append("Aprovado.");
        } else {
            string.append("Reprovado.\n" );
            string.append("Faltam " + (60 - this.calcularMedia()) + " pontos.");
        }
        return string.toString();
    }
}
