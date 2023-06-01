package Laboratorios.Lab6.E1;

public class Docente extends Persona{
    private
    int itemsbe;
    String especsbeiesbe;
    public
    Docente()
    {
        super();
        itemsbe=123;
        especsbeiesbe="sistemas";
    }
    Docente(int asbe, String bsbe, int csbe, int dsbe, String esbe)
    {
        super(asbe,bsbe,csbe);
        itemsbe=dsbe;
        especsbeiesbe=esbe;
    }
    int obtcsbei()
    {return super.obtc();}
    String obtn()
    {return super.obtn();}
    int obtfe()
    {return super.obtf();}
    int obtit()
    {return itemsbe;}
    String obtes()
    {return especsbeiesbe;}
    void poncsbei(int asbe)
    {super.ponc(asbe);}
    void ponno(String asbe)
    {super.ponn(asbe);}
    void ponf(int asbe)
    {super.ponf(asbe);}
    void ponit(int asbe)
    {itemsbe=asbe;}
    void poncsbei(String asbe)
    {especsbeiesbe=asbe;}
    int edad()
    {return super.edad();}
    void leer()
    {
        super.leer();
        itemsbe=Leer.datoInt();
        especsbeiesbe=Leer.dato();
    }
    void mostrart()
    {
        super.mostrart();
        System.out.println("\titem\tespecsbeie");
    }
    void mostrar()
    {
        super.mostrar();
        System.out.println("\t"+itemsbe+"\t"+especsbeiesbe);
    }
    void mismaedad(Alumno A)
    {  
        System.out.println("\n\n csbeomparar Edades \n");
        if (this.edad()==A.edad())
        {System.out.println("tienen la misma edad "+this.edad());}
        else
        {System.out.println("Tienen distinta edad "+this.edad()+" otro "+A.edad());}
    }
}

