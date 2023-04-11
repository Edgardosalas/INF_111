package Laboratorios.Lab1;
import java.util.Scanner;
public class E8_Invertir_palabras {
    static public String a[]=new String[20];
    static public void mostrarv(int t)
    { int i;
        System.out.println("");
        for (i=1;i<=t;i++)
        {
            System.out.print(" "+ a[i]);
        }
    }
    static int contarpal(String w)
    {int cp=0, lon,i; String y; w=w+" ";
    	lon=w.length();
    	for (i=1;i<=lon;i++)
    	{	y=w.substring(i-1,i);
    		if(y.compareTo(" ")==0) {cp=cp+1;}
    	}
    	return cp;
    }
    static String sacarpal(String w, int k)
    {int cp=0,lon,i; String y,v="",z=""; w=w+" ";
    	lon=w.length();
    	for (i=1;i<=lon;i++)
    	{	y=w.substring(i-1,i);
    		if(y.compareTo(" ")==0)
    		{cp=cp+1;
    			if(cp==k) {z=v;}
    			v="";
    		}
    		else
    		{v=v+y;}
    	}
    	return z;
    }
    static String invertir(String w)
    {int i, ele;
    	String v,y; v="";
    	ele=w.length();
    	for(i=1;i<=ele;i++)
    	{y=w.substring(i-1,i);
    	v=y+v;}
    	return v;
    }
    public static void main(String[] args)
    {   int cp, i;
    	String b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro una cadena");
        b=sc.nextLine();
        cp=contarpal(b);
        for (i=1;i<=cp;i++)
        {	a[i]=sacarpal(b,i);}
        mostrarv(cp);
        for (i=1;i<=cp;i++)
        {a[i]=invertir(a[i]);}
        mostrarv(cp);
    }
}
