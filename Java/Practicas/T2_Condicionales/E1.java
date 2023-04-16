package Practicas.T2_Condicionales;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        char letra;
        Scanner sc=new Scanner(System.in);
        letra=sc.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
            {System.out.println("Es una vocal");}
            else
            {System.out.println("Es una consonante");}
    }
}