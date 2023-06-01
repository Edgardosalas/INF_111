package Laboratorios.Lab8.E1;

public class Empresa {
    private
    String nomEsbe;
    String ubisbe;
    Cliente clisbe[]=new Cliente[20];
    int nclisbe;
    public
    Empresa()
    {
        nomEsbe="Inst.Bancario";
        ubisbe="Monje 378";
        clisbe[1]=new Cliente();
        clisbe[1].ponc(3434);
        clisbe[1].ponn("Maria Aro");
        clisbe[1].ponf(70685);
        nclisbe=1;
    }
    Empresa(String a, String b, Cliente C)
    {
        nomEsbe=a;
        ubisbe=b;
        clisbe[1]=new Cliente();
        clisbe[1].ponc(C.obtc());
        clisbe[1].ponn(C.obtn());
        clisbe[1].ponf(C.obtf());
        nclisbe=1;
    }
    String obtnE()
    {return nomEsbe;}
    String obtu()
    {return ubisbe;}
    Cliente obtC(int a)
    {return clisbe[a];}
    void ponnE(String a)
    {nomEsbe=a;}
    void ponu(String a)
    {ubisbe=a;}
    void ponC(Cliente C)
    {
        clisbe[1]=new Cliente();
        clisbe[1].ponc(C.obtc());
        clisbe[1].ponn(C.obtn());
        clisbe[1].ponf(C.obtf());
        nclisbe=1;
    }
    void leer()
    {
        nomEsbe=Leer.dato();
        ubisbe=Leer.dato();
        nclisbe=Leer.datoInt();
        for(int i=1;i<=nclisbe;i++)
        {
            clisbe[i]=new Cliente();
            clisbe[1].leer();
        }
    }
    void mostrar()
    {
        System.out.println("******Empresa******");
        System.out.println("\t"+nomEsbe+"\t"+ubisbe);
        for(int i=1;i<=nclisbe;i++)
        {
            clisbe[i].mostrar();
        }
    }
}
