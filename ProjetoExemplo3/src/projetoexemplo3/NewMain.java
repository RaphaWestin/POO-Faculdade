/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemplo3;
import java.util.Scanner;

public class NewMain {
    
    public static void main(String[] args) {
        int n1, n2, resultado;
        Scanner in = new Scanner(System.in); // pode ser qualquer nome.
        System.out.print("Digite o primeiro numero: ");
        n1= in.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2= in.nextInt();
        System.out.println("A soma e: " + (n1+n2));
        System.out.println("A Subtracao e: " + (n1-n2));
        System.out.println("A Multiplicacao e: " + (n1*n2));
        System.out.println("A Divisao e: " + (n1/n2));
    }  
}
