package Programas;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la opcion que necesites + para suma - para resta * para multi / para div % para el reciduo x para exponente log para logritmo");
        String opcion = sc.nextLine();
        double result=0, n1=0, n2=0;

        switch(opcion){

            case "+": 
            System.out.println("dame 2 nums");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = n1 + n2;
            System.out.println("el resultado es "+result+"  ");
            break;

            case "-": System.out.println("dame 2 nums");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = n1 - n2;
            System.out.println("el resultado es "+result+"  ");
            break;

            case "*": System.out.println("dame 2 nums");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = n1 * n2;
            System.out.println("el resultado es "+result+"  ");
            break;

            case "/": System.out.println("dame 2 nums");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = n1 / n2;
            System.out.println("el resultado es "+result+"  ");
            break;

            case "%": System.out.println("dame 2 nums");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = n1 % n2;
            System.out.println("el resultado es "+result+"  ");
            break;

            case "log": System.out.println("dame 1 nm para sacar log");
            n1 =sc.nextDouble();
            result = Math.log(n1);
            System.out.println("el resultado es "+result+"");
            break;

            case "x": System.out.println("dame 2 nums primero base luego exp");
            n1 =sc.nextDouble();
            n2=sc.nextDouble();
            result = Math.pow(n1, n2);
            System.out.println("el resultado es "+result+"");
            break;
            default:
            System.out.println("Opcion no válida");


        }
        sc.close();

    }
}