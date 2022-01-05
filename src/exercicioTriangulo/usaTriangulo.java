package exercicio2;

import java.util.Scanner;
public class usaTriangulo {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(10, 20);
        
        Scanner sc = new Scanner(System.in);
        
        Triangulo t2 = new Triangulo();
        System.out.println("Digite a base do triângulo: ");
        t2.setBase(sc.nextDouble());
        System.out.println("Digite a altura do triângulo: ");
        t2.setAltura(sc.nextDouble());
        t2.imprimeDados();
    }
    
}
