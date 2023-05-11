package Laboratorios.Lab7.E1;

public class Vehiculo implements Actor_I, Transporte_I {
    private
    String placa;
    String marca;
    int modelo;
    public 
    Vehiculo()
    {
        placa="ACV-123";
        marca="Toyota";
        modelo=2000;
    }
    Vehiculo(String a, String b, int c)
    {
        placa=a;
        marca=b;
        modelo=c;
    }
    int antiguedad()
    {return 2020-modelo;}
    void mostrar()
    {System.out.println(" "+placa+" "+marca+" "+modelo);}
}
