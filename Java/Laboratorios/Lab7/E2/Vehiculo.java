package Laboratorios.Lab7.E2;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Vehiculo extends Actor implements Objeto {
    protected
    String color;
    public 
    Vehiculo()
    {
        super.pone("Comedia");
        color="blanco";
    }
    Vehiculo(String a, String b)
    {
        super.pone(a);
        color=b;
    }
    Vehiculo(String a)
    {
        color=a;
    }
    public void leer()
    {   Scanner sc=new Scanner(System.in);
        String x;
        x=sc.next();
        color=sc.next();
        super.pone(x);
    }
    public void mostrar()
    {
        System.out.println(super.obte()+color);
    }
}
