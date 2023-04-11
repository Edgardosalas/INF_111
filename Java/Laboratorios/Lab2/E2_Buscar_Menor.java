package Laboratorios.Lab2;
import java.util.Scanner;
public class E2_Buscar_Menor {
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
    static void menor (int n, int m)
    {int i, j,men=9999;
    	for (i=1;i<=n;i++)
    	{	for (j=1;j<=m;j++)
    		{if (a[i][j]<men)
    			{men=a[i][j];
    				pi=i; pj=j;
    			}
    		}
    	}
    }
    public static void main(String[] args)
    {   int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n y m");
        n=sc.nextInt();
        m=sc.nextInt();
        llenarm(n,m);
        mostrarm(n,m);
        menor(n,m);
        System.out.println("menor="+a[pi][pj]);
    }
}