package Laboratorios.Lab1;
import java.util.Scanner;
public class E7_Busqueda_Binaria {
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
    static void burbuja(int t)
    {int i, j, x=0;
        for (i=1;i<=t-1;i++)
        {	for (j=i+1;j<=t;j++)
            {	if(a[i]>a[j])
                {	x=a[j]; a[j]=a[i]; a[i]=x;
                }
            }
        }
    }
    static int busbin(int t, int x)
    {int lc, k=1, li=1, ls=t;
    	lc=(li+ls)/2;
    	while (x!=a[lc] && li<=ls)
    	{	if (x>a[lc]) {li=lc+1;}
    		else { ls=lc-1; }
    		lc=(li+ls/2);
    	}
    	if(x==a[lc]) {k=lc;}
    	else { k=-1; }
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
        burbuja(n);
        mostrarv(n);
        System.out.println("\nintro elem a buscar ");
        z=sc.nextInt();
        if (busbin(n,z)!= -1)
        {System.out.println("\n "+z+" esta en posi "+busbin(n,z));}
        else
        {System.out.println(" \nno existe ");}
    }
}