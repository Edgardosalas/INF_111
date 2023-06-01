package Laboratorios.Lab7.E1;

public class Docente extends Persona_CA {
    private
    int itemsbe;
    String especialidadsbe;
    public
    Docente()
    {
        itemsbe=2468;
        especialidadsbe="sistemas";
    }
    Docente(int a, String b)
    {
        itemsbe=a;
        especialidadsbe=b;
    }
    Docente(int a, String b, int c, int d, String e)
    {
        super.ponci(a);
        super.ponnom(b);
        super.ponfec(c);
        itemsbe=d;
        especialidadsbe=e;
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
        System.out.println(" "+super.obtci()+" "+super.obtnom()+" "+super.obtfec()+" "+itemsbe+" "+especialidadsbe);
    }
}
