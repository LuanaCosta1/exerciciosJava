package exercicio1;

public class Funcionario {

    private int cracha;
    private double salario;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int c, double s, String car) {
        this.setCracha(c);
        this.setSalario(s);
        this.setCargo(car);
        this.imprimirDados();
    }

    public double calculaAumento(double porcentagem) {
        if (this.salario > 0) {
            porcentagem = this.salario * (porcentagem / 100);
        }
        this.setSalario(this.salario + porcentagem);
        return (this.salario + porcentagem);
    }

    public double calculaTempo(int tempo) {
        if (tempo > 0) {
            return (this.salario + (tempo * 150));
        }
        return 0;
    }

    public void imprimirDados() {
        System.out.println("\nCracha: " + this.cracha
                + "\nSalario: " + this.salario
                + "\nCargo: " + this.cargo);
    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
