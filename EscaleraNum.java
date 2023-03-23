package Programas;
import java.util.Scanner;

//crea una app que dibuje una escalera de *, pasar la altura de niveles
public class EscaleraNum{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de tu escalera de números: ");
        int altura = sc.nextInt();

        for(int i=1; i<=altura; i++){
            for(int j=1; j<=i; j++)
            System.out.print(j); 
            System.out.println("");            
        }
    sc.close();
    }
}