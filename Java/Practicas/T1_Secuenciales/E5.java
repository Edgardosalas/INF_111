package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Double tamaño;
        Double Velocidad;
        Double Tiempos;
        Double Tiempom;
        Scanner sc=new Scanner(System.in);
        tamaño=sc.nextDouble();
        Velocidad=sc.nextDouble();
        Velocidad=Velocidad/8;
        Tiempos=tamaño/Velocidad;
        System.out.println(Tiempos);
        Tiempom=Tiempos/60;
        System.out.println(Tiempom);
    }
}
