package Laboratorios.Lab7.E2;

public abstract class Actor {
    protected
    String estilo;
    public
    String obte()
    {return (estilo);}
    void pone(String a)
    {estilo=a;}
    abstract void leer();
    abstract void mostrar();
}
