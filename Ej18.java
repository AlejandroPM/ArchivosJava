package Programas;

import java.util.Scanner;

//Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
//Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
public class Ej18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("10 Numeros random");
        for(int i = 0; i<10; i++){
            int random = (int)Math.floor(Math.random()*(n1-n2)+n2);
            System.out.println(random);
        }
        sc.close();
    }
}
