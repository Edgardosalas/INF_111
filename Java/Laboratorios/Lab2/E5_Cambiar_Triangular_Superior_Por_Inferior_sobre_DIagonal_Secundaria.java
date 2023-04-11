package Laboratorios.Lab2;
import java.util.Scanner;
public class E5_Cambiar_Triangular_Superior_Por_Inferior_sobre_DIagonal_Secundaria {
    static public int a[][]=new int[10][10];
    static void llenarm(int n)
    { int i, j;
    	Scanner sc = new Scanner(System.in);
        for (i=1;i<=n;i++)
        {	for (j=1;j<=n;j++)
            {System.out.println("a["+i+"]["+j+"]=");
            	a[i][j]=sc.nextInt();
            }
        }
    }
    static void mostrarm(int n)
    { int i, j;
    System.out.println("\n");
        for (i=1;i<=n;i++)
        {	for (j=1;j<=n;j++)
            {System.out.print("\t"+a[i][j]);
            }
        	System.out.println("\n");
        }
    }
    static void intertds(int n)
    {int n1,i1,j1,x,i,j;
    	n1=n; i1=n; j1=n;
    	for (i=1;i<=n-1;i++)
    	{	for (j=1;j<=n1-1;j++)
    		{	x=a[i][j]; a[i][j]=a[i1][j1]; a[i1][j1]=x; i1=i1-1;
    		}
    	n1=n1-1; i1=n; j1=j1-1;
    	}
    }
    public static void main(String[] args)
    {   int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n y m");
        n=sc.nextInt();
        llenarm(n);
        mostrarm(n);
        intertds(n);
        mostrarm(n);
    }
}
