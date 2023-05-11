package Laboratorios.Lab7.E2;
import java.util.Scanner;
public class Persona extends Actor{
    protected
    int ci;
    String nombre;
    public
    Persona()
    {
        super.pone("drama");
        ci=12345;
        nombre="Pedro";
    }
    Persona(String a, int b, String c)
    {
        super.pone(a);
        ci=b;
        nombre=c;
    }
    void leer()
    {   Scanner sc=new Scanner(System.in);
        String x;
        x=sc.next();
        ci=sc.nextInt();
        nombre=sc.next();
        super.pone(x);
    }
    void mostrar()
    {
        System.out.println(super.obte()+ ci+ nombre);
    }
}
