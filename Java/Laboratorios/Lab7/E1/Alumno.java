package Laboratorios.Lab7.E1;

public class Alumno extends Persona_CA {
    private
    int matriculasbe;
    public
    Alumno()
    {
        matriculasbe=123;
    }
    Alumno(int asbe)
    {
        matriculasbe=asbe;
    }
    Alumno(int a, String b, int c, int d)
    {
        super.ponci(a);
        super.ponnom(b);
        super.ponfec(c);
        matriculasbe=d;
    }
    public int edad()
    {return 2020-super.obtfec();}
    void ponci(int a)
    {super.ponci(a);}
    void ponnom(String a)
    {super.ponnom(a);}
    void ponfec(int a)
    {super.ponfec(a);}
    void mostrar()
    {System.out.println(" "+super.obtci()+" "+super.obtnom()+" "+super.obtfec()+" "+matriculasbe);
    }
}
