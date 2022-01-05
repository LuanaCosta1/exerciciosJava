package exercicio1;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCargo("Assistente");
        f1.imprimirDados();
        
        Funcionario f2 = new Funcionario(5, 4000, "Manager");
        System.out.println("Salario com aumento de 10%: " + f2.calculaAumento(5) + 
                           "\nSalario baseado no aumento anual com o aumento de 10%: " + f2.calculaTempo(4));
                           
        
    }
}
