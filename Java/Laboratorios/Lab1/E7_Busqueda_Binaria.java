package Laboratorios.Lab1;
import java.util.Scanner;
public class E7_Busqueda_Binaria {
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
    static void burbuja(int tsbe)
    {int isbe, jsbe, xsbe=0;
        for (isbe=1;isbe<=tsbe-1;isbe++)
        {	for (jsbe=isbe+1;jsbe<=tsbe;jsbe++)
            {	if(asbe[isbe]>asbe[jsbe])
                {	xsbe=asbe[jsbe]; asbe[jsbe]=asbe[isbe]; asbe[isbe]=xsbe;
                }
            }
        }
    }
    static int busbin(int tsbe, int xsbe)
    {int lcsbe, ksbe=1, lisbe=1, lssbe=tsbe;
    	lcsbe=(lisbe+lssbe)/2;
    	while (xsbe!=asbe[lcsbe] && lisbe<=lssbe)
    	{	if (xsbe>asbe[lcsbe]) {lisbe=lcsbe+1;}
    		else { lssbe=lcsbe-1; }
    		lcsbe=(lisbe+lssbe/2);
    	}
    	if(xsbe==asbe[lcsbe]) {ksbe=lcsbe;}
    	else { ksbe=-1; }
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
        burbuja(nsbe);
        mostrarv(nsbe);
        System.out.println("\nintro elem asbe buscar ");
        zsbe=sc.nextInt();
        if (busbin(nsbe,zsbe)!= -1)
        {System.out.println("\n "+zsbe+" esta en posi "+busbin(nsbe,zsbe));}
        else
        {System.out.println(" \nno existe ");}
    }
}