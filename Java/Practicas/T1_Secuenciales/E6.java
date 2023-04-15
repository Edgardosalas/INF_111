package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args){
        Double hip,cat1,cat2;
        Scanner sc=new Scanner(System.in);
        cat1=sc.nextDouble();
        cat2=sc.nextDouble();
        hip=Math.sqrt(cat1*cat1+cat2*cat2);
        System.out.println(hip);
    }
}
