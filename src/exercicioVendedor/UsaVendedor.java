
package exercicio4;

import java.util.Scanner;

public class UsaVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as vendas: ");
        double vendas = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o salario: ");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o nome: ");
        String nome = (sc.nextLine());
        System.out.println("Digite a quantidade de faltas do vendedor: ");
        int faltas = Integer.parseInt((sc.nextLine()));
        
        Vendedor v1 = new Vendedor(vendas, salario, nome, faltas);
        
        Vendedor v2 = new Vendedor(3000, 1000, "Luana", 2);
    }
}
