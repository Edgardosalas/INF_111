package Laboratorios.Lab8.E1;

public class Cliente {
    private
    int cisbe;
    String nomsbe;
    int fonosbe;
    public
    Cliente()
    {
        cisbe=474747;
        nomsbe="Carlos Torrez";
        fonosbe=72516;
    }
    Cliente(int a, String b, int c)
    {
        cisbe=a;
        nomsbe=b;
        fonosbe=c;
    }
    int obtc()
    {return cisbe;}
    String obtn()
    {return nomsbe;}
    int obtf()
    {return fonosbe;}
    void ponc(int a)
    {cisbe=a;}
    void ponn(String a)
    {nomsbe=a;}
    void ponf(int a)
    {fonosbe=a;}
    void leer()
    {
        cisbe=Leer.datoInt();
        nomsbe=Leer.dato();
        fonosbe=Leer.datoInt();
    }
    void mostrar()
    {
        System.out.println("\n*********Cliente********");
        System.out.println("\t"+cisbe+"\t"+nomsbe+"\t"+fonosbe);
    }
}
