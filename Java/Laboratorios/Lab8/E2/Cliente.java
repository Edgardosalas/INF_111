package Laboratorios.Lab8.E2;

public class Cliente {
    private
    String nombre;
    String apellido;
    Tarjeta tar=new Tarjeta();
    public
    Cliente()
    {
        nombre="Pedro";
        apellido="Quispe";
        tar=new Tarjeta();
    }
    Cliente(String a, String b)
    {
        nombre=a;
        apellido=b;
        tar=new Tarjeta();
    }
    String obtn()
    {return nombre;}
    String obta()
    {return apellido;}
    Tarjeta obtt()
    {return tar;}
    void ponn(String a)
    {nombre=a;}
    void pona(String a)
    {apellido=a;}
    void pont(Tarjeta T)
    {
        T.ponn(T.obtn());
        T.pont(T.obtt());
        T.ponm(T.obtm());
    }
    void leer()
    {
        nombre=Leer.dato();
        apellido=Leer.dato();
        tar.leer();
    }
    void mostrar()
    {
        System.out.println("\n*********Cliente********");
        System.out.println("\t"+nombre+"\t"+apellido);
        tar.mostrar();
    }
}
