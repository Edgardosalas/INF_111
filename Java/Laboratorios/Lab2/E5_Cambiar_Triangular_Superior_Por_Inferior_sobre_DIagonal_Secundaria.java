package Laboratorios.Lab2;
import java.util.Scanner;
public class E5_Cambiar_Triangular_Superior_Por_Inferior_sobre_DIagonal_Secundaria {
    static public int asbe[][]=new int[10][10];
    static void llenarm(int nsbe)
    { int isbe, jsbe;
    	Scanner sc = new Scanner(System.in);
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=nsbe;jsbe++)
            {System.out.println("asbe["+isbe+"]["+jsbe+"]=");
            	asbe[isbe][jsbe]=sc.nextInt();
            }
        }
    }
    static void mostrarm(int nsbe)
    { int isbe, jsbe;
    System.out.println("\nsbe");
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=nsbe;jsbe++)
            {System.out.print("\t"+asbe[isbe][jsbe]);
            }
        	System.out.println("\nsbe");
        }
    }
    static void intertds(int nsbe)
    {int n1sbe,i1sbe,j1sbe,xsbe,isbe,jsbe;
    	n1sbe=nsbe; i1sbe=nsbe; j1sbe=nsbe;
    	for (isbe=1;isbe<=nsbe-1;isbe++)
    	{	for (jsbe=1;jsbe<=n1sbe-1;jsbe++)
    		{	xsbe=asbe[isbe][jsbe]; asbe[isbe][jsbe]=asbe[i1sbe][j1sbe]; asbe[i1sbe][j1sbe]=xsbe; i1sbe=i1sbe-1;
    		}
    	n1sbe=n1sbe-1; i1sbe=nsbe; j1sbe=j1sbe-1;
    	}
    }
    public static void main(String[] args)
    {   int nsbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe y m");
        nsbe=sc.nextInt();
        llenarm(nsbe);
        mostrarm(nsbe);
        intertds(nsbe);
        mostrarm(nsbe);
    }
}
