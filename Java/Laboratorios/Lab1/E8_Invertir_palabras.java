package Laboratorios.Lab1;
import java.util.Scanner;
public class E8_Invertir_palabras {
    static public String asbe[]=new String[20];
    static public void mostrarv(int tsbe)
    { int isbe;
        System.out.println("");
        for (isbe=1;isbe<=tsbe;isbe++)
        {
            System.out.print(" "+ asbe[isbe]);
        }
    }
    static int contarpal(String wsbe)
    {int cpsbe=0, lonsbe,isbe; String ysbe; wsbe=wsbe+" ";
    	lonsbe=wsbe.length();
    	for (isbe=1;isbe<=lonsbe;isbe++)
    	{	ysbe=wsbe.substring(isbe-1,isbe);
    		if(ysbe.compareTo(" ")==0) {cpsbe=cpsbe+1;}
    	}
    	return cpsbe;
    }
    static String sacarpal(String wsbe, int ksbe)
    {int cpsbe=0,lonsbe,isbe; String ysbe,vsbe="",zsbe=""; wsbe=wsbe+" ";
    	lonsbe=wsbe.length();
    	for (isbe=1;isbe<=lonsbe;isbe++)
    	{	ysbe=wsbe.substring(isbe-1,isbe);
    		if(ysbe.compareTo(" ")==0)
    		{cpsbe=cpsbe+1;
    			if(cpsbe==ksbe) {zsbe=vsbe;}
    			vsbe="";
    		}
    		else
    		{vsbe=vsbe+ysbe;}
    	}
    	return zsbe;
    }
    static String invertir(String wsbe)
    {int isbe, elesbe;
    	String vsbe,ysbe; vsbe="";
    	elesbe=wsbe.length();
    	for(isbe=1;isbe<=elesbe;isbe++)
    	{ysbe=wsbe.substring(isbe-1,isbe);
    	vsbe=ysbe+vsbe;}
    	return vsbe;
    }
    public static void main(String[] args)
    {   int cpsbe, isbe;
    	String bsbe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro una cadena");
        bsbe=sc.nextLine();
        cpsbe=contarpal(bsbe);
        for (isbe=1;isbe<=cpsbe;isbe++)
        {	asbe[isbe]=sacarpal(bsbe,isbe);}
        mostrarv(cpsbe);
        for (isbe=1;isbe<=cpsbe;isbe++)
        {asbe[isbe]=invertir(asbe[isbe]);}
        mostrarv(cpsbe);
    }
}
