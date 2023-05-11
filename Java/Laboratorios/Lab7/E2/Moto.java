package Laboratorios.Lab7.E2;
import java.util.Scanner;
public class Moto extends Vehiculo {
    private
    int serie;
    public
    Moto()
    {
        super();
        serie=574986;
    }
    Moto(String a, int b)
    {
        super(a);
        serie=b;
    }
    public void leer()
    {   Scanner sc=new Scanner(System.in);
        serie=sc.nextInt();
        super.leer();
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.println(serie);
    }
}
