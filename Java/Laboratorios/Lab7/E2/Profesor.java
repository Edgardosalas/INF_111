package Laboratorios.Lab7.E2;
import java.util.Scanner;
public class Profesor extends Persona {
    private
    int item;
    public
    Profesor()
    {
        super();
        item=321;
    }
    Profesor(String a, int b, String c, int d)
    {
        super(a,b,c);
        item=d;
    }
    void leer()
    {   Scanner sc=new Scanner(System.in);
        item=sc.nextInt();
        super.leer();
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println(item);
    }
}
