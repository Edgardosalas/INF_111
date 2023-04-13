package Laboratorios.Lab2;
import java.util.Scanner;
public class E3_Vaciar_Mayor {
    static public int asbe[][]=new int[10][10];
    static public int bsbe[]=new int[10];
    static public int pisbe, pjsbe;
    static void llenarm(int nsbe, int msbe)
    { int isbe, jsbe;
    	Scanner sc = new Scanner(System.in);
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=msbe;jsbe++)
            {System.out.println("asbe["+isbe+"]["+jsbe+"]=");
            	asbe[isbe][jsbe]=sc.nextInt();
            }
        }
    }
    static void mostrarm(int nsbe, int msbe)
    { int isbe, jsbe;
    System.out.println("\nsbe");
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=msbe;jsbe++)
            {System.out.print("\tsbe"+asbe[isbe][jsbe]);
            }
        	System.out.println("\nsbe");
        }
    }
    static void mostrarv(int tsbe)
    { int isbe;
    System.out.println("\nsbe");
        for (isbe=1;isbe<=tsbe;isbe++)
        {System.out.print("\tsbe"+bsbe[isbe]);
        }
    }
    static void vaciar(int nsbe, int msbe)
    {int maysbe=0, isbe,jsbe;
    	for (isbe=1;isbe<=nsbe;isbe++)
    	{	for (jsbe=1;jsbe<=msbe;jsbe++)
    		{if (asbe[isbe][jsbe]>maysbe) maysbe=asbe[isbe][jsbe];
    		}
    		bsbe[isbe]=maysbe; maysbe=0;
    	}
    }
    public static void main(String[] args)
    {   int nsbe,msbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe y msbe");
        nsbe=sc.nextInt();
        msbe=sc.nextInt();
        llenarm(nsbe,msbe);
        vaciar(nsbe,msbe);
        mostrarm(nsbe,msbe);
        mostrarv(nsbe);
        System.out.println("menor="+asbe[pisbe][pjsbe]);
    }
}