package Laboratorios.Lab2;
import java.util.Scanner;
public class E4_Llenar_una_matriz {
    static public int asbe[][]=new int[10][10];
    static void llenar1(int nsbe, int msbe)
    { int isbe, jsbe, csbe=1;
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=msbe;jsbe++)
            {System.out.println("asbe["+isbe+"]["+jsbe+"]=");
            	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
            }
        }
    }
    static void mostrarm(int nsbe, int msbe)
    { int isbe, jsbe;
    System.out.println("\nsbe");
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=msbe;jsbe++)
            {System.out.print("\t"+asbe[isbe][jsbe]);
            }
        	System.out.println("\nsbe");
        }
    }

    public static void main(String[] args)
    {   int nsbe,msbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe y msbe");
        nsbe=sc.nextInt();
        msbe=sc.nextInt();
        llenar1(nsbe,msbe);
        mostrarm(nsbe,msbe);
    }
}