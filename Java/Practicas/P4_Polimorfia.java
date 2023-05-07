package Practicas;
import java.util.Scanner;
public class P4_Polimorfia {
    private
    int n;
    int m;
    static int mat[][]=new int[10][10];
    public 
    P4_Polimorfia()
    {
        n=5;
        m=5;
    }
    void mostrarm ()
	{int i,j;
		System.out.println("\n");
		for(i=1;i<=n;i++)
		{	for(j=1;j<=m;j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println("\n");
		}
	}
	void generar()
	{	int i,j,p,k,c=1,li,ls;
		p=(n/2)+1; li=p; ls=p;
		mat[p][p]=c;c=c+2;
		for(k=1;k<=p-1;k++)
		{	j=ls+1;
			for(i=li;i<=ls+1;i++)
			{mat[i][j]=c;}
			i=ls+1;
			for(j=ls;j>=li-1;j--)
			{mat[i][j]=c;}
			j=li-1;
			for(i=ls;i>=li-1;i--)
			{mat[i][j]=c;}
			i=li-1;
			for(j=li;j<=ls+1;j++)
			{mat[i][j]=c;}
			li=li-1; ls=ls+1;c=c+2;
		}
	}
	void generar(int b)
	{	int i,j,p,k,c=1,li,ls;
		p=(n/2)+1; li=1; ls=5;
		mat[1][5]=c;c++;
		for(k=1;k<=p-1;k++)
		{	j=ls+1;
			for(i=li;i<=ls+1;i++)
			{mat[i][j]=c; c=c+1;}
			i=ls+1;
			for(j=ls;j>=li-1;j--)
			{mat[i][j]=c;c=c+1;}
			j=li-1;
			for(i=ls;i>=li-1;i--)
			{mat[i][j]=c;c=c+1;}
			i=li-1;
			for(j=li;j<=ls+1;j++)
			{mat[i][j]=c;c=c+1;}
			li=li-1; ls=ls+1;
		}
	}
}ñ