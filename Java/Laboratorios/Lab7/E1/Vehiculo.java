package Laboratorios.Lab7.E1;

public class Vehiculo implements Actor_I, Transporte_I {
    private
    String placasbe;
    String marcasbe;
    int modelosbe;
    public 
    Vehiculo()
    {
        placasbe="ACV-123";
        marcasbe="Toyota";
        modelosbe=2000;
    }
    Vehiculo(String a, String b, int c)
    {
        placasbe=a;
        marcasbe=b;
        modelosbe=c;
    }
    int antiguedad()
    {return 2020-modelosbe;}
    void mostrar()
    {System.out.println(" "+placasbe+" "+marcasbe+" "+modelosbe);}
}
