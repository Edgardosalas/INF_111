package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (n>=18 && n<=25)
            {System.out.println("¡Felicidades! Eres elegible para nuestra oferta especial para jóvenes");}
            else
            {System.out.println("¡Gracias por tu interés en nuestra oferta especial para jóvenes, pero esta oferta es solo para personas entre 18 y 25 años!");}
    }
}