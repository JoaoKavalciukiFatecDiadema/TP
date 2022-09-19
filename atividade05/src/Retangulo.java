//Nome:João Kavalciuki dos Santos Sanches
//RA: 217392221024
//Objetivo: Implementar a classe retângulo.

public class Retangulo {
    double largura, altura;

    public Retangulo(){

    }

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double area(){ return largura * altura;}

    public double perimetro(){return 2 * (largura+altura);}

    public double diagonal(){return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));}

    @Override
    public String toString(){
        return "AREA = " + String.format("%.2f", this.area())
                + "\nPERiMITRO = " + String.format("%.2f", this.perimetro())
                + "\nDIAGONAL = " + String.format("%.2f", this.diagonal());
    }
}
