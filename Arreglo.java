package Programas;
import java.util.Scanner;
public class Arreglo{
    Scanner sc = new Scanner(System.in);
    int num [] = new int[10];

    public void rellenarArreglo(){
        int i =0;
        System.out.println("\ndame 10 numeros: ");
        while(i<10){
        System.out.println("-----");
        num[i] = sc.nextInt();
        i++;
        }
    }

    public void printArray() {
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("  " + num[i]);
        }
    }

    //se ordena con bubble sort
    public void ordenarArreglo(){
        for(int i =0; i< num.length;i++){
            for(int j=0; j<num.length-1; j++)
                if(num[j] > num[j+1]){
                    int temporal = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temporal;
                    
                }
                
        }
    }

    public void soloPares(){
        System.out.println("Pares: ");
        for(int i=0; i<num.length;i++){
            
            if(num[i] % 2 == 0){
                System.out.println(num[i]);
            }
        }
    }

    public void soloImpares(){
        System.out.println("impares: ");
        for(int i=0; i<num.length;i++){
            if(num[i] % 2 != 0){
                System.out.println(num[i]);
            }
        }
    }

    public void parteArreglo(){
        System.out.print("PRIMER PARTE DEL ARREGLO: \n");
        for(int i=0; i<num.length/2;i++){
            System.out.print("\n" + num[i] + "\n");
        }
        System.out.println("SEGUNDA PARTE DEL ARREGLO\n");
        for(int i=num.length/2; i<num.length;i++){
            System.out.print("\n" + num[i] + "\n");
        }
    }

    public void sumaValores(){
        int sum =0;
        for(int i=0; i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }

    public static void main(String [] args){

        Arreglo uno = new Arreglo();
        uno.rellenarArreglo();
        uno.printArray();
        uno.ordenarArreglo();
        uno.printArray();
        uno.soloPares();
        uno.soloImpares();
        System.out.println("parte arreglo");
        uno.parteArreglo();
        System.out.println("Valores del arreglo sumados");
        uno.sumaValores();

        //Arreglo dos = new Arreglo();
        //dos.rellenarArreglo();
        //dos.printArray();
        
        
        


    }


}