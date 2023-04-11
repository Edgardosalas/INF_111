package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float velocidad, distancia, tiempo;
            distancia = sc.nextFloat();
            velocidad = sc.nextFloat();
            tiempo = distancia/velocidad;
            System.out.println(tiempo);
        }
    }
}
