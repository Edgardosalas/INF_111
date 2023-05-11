package Laboratorios.Lab7.E2;
import java.util.Scanner;
public class Estudiante extends Persona{
    private
    int matri;
    public
    Estudiante()
    {
        super();
        matri=9742;
    }
    Estudiante(String a, int b, String c, int d)
    {
        super(a, b, c);
        matri=d;
    }
    void leer()
    {   Scanner sc=new Scanner(System.in);
        matri=sc.nextInt();
        super.leer();
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println(matri);
    }
}
