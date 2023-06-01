package Laboratorios.Lab8.E2;

public class Tarjeta {
    private
    int num;
    String tipo;
    String moneda;
    public
    Tarjeta()
    {
        num=124578;
        tipo="Credito";
        moneda="Bolivianos";
    }
    Tarjeta(int a, String b, String c)
    {
        num=a;
        tipo=b;
        moneda=c;
    }
    int obtn()
    {return num;}
    String obtt()
    {return tipo;}
    String obtm()
    {return moneda;}
    void ponn(int a)
    {num=a;}
    void pont(String a)
    {tipo=a;}
    void ponm(String a)
    {
        moneda=a;
    }
    void leer()
    {
        num=Leer.datoInt();
        tipo=Leer.dato();
        moneda=Leer.dato();
    }
    void mostrar()
    {
        System.out.println("\n*********Tarjeta********");
        System.out.println("\t"+num+"\t"+tipo+"\t"+moneda);
    }
}
