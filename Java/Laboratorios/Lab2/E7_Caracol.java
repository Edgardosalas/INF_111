package Laboratorios.Lab2;
import java.util.Scanner;
public class E7_Caracol {
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
    static void us(int n)
    {int i, j, k, c=1, ls;
    	ls=n;
    	for (k=1;k<=(n/2);k++)
    	{	i=k;
    		for (j=1;j<=ls;j++)
    		{	a[i][j]=c; c=c+1;
    		}
    	j=ls;
    	for(i=k+1;i<=ls;j++)
    	{	a[i][j]=c; c=c+1;
    	}
    	i=ls;
    	for(j=ls-1;j>=1;j--)
    	{	a[i][j]=c; c=c+1;
    	}
    	ls=ls-1;
    	}
    	if(n%2==1)
    	{	i=(n/2)+1;
    		for(j=1;j<=(n/2)+1;j++)
    		{	a[i][j]=c; c=c+1;}
    	}
    }
    public static void main(String[] args)
    {   int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n");
        n=sc.nextInt();
        us(n);
        mostrarm(n);
    }
}