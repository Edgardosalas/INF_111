package Laboratorios.Lab6.E1;

public class Docente extends Persona{
    private
    int item;
    String especie;
    public
    Docente()
    {
        super();
        item=123;
        especie="sistemas";
    }
    Docente(int a, String b, int c, int d, String e)
    {
        super(a,b,c);
        item=d;
        especie=e;
    }
    int obtci()
    {return super.obtc();}
    String obtn()
    {return super.obtn();}
    int obtfe()
    {return super.obtf();}
    int obtit()
    {return item;}
    String obtes()
    {return especie;}
    void ponci(int a)
    {super.ponc(a);}
    void ponno(String a)
    {super.ponn(a);}
    void ponf(int a)
    {super.ponf(a);}
    void ponit(int a)
    {item=a;}
    void ponci(String a)
    {especie=a;}
    int edad()
    {return super.edad();}
    void leer()
    {
        super.leer();
        item=Leer.datoInt();
        especie=Leer.dato();
    }
    void mostrart()
    {
        super.mostrart();
        System.out.println("\titem\tespecie");
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println("\t"+item+"\t"+especie);
    }
    void mismaedad(Alumno A)
    {  
        System.out.println("\n\n Comparar Edades \n");
        if (this.edad()==A.edad())
        {System.out.println("tienen la misma edad "+this.edad());}
        else
        {System.out.println("Tienen distinta edad "+this.edad()+" otro "+A.edad());}
    }
}

