//Crear una app que calcule el area de un circulo cuadrado o triangulo. Pediremos que figura queremos calcular su area y segun lo introducida
//pedira los valores necesarios para calcular el area. Crea un mètodo para cada figura para calcular cada area.
//este devolverá un numero real, muestra el resultado en pantalla. 
// area circulo = pi*radio`2 , area triangulo b*h/2 , guadrado l*l
package Programas;

import java.util.Scanner;

public class CalculaAreas{

    /*
    * Método que regresa el area de un circulo
    * @param el radio de un circulo
    * @return el area de un circulo
    */
    public double areaCirculo(double radio){
        double area;
        area = 3.1416 * Math.pow(radio,2);
        return area;
    }
    /*
    * Método que regresa el area de un cuadrado
    * @param el lado de un cuadrado
    * @return el area de un cuadrado
    */
    public double areaCuadrado(double lado){
        double producto;
        producto = lado * lado;
        return producto;
    }
    /*
    * Método que regresa el area de un circulo
    * @param la base de un triangulo
    * @param la altura de un triangulo
    * @return el area de un triangulo
    */
    public double areaTriangulo(double base, double altura){
        return (base * altura)/2;
    }


    public static void main(String[] args) {
        
        CalculaAreas uno = new CalculaAreas();

        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular el area\nCirculo presiona 1\nCuadrado presiona 2\nTriangulo presiona 3");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1: 
            
            System.out.println("Ingresa el radio del circulo para calcular su area");
            double radio = sc.nextDouble();
            double respuesta = uno.areaCirculo(radio);
            System.out.println(respuesta);
            break;

            case 2: 

            System.out.println("Ingresa el lado de un cuadrado");
            double lado = sc.nextDouble();
            double respuesta2 = uno.areaCuadrado(lado);
            System.out.println(respuesta2);
            break;

            case 3: 

            System.out.println("Ingresa la base");
            double base = sc.nextDouble();
            System.out.println("Ingresa la altura");
            double altura = sc.nextDouble();
            double respuesta3 = uno.areaTriangulo(base, altura);
            System.out.println(respuesta3);
            
            
            break;
            default:
            System.out.println("ingresa una opción valida");
            
        }sc.close();

    }
}