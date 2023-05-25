package Laboratorios.Lab4.E1_Matriz;

public class Matriz {
	private
	int esbe[][]=new int[10][10];
	int n;
	public
	Matriz()
	{n=1;
		esbe[n][n]=15;
	}
	Matriz(int asbe)
	{int i, j;
		n=asbe;
		for(i=1;i<=n;i++)
		{	for(j=1;j<=n;j++)
			{esbe[i][j]=i+j;
			}
		}
	}
	void mostrarm (int n)
	{int i,j;
		System.out.println("\n");
		for(i=1;i<=n;i++)
		{	for(j=1;j<=n;j++)
			{
				System.out.print("\t"+esbe[i][j]);
			}
			System.out.println("\n");
		}
	}
	void caracolcentro(int n)
	{	int i,j,psbe,k,c=1,li,ls;
		psbe=(n/2)+1; li=psbe; ls=psbe;
		esbe[psbe][psbe]=c;c++;
		for(k=1;k<=psbe-1;k++)
		{	j=ls+1;
			for(i=li;i<=ls+1;i++)
			{esbe[i][j]=c; c=c+1;}
			i=ls+1;
			for(j=ls;j>=li-1;j--)
			{esbe[i][j]=c;c=c+1;}
			j=li-1;
			for(i=ls;i>=li-1;i--)
			{esbe[i][j]=c;c=c+1;}
			i=li-1;
			for(j=li;j<=ls+1;j++)
			{esbe[i][j]=c;c=c+1;}
			li=li-1; ls=ls+1;
		}
	}
	void rombo(int n)
	{int i,j,c=1,li,ls;
		li=(n/2)+1; ls=li;
		for(i=1;i<=n;i++)
		{	for(j=li;j<=ls;j++)
			{esbe[i][j]=c; c=c+1;
			}
		if(i>=(n/2)+1)
		{li=li+1; ls=ls-1;}
		else
		{li=li-1; ls=ls+1;}
		}
	}
	void zic(int n)
	{int c=1,k,i,j;
		for(k=1;k<=n;k++)
			{if(k%2==1)
				{j=k;
					for(i=1;i<=k;i++)
					{esbe[i][j]=c;c++;j--;}
				}
			else
				{i=k;
					for(j=1;j<=k;j++)
					{esbe[i][j]=c;c++;i--;}
				}
			}
		for(k=2;k<=n;k++)
		{if(k%2==1)
			{j=n;
				for(i=k;i<=n;i++)
				{esbe[i][j]=c;c++;j--;}
			}
			else
			{	i=n;
				for(j=k;j<=n;j++)
					{esbe[i][j]=c; c++; i--;}
			}
		}
	}
}

