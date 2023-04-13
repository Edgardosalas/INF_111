package Laboratorios.Lab2;
import java.util.Scanner;
public class E6_Generar_En_Caracol {
    static public int asbe[][]=new int[10][10];
    static void mostrarm(int nsbe)
    { int isbe, jsbe;
    System.out.println("\n");
        for (isbe=1;isbe<=nsbe;isbe++)
        {	for (jsbe=1;jsbe<=nsbe;jsbe++)
            {System.out.print("\t"+asbe[isbe][jsbe]);
            }
        	System.out.println("\n");
        }
    }
    static void eles(int nsbe)
    {int isbe, jsbe, ksbe, csbe, k1sbe;
    	csbe=1; k1sbe=1;
    	for (ksbe=nsbe;ksbe>=1;ksbe--)
    	{	jsbe=ksbe;
    		for (isbe=1;isbe<=k1sbe;isbe++)
    		{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
    		}
    	isbe=k1sbe;
    	for(jsbe=ksbe+1;jsbe<=nsbe;jsbe++)
    	{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
    	}
    	k1sbe=k1sbe+1;
    	}
    }
    public static void main(String[] args)
    {   int nsbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe");
        nsbe=sc.nextInt();
        eles(nsbe);
        mostrarm(nsbe);
    }
}