package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
        Double v1,v2,d,T;
        Scanner sc=new Scanner(System.in);
        v1=sc.nextDouble();
        v2=sc.nextDouble();
        d=sc.nextDouble();
        T=sc.nextDouble();
        T=d/(v2-v1);
        System.out.println(T);
    }
}
