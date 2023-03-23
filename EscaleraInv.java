package Programas;
import java.util.Scanner;

public class EscaleraInv {
    

public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la altura de tu escalera de *: ");
    int altura = sc.nextInt();

    for(int i=altura; i>=1; i--){
        for(int j=i; j>=1; j--)
        
        System.out.print("*"); 
        System.out.println(); 
              
    }sc.close();

}
}