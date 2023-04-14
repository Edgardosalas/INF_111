package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E3 {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                double area;
                double pi=3.14;
                double Radio;
                double Circunferencia;
                System.out.println("Introduce el radio:");
                Radio=sc.nextInt();
                area=pi*Radio*Radio;
                Circunferencia=2*pi*Radio;
                System.out.println("Area= "+area+" \nCircunferencia= "+Circunferencia);
            }
        }
    
    }