package exercicio3;

import java.util.Scanner;

public class UsaTorneio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = (sc.nextLine());
        System.out.println("Digite a idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        
        Torneio t1 = new Torneio(nome, idade);
        
        Torneio t2 = new Torneio("Julia", 16);
    }
}
