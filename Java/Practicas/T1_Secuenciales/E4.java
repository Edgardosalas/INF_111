package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Double Pies;
        Double Pulgadas;
        Double cm;
        Scanner sc=new Scanner(System.in);
        Pies=sc.nextDouble();
        Pulgadas=sc.nextDouble();
        Pies=Pies*12;
        Pulgadas=Pies+Pulgadas;
        cm=Pulgadas*2.54;
        System.out.println(cm);
    }
}
