package Laboratorios.Lab6.E1;

public class Alumno extends Persona{
    private
    int matri;
    int reguni;
    public
    Alumno()
    {
        super();
        matri=246;
        reguni=489765;
    }
    Alumno(int a, String b, int c, int d, int e)
    {
        super(a,b,c);
        matri=d;
        reguni=e;
    }
    int obtci()
    {return super.obtc();}
    String obtn()
    {return super.obtn();}
    int obtfe()
    {return super.obtf();}
    int obtma()
    {return matri;}
    int obtre()
    {return reguni;}
    void ponci(int a)
    {super.ponc(a);}
    void ponno(String a)
    {super.ponn(a);}
    void ponf(int a)
    {super.ponf(a);}
    void ponma(int a)
    {matri=a;}
    void ponre(int a)
    {reguni=a;}
    int edad()
    {return super.edad();}
    void leer()
    {
        super.leer();
        matri=Leer.datoInt();
        reguni=Leer.datoInt();
    }
    void mostrart()
    {
        super.mostrart();
        System.out.println("\tmatri\treguni");
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println("\t"+matri+"\t"+reguni);
    }
}
