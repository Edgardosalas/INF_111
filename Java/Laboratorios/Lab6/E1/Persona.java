package Laboratorios.Lab6.E1;

public class Persona {
    protected
    int cisbe;
    String nomcsbe;
    int fechansbe;
    public
    Persona()
    {
        cisbe=12345;
        nomcsbe="Marcelo Arequipa";
        fechansbe=1990;
    }
    Persona(int asbe, String bsbe, int csbe)
    {
        cisbe=asbe;
        nomcsbe=bsbe;
        fechansbe=csbe;
    }
    int obtc()
    {return cisbe;}
    String obtn()
    {return nomcsbe;}
    int obtf()
    {return fechansbe;}
    void ponc(int a)
    {cisbe=a;}
    void ponn(String a)
    {nomcsbe=a;}
    void ponf(int a)
    {fechansbe=a;}
    int edad()
    {return 2023-fechansbe;}
    void leer()
    {
        cisbe=Leer.datoInt();
        nomcsbe=Leer.dato();
        fechansbe=Leer.datoInt();
    }
    void mostrart()
    {
        System.out.println("\nci\tnombre\t\t\taño");
    }
    void mostrar()
    {
        System.out.println("\n"+cisbe+"\t"+nomcsbe+"\t\t"+fechansbe);
    }
}
