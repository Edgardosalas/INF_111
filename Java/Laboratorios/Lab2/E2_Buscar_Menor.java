package Laboratorios.Lab2;
import java.util.Scanner;
public class E2_Buscar_Menor {
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
    System.out.println("\n");
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=msbe;jsbe++)
            {System.out.print("\t"+asbe[isbe][jsbe]);
            }
        	System.out.println("\n");
        }
    }
    static void menor (int nsbe, int msbe)
    {int isbe, jsbe,mensbe=9999;
    	for (isbe=1;isbe<=nsbe;isbe++)
    	{	for (jsbe=1;jsbe<=msbe;jsbe++)
    		{if (asbe[isbe][jsbe]<mensbe)
    			{mensbe=asbe[isbe][jsbe];
    				pisbe=isbe; pjsbe=jsbe;
    			}
    		}
    	}
    }
    public static void main(String[] args)
    {   int nsbe,msbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe y msbe");
        nsbe=sc.nextInt();
        msbe=sc.nextInt();
        llenarm(nsbe,msbe);
        mostrarm(nsbe,msbe);
        menor(nsbe,msbe);
        System.out.println("menor="+asbe[pisbe][pjsbe]);
    }
}