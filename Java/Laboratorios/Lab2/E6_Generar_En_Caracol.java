package Laboratorios.Lab2;
import java.util.Scanner;
public class E6_Generar_En_Caracol {
    static public int a[][]=new int[10][10];
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
    static void eles(int n)
    {int i, j, k, c, k1;
    	c=1; k1=1;
    	for (k=n;k>=1;k--)
    	{	j=k;
    		for (i=1;i<=k1;i++)
    		{	a[i][j]=c; c=c+1;
    		}
    	i=k1;
    	for(j=k+1;j<=n;j++)
    	{	a[i][j]=c; c=c+1;
    	}
    	k1=k1+1;
    	}
    }
    public static void main(String[] args)
    {   int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n");
        n=sc.nextInt();
        eles(n);
        mostrarm(n);
    }
}