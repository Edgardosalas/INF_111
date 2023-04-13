package Laboratorios.Lab2;
import java.util.Scanner;
public class E1_Encontrar_Mayor_Sumar_filas {
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
    static void mostrarv(int tsbe)
    { int isbe;
    System.out.println("\n");
        for (isbe=1;isbe<=tsbe;isbe++)
        {System.out.print("\t"+bsbe[isbe]);
        }
    }
    static void maysumar (int nsbe, int msbe)
    {int maysbe=0, ssbe=0, isbe, jsbe;
    	for (isbe=1;isbe<=nsbe;isbe++)
    	{	for (jsbe=1;jsbe<=msbe;jsbe++)
    		{if (asbe[isbe][jsbe]>maysbe)
    			{maysbe=asbe[isbe][jsbe];
    				pisbe=isbe; pjsbe=jsbe;
    			}
    		ssbe=ssbe+asbe[isbe][jsbe];
    		}
    	bsbe[isbe]=ssbe; ssbe=0;
    	}
    }
    public static void main(String[] args)
    {   int nsbe,msbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe y msbe");
        nsbe=sc.nextInt();
        msbe=sc.nextInt();
        llenarm(nsbe,msbe);
        maysumar(nsbe,msbe);
        mostrarm(nsbe,msbe);
        System.out.println(" "+asbe[pisbe][pjsbe]);
        mostrarv(nsbe);
    }
}