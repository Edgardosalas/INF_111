package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
        String p;
        Scanner sc=new Scanner(System.in);
        p=sc.next();
        if (p=="Python")
            {System.out.println("¡Python es un excelente lenguaje de programación! Sigue adelante");}
        else if(p=="JavaScript")
            {System.out.println("¡JavaScript es un lenguaje de programación popular y útil! Sigue adelante");}
        else
            {System.out.println("¡Ese es un buen lenguaje de programación! Sigue adelante");}
    }
}