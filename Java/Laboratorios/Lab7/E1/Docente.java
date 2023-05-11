package Laboratorios.Lab7.E1;

public class Docente extends Persona_CA {
    private
    int item;
    String especialidad;
    public
    Docente()
    {
        item=2468;
        especialidad="sistemas";
    }
    Docente(int a, String b)
    {
        item=a;
        especialidad=b;
    }
    Docente(int a, String b, int c, int d, String e)
    {
        super.ponci(a);
        super.ponnom(b);
        super.ponfec(c);
        item=d;
        especialidad=e;
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
    {
        System.out.println(" "+super.obtci()+" "+super.obtnom()+" "+super.obtfec()+" "+item+" "+especialidad);
    }
}
