package Laboratorios.Lab9.E1;

public class Contenedor <T>{
    private
    T contenido;
    public
    Contenedor()
    {}
    Contenedor(T x)
    {
        contenido=x;
    }
    T obtc()
    {return contenido;}
    void ponc(T x)
    {contenido=x;}
    void mostrar()
    {System.out.println(" "+contenido);}
    void compara(Contenedor C)
    {
        if(contenido==C.obtc())
        {System.out.println("Soin iguales");}
        else
        {System.out.println("no son iguales");}
    }
}
