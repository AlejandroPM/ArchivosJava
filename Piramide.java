package Programas;
import java.util.Scanner;

public class Piramide{
    

public static void main(String[] args) {

    int espacios, asteriscos;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altura de tu escalera de *: ");
    int altura = sc.nextInt();

    for(espacios = altura, asteriscos = 1; asteriscos <= (altura*2)-1;espacios--,asteriscos+=2){
        for(int i = 0; i < espacios; i++){
            System.out.print(" ");
        }
        for(int j= asteriscos; j!=0; j--){
            System.out.print("*");
        }
        System.out.println();
          
         
              
    }sc.close();

}
}