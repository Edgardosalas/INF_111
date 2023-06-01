package Laboratorios.Lab7.E1;

abstract class Persona_CA implements Actor_I
{
    protected
    int ci;
    String nom;
    int fechan;
    public
    abstract int edad();
    void ponci(int a)
    {ci=a;}
    void ponnom(String a)
    {nom=a;}
    void ponfec(int a)
    {fechan=a;}
    int obtci()
    {return ci;}
    String obtnom()
    {return nom;}
    int obtfec()
    {return fechan;}
    void mostrar()
    {System.out.println(" "+ci+" "+nom+" "+fechan);}
}

