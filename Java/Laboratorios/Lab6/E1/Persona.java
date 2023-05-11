package Laboratorios.Lab6.E1;

public class Persona {
    protected
    int ci;
    String nomc;
    int fechan;
    public
    Persona()
    {
        ci=12345;
        nomc="Marcelo Arequipa";
        fechan=1990;
    }
    Persona(int a, String b, int c)
    {
        ci=a;
        nomc=b;
        fechan=c;
    }
    int obtc()
    {return ci;}
    String obtn()
    {return nomc;}
    int obtf()
    {return fechan;}
    void ponc(int a)
    {ci=a;}
    void ponn(String a)
    {nomc=a;}
    void ponf(int a)
    {fechan=a;}
    int edad()
    {return 2023-fechan;}
    void leer()
    {
        ci=Leer.datoInt();
        nomc=Leer.dato();
        fechan=Leer.datoInt();
    }
    void mostrart()
    {
        System.out.println("\nci\tnombre\t\t\taño");
    }
    void mostrar()
    {
        System.out.println("\n"+ci+"\t"+nomc+"\t\t"+fechan);
    }
}
