package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args){
        int n1;
        int n2;
        int n3;
        Scanner sc= new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n1%2==0 || n2%2==0 || n3%2==0)
        {System.out.println("Hay un numero par");}
        else
        {System.out.println("No hay numeros pares");}
    }
}