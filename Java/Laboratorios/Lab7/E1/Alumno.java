package Laboratorios.Lab7.E1;

public class Alumno extends Persona_CA {
    private
    int matricula;
    public
    Alumno()
    {
        matricula=123;
    }
    Alumno(int a)
    {
        matricula=a;
    }
    Alumno(int a, String b, int c, int d)
    {
        super.ponci(a);
        super.ponnom(b);
        super.ponfec(c);
        matricula=d;
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
    {System.out.println(" "+super.obtci()+" "+super.obtnom()+" "+super.obtfec()+" "+matricula);
    }
}
