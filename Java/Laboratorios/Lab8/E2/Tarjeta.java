package Laboratorios.Lab8.E2;

public class Tarjeta {
    private
    int numsbe;
    String tiposbe;
    String monedasbe;
    public
    Tarjeta()
    {
        numsbe=124578;
        tiposbe="Credito";
        monedasbe="Bolivianos";
    }
    Tarjeta(int a, String b, String c)
    {
        numsbe=a;
        tiposbe=b;
        monedasbe=c;
    }
    int obtn()
    {return numsbe;}
    String obtt()
    {return tiposbe;}
    String obtm()
    {return monedasbe;}
    void ponn(int a)
    {numsbe=a;}
    void pont(String a)
    {tiposbe=a;}
    void ponm(String a)
    {
        monedasbe=a;
    }
    void leer()
    {
        numsbe=Leer.datoInt();
        tiposbe=Leer.dato();
        monedasbe=Leer.dato();
    }
    void mostrar()
    {
        System.out.println("\n*********Tarjeta********");
        System.out.println("\t"+numsbe+"\t"+tiposbe+"\t"+monedasbe);
    }
}
