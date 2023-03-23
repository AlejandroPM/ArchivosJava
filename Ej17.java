package Programas;

import java.util.Scanner;

//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
public class Ej17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana");
        //Ingresa el día sin importar si el usuario lo escribe en Mayus.
        String dia = sc.nextLine().toLowerCase();

        switch(dia){
            case "lunes": System.out.println("Es Laboral");
            break;

            case "martes": System.out.println("Es Laboral");
            break;

            case "miercoles": System.out.println("Es Laboral");
            break;

            case "jueves": System.out.println("Es Laboral");
            break;

            case "viernes": System.out.println("Es Laboral");
            break;

            case "sabado": System.out.println("No es Laboral");
            break;

            case "domingo": System.out.println("No es Laboral");
            break;

            default: System.out.println("Ingresa un día valido");
        }
        sc.close();
    }
}
