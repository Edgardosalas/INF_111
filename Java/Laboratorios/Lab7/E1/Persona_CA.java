package Laboratorios.Lab7.E1;

abstract class Persona_CA implements Actor_I
{
    protected
    int cisbe;
    String nomsbe;
    int fechansbe;
    public
    abstract int edad();
    void ponci(int a)
    {cisbe=a;}
    void ponnom(String a)
    {nomsbe=a;}
    void ponfec(int a)
    {fechansbe=a;}
    int obtci()
    {return cisbe;}
    String obtnom()
    {return nomsbe;}
    int obtfec()
    {return fechansbe;}
    void mostrar()
    {System.out.println(" "+cisbe+" "+nomsbe+" "+fechansbe);}
}

