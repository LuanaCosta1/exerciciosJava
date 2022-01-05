package exercicio4;

public class Vendedor {
    private double vendas;
    private double salario;
    private String nome;
    private int falta;

    public Vendedor(double v, double s, String n, int f) {
        this.setVendas(v);
        this.setSalario(s);
        this.setNome(n);
        this.setFalta(f);
        this.calcularSalario();
        this.imprimirDados();
    }
    
    private void imprimirDados(){
        System.out.println("\nVendas: " + this.getVendas() +
                           "\nSalario: " + this.getSalario() + 
                           "\nNome: " + this.getNome() + 
                           "\nFaltas: " + this.getFalta());
    }
    
    private double calcularComissao(){
        if(this.vendas >= 1000 && this.vendas < 2000){
            return (this.vendas * 0.10);
        }
        else {
            if(this.vendas >= 2000){
                return (this.vendas * 0.15);
            }
            return 0;
        }     
    }
    
    private double descontoFalta(){
        return (this.salario / 30) * this.falta;
    }
    
    private void calcularSalario(){
        this.setSalario(this.salario + this.calcularComissao() - this.descontoFalta());
    }

    public double getVendas() {
        return vendas;
    }

    private void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    private void setFalta(int falta) {
        this.falta = falta;
    }
}

