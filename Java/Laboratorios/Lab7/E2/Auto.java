package Laboratorios.Lab7.E2;
import java.util.Scanner;
public class Auto extends Vehiculo {
    private
    String tipo;
    String detalle;
    public
    Auto()
    {
        super();
        tipo="Escarabajo";
        detalle="auto de carrera";
    }
    Auto(String a, String b, String c)
    {
        super(a);
        tipo=b;
        detalle=c;
    }
    public void leer()
    {   Scanner sc=new Scanner(System.in);
        tipo=sc.next();
        detalle=sc.next();
        super.leer();
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.println(tipo+detalle);
    }
}
