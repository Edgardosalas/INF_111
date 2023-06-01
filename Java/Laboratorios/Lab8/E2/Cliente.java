package Laboratorios.Lab8.E2;

public class Cliente {
    private
    String nombresbe;
    String apellidosbe;
    Tarjeta tarsbe=new Tarjeta();
    public
    Cliente()
    {
        nombresbe="Pedro";
        apellidosbe="Quispe";
        tarsbe=new Tarjeta();
    }
    Cliente(String a, String b)
    {
        nombresbe=a;
        apellidosbe=b;
        tarsbe=new Tarjeta();
    }
    String obtn()
    {return nombresbe;}
    String obta()
    {return apellidosbe;}
    Tarjeta obtt()
    {return tarsbe;}
    void ponn(String a)
    {nombresbe=a;}
    void pona(String a)
    {apellidosbe=a;}
    void pont(Tarjeta T)
    {
        T.ponn(T.obtn());
        T.pont(T.obtt());
        T.ponm(T.obtm());
    }
    void leer()
    {
        nombresbe=Leer.dato();
        apellidosbe=Leer.dato();
        tarsbe.leer();
    }
    void mostrar()
    {
        System.out.println("\n*********Cliente********");
        System.out.println("\t"+nombresbe+"\t"+apellidosbe);
        tarsbe.mostrar();
    }
}
