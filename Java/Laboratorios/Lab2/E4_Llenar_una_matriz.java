package Laboratorios.Lab2;
import java.util.Scanner;
public class E4_Llenar_una_matriz {
    static public int a[][]=new int[10][10];
    static void llenar1(int n, int m)
    { int i, j, c=1;
        for (i=1;i<=n;i++)
        {	for (j=1;j<=m;j++)
            {System.out.println("a["+i+"]["+j+"]=");
            	a[i][j]=c; c=c+1;
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

    public static void main(String[] args)
    {   int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n y m");
        n=sc.nextInt();
        m=sc.nextInt();
        llenar1(n,m);
        mostrarm(n,m);
    }
}