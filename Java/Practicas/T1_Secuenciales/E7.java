package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        Double C,F;
        Scanner sc=new Scanner(System.in);
        F=sc.nextDouble();
        C=((F-32)*5)/9;
        System.out.println(C);
    }
}
