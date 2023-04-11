package Laboratorios.Lab2;
import java.util.Scanner;
public class E1_Encontrar_Mayor_Sumar_filas {
    static public int a[][]=new int[10][10];
    static public int b[]=new int[10];
    static public int pi, pj;
    static void llenarm(int n, int m)
    { int i, j;
    	Scanner sc = new Scanner(System.in);
        for (i=1;i<=n;i++)
        {	for (j=1;j<=m;j++)
            {System.out.println("a["+i+"]["+j+"]=");
            	a[i][j]=sc.nextInt();
            }
        }
    }
    static void mostrarm(int n, int m)
    { int i, j;
    System.out.println("\n");
        for (i=1;i<=n;i++)
        {	for (j=1;j<=m;j++)
            {System.out.print("\t"+a[i][j]);
            }
        	System.out.println("\n");
        }
    }
    static void mostrarv(int t)
    { int i;
    System.out.println("\n");
        for (i=1;i<=t;i++)
        {System.out.print("\t"+b[i]);
        }
    }
    static void maysumar (int n, int m)
    {int may=0, s=0, i, j;
    	for (i=1;i<=n;i++)
    	{	for (j=1;j<=m;j++)
    		{if (a[i][j]>may)
    			{may=a[i][j];
    				pi=i; pj=j;
    			}
    		s=s+a[i][j];
    		}
    	b[i]=s; s=0;
    	}
    }
    public static void main(String[] args)
    {   int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n y m");
        n=sc.nextInt();
        m=sc.nextInt();
        llenarm(n,m);
        maysumar(n,m);
        mostrarm(n,m);
        System.out.println(" "+a[pi][pj]);
        mostrarv(n);
    }
}