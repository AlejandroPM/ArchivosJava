package Programas;
//Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total (recorre el String con charAt).
public class Ej22 {
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
        for(int i=0; i<frase.length();i++){
            frase.charAt(i);
            System.out.println(i);
        }
    }
}
