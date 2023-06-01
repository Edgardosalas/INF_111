package Laboratorios.Lab6.E1;

public class Alumno extends Persona{
    private
    int matrisbe;
    int regunisbe;
    public
    Alumno()
    {
        super();
        matrisbe=246;
        regunisbe=489765;
    }
    Alumno(int sbea, String b, int c, int d, int e)
    {
        super(sbea,b,c);
        matrisbe=d;
        regunisbe=e;
    }
    int obtci()
    {return super.obtc();}
    String obtn()
    {return super.obtn();}
    int obtfe()
    {return super.obtf();}
    int obtma()
    {return matrisbe;}
    int obtre()
    {return regunisbe;}
    void ponci(int sbea)
    {super.ponc(sbea);}
    void ponno(String sbea)
    {super.ponn(sbea);}
    void ponf(int sbea)
    {super.ponf(sbea);}
    void ponma(int sbea)
    {matrisbe=sbea;}
    void ponre(int sbea)
    {regunisbe=sbea;}
    int edad()
    {return super.edad();}
    void leer()
    {
        super.leer();
        matrisbe=Leer.datoInt();
        regunisbe=Leer.datoInt();
    }
    void mostrart()
    {
        super.mostrart();
        System.out.println("\tmatri\treguni");
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println("\t"+matrisbe+"\t"+regunisbe);
    }
}
