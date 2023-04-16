package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        Float p;
        Float a;
        Float imc;
        Scanner sc= new Scanner(System.in);
        p=sc.nextFloat();
        a=sc.nextFloat();
        imc=p/(a*a);
        if (imc<18.5)
            {System.out.println("Bajo peso");}
        if (imc>18.5 && imc<24.9)
            {System.out.println("Peso normal");}
        if (imc>25 && imc<29.9)
            {System.out.println("Sobrepeso");}
        if (imc>29.9)
            {System.out.println("Obesidad");}
    }
}