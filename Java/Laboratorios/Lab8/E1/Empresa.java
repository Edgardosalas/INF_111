package Laboratorios.Lab8.E1;

public class Empresa {
    private
    String nomE;
    String ubi;
    Cliente cli[]=new Cliente[20];
    int ncli;
    public
    Empresa()
    {
        nomE="Inst.Bancario";
        ubi="Monje 378";
        cli[1]=new Cliente();
        cli[1].ponc(3434);
        cli[1].ponn("Maria Aro");
        cli[1].ponf(70685);
        ncli=1;
    }
    Empresa(String a, String b, Cliente C)
    {
        nomE=a;
        ubi=b;
        cli[1]=new Cliente();
        cli[1].ponc(C.obtc());
        cli[1].ponn(C.obtn());
        cli[1].ponf(C.obtf());
        ncli=1;
    }
    String obtnE()
    {return nomE;}
    String obtu()
    {return ubi;}
    Cliente obtC(int a)
    {return cli[a];}
    void ponnE(String a)
    {nomE=a;}
    void ponu(String a)
    {ubi=a;}
    void ponC(Cliente C)
    {
        cli[1]=new Cliente();
        cli[1].ponc(C.obtc());
        cli[1].ponn(C.obtn());
        cli[1].ponf(C.obtf());
        ncli=1;
    }
    void leer()
    {
        nomE=Leer.dato();
        ubi=Leer.dato();
        ncli=Leer.datoInt();
        for(int i=1;i<=ncli;i++)
        {
            cli[i]=new Cliente();
            cli[1].leer();
        }
    }
    void mostrar()
    {
        System.out.println("******Empresa******");
        System.out.println("\t"+nomE+"\t"+ubi);
        for(int i=1;i<=ncli;i++)
        {
            cli[i].mostrar();
        }
    }
}
