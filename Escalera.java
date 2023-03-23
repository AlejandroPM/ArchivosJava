package Programas;
import java.util.Scanner;

//crea una app que dibuje una escalera de *, pasar la altura de niveles
public class Escalera{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de tu escalera de *: ");
        int altura = sc.nextInt();
        int i = 1;
        for(int j=1; j<=i; j++){
            for(i=-5; i<=altura; i++)
            
            System.out.print(j); 
            System.out.println("");
             
                  
        }
    
    }
}