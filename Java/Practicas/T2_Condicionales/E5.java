package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.next().charAt(0);
        if (n%3==0)
            {System.out.println("Es multiplo de 3");}
        else if (n%5==5)
            {System.out.println("Es multiplo de 5");}
        else
            {System.out.println("No es multiplo de 3 ni de 5");}
    }
}