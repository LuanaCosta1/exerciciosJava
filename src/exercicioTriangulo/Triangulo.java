package exercicio2;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(){
    }
    
    public Triangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
        this.imprimeDados();
    }
    
    private double calculaArea(){
        return ((this.base * this.altura)/2);
    }
    
    public void imprimeDados(){
        System.out.println("\nBase: " + this.base +
                           "\nAltura: " + this.altura +
                           "\nArea: " + this.calculaArea() + "\n");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
