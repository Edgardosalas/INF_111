package Laboratorios.Lab2;
import java.util.Scanner;
public class E7_Caracol {
    static public int asbe[][]=new int[10][10];
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
    static void us(int nsbe)
    {int isbe, jsbe, ksbe, csbe=1, lssbe;
    	lssbe=nsbe;
    	for (ksbe=1;ksbe<=(nsbe/2);ksbe++)
    	{	isbe=ksbe;
    		for (jsbe=1;jsbe<=lssbe;jsbe++)
    		{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
    		}
    	jsbe=lssbe;
    	for(isbe=ksbe+1;isbe<=lssbe;jsbe++)
    	{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
    	}
    	isbe=lssbe;
    	for(jsbe=lssbe-1;jsbe>=1;jsbe--)
    	{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;
    	}
    	lssbe=lssbe-1;
    	}
    	if(nsbe%2==1)
    	{	isbe=(nsbe/2)+1;
    		for(jsbe=1;jsbe<=(nsbe/2)+1;jsbe++)
    		{	asbe[isbe][jsbe]=csbe; csbe=csbe+1;}
    	}
    }
    public static void main(String[] args)
    {   int nsbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro nsbe");
        nsbe=sc.nextInt();
        us(nsbe);
        mostrarm(nsbe);
    }
}