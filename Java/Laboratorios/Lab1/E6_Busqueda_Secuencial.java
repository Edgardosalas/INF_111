package Laboratorios.Lab1;
import java.util.Scanner;
public class E6_Busqueda_Secuencial {
    static public int asbe[]=new int[20];
    static public void llenarv(int tsbe)
    {int isbe;
        Scanner sc = new Scanner(System.in);
            for (isbe=1;isbe<=tsbe;isbe++)
            {
                System.out.println(" asbe["+isbe+"]=");
                asbe[isbe]=sc.nextInt();
            }
        }
    static public void mostrarv(int tsbe)
    { int isbe;
        System.out.println("");
        for (isbe=1;isbe<=tsbe;isbe++)
        {
            System.out.print(" "+ asbe[isbe]);
        }
    }
    static int bussec(int tsbe, int xsbe)
    {int ksbe=1;
    	while(xsbe!=asbe[ksbe] && ksbe<=tsbe)
    	{	ksbe=ksbe+1;
    	}
    	if(xsbe!=asbe[ksbe]) {ksbe=-1;}
    	return ksbe;
    }
    public static void main(String[] args)
    {   int nsbe, zsbe;
        Scanner sc = new Scanner(System.in);
        do
        {   System.out.println("intro nsbe");
            nsbe=sc.nextInt();
        }while (nsbe>20);
        llenarv(nsbe);
        mostrarv(nsbe);
        System.out.println("\nintro elem asbe buscar ");
        zsbe=sc.nextInt();
        if (bussec(nsbe,zsbe)!= -1)
        {System.out.println("\n "+zsbe+" esta en posi "+bussec(nsbe,zsbe));}
        else
        {System.out.println(" \nnoexiste ");}
    }
}