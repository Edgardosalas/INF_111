package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args){
        int a;
        int b;
        int sum;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        if (a>10 && b>10)
            {System.out.println(sum);}
        else
            {System.out.println("Los numeros ingresados deben ser mayores que 10");}
    }
}