package Laboratorios.Lab9.E1;

public class Contenedor <T>{
    private
    T contenidosbe;
    public
    Contenedor()
    {}
    Contenedor(T x)
    {
        contenidosbe=x;
    }
    T obtc()
    {return contenidosbe;}
    void ponc(T x)
    {contenidosbe=x;}
    void mostrar()
    {System.out.println(" "+contenidosbe);}
    void compara(Contenedor C)
    {
        if(contenidosbe==C.obtc())
        {System.out.println("Soin iguales");}
        else
        {System.out.println("no son iguales");}
    }
}
