package Programas;

import java.util.Scanner;

//Muestra los números primos entre 1 y 100.
public class Ej21 {
    public static void main(String[] args) {
        
        for(int i=1; i<100; i++){
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % i == 0)
                return false;
        }
            // Si no se pudo dividir por ninguno de los de arriba, sí es primo
            return true;
    }
}

    

