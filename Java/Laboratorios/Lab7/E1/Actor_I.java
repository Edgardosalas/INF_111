package Laboratorios.Lab7.E1;

interface Actor_I
{}
interface Transporte_I
{}  //Las interfaces deben ir aparte y cada una con sus propios metodos, cada interfaz con un programa propio
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
