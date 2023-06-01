package Laboratorios.Lab8.E1;

public class Cliente {
    private
    int ci;
    String nom;
    int fono;
    public
    Cliente()
    {
        ci=474747;
        nom="Carlos Torrez";
        fono=72516;
    }
    Cliente(int a, String b, int c)
    {
        ci=a;
        nom=b;
        fono=c;
    }
    int obtc()
    {return ci;}
    String obtn()
    {return nom;}
    int obtf()
    {return fono;}
    void ponc(int a)
    {ci=a;}
    void ponn(String a)
    {nom=a;}
    void ponf(int a)
    {fono=a;}
    void leer()
    {
        ci=Leer.datoInt();
        nom=Leer.dato();
        fono=Leer.datoInt();
    }
    void mostrar()
    {
        System.out.println("\n*********Cliente********");
        System.out.println("\t"+ci+"\t"+nom+"\t"+fono);
    }
}
