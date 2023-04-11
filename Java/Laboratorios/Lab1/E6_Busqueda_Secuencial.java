package Laboratorios.Lab1;
import java.util.Scanner;
public class E6_Busqueda_Secuencial {
    static public int a[]=new int[20];
    static public void llenarv(int t)
    {int i;
        Scanner sc = new Scanner(System.in);
            for (i=1;i<=t;i++)
            {
                System.out.println(" a["+i+"]=");
                a[i]=sc.nextInt();
            }
        }
    static public void mostrarv(int t)
    { int i;
        System.out.println("");
        for (i=1;i<=t;i++)
        {
            System.out.print(" "+ a[i]);
        }
    }
    static int bussec(int t, int x)
    {int k=1;
    	while(x!=a[k] && k<=t)
    	{	k=k+1;
    	}
    	if(x!=a[k]) {k=-1;}
    	return k;
    }
    public static void main(String[] args)
    {   int n, z;
        Scanner sc = new Scanner(System.in);
        do
        {   System.out.println("intro n");
            n=sc.nextInt();
        }while (n>20);
        llenarv(n);
        mostrarv(n);
        System.out.println("\nintro elem a buscar ");
        z=sc.nextInt();
        if (bussec(n,z)!= -1)
        {System.out.println("\n "+z+" esta en posi "+bussec(n,z));}
        else
        {System.out.println(" \nnoexiste ");}
    }
}