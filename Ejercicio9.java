import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int temperatura1, temperatura2, promedio;

        System.out.println("Ingresa la temperatura 1");
        temperatura1 = entrada.nextInt();
        System.out.println("Ingresa la temperatura 2");
        temperatura2 = entrada.nextInt();

        if (temperatura1 >= 5 && temperatura1 <= 15){
            if (temperatura2 >= 5 && temperatura2 <= 15){
                promedio = (temperatura1 + temperatura2)/2;
                System.out.println("El promedio de temperaturas es: " + promedio);
            }
        } else {
            System.out.println("Ingresa temperaturas entre 5 y 15");
        }


    }
}