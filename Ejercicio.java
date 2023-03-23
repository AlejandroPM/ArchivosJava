package Programas;
//Programa que permita ver si el número que ingreso es par o impar
//y si ya lo coloqué que me diga que ya fue colocado. (guardar en un arreglo)
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> guardadospares = new ArrayList<Integer>(); //creo lista de numeros 
        ArrayList<Integer> guardadosimpares = new ArrayList<Integer>();
        while(true){
            System.out.println("Ingresa un número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) { //que sea divisible entre dos es PAR
                if(guardadospares.contains(num)){ //si la lista de guardados tiene el numero que ingresas, ya lo pusiste
                    System.out.println("ya se guardó");
                }else{
                    guardadospares.add(num);
                    System.out.println("Es par");
                }
            }else{
                if(guardadosimpares.contains(num)){
                    System.out.println("ya se guardo");
                }else{
                    guardadosimpares.add(num);
                    System.out.println("es impar");
                }
            }
        }
    }
}