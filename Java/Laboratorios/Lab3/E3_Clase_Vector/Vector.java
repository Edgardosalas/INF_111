package Laboratorios.Lab3.E3_Clase_Vector;
import java.util.Scanner;
public class Vector {
			private
				int nom[]=new int[10];
				int n;
			public
				Vector()
				{	n=1;
					nom[1]=15;
				}
				Vector(int a)
				{	int i;
					n=a;
					for(i=1;i<=n;i++)
					{nom[i]=i;
					}
				}
				int obtn()
				{return n;}
				int obtnom(int k)
				{return nom[k];}
				void ponn(int a)
				{n=a;}
				void ponnom(int k, int a)
				{nom[k]=a;}
				void leer()
				{	int i;
					Scanner sc=new Scanner(System.in);
					System.out.println("Intro n");
					n=sc.nextInt();
	                for (i=1;i<=n;i++)
	                {System.out.println("nom["+i+"]=");
	                	nom[i]=sc.nextInt();
	                }
				}
				void mostrar()
				{	int i;
					Scanner cs=new Scanner(System.in);
					System.out.println("\n");
					for (i=1;i<=n;i++)
					{	System.out.print(" "+nom[i]);
					}
				}
				void burbuja()
			    {	int i, j, x;
			        for (i=1;i<=n-1;i++)
			            {	for (j=i+1;j<=n;j++)
			                {	if(nom[i]>nom[j])
			                    {	x=nom[i]; nom[i]=nom[j];
			                    	nom[j]=x;
			                    }
			                }
			            }
			    }
			     void insercion()
			     {	int i, k=0, x;
			     	for (i=2;i<=n;i++)
			     	{	k=i;
			     		while(nom[k]<=nom[k-1] && k>1)
			     		{	x=nom[k]; nom[k]=nom[k-1]; nom[k-1]=x;
			     			k=k-1;
			     		}
			     	}
			     }
			     void sacudida()
			        {int i, k=0, x, sw=1, li=1, ls=n;
			            while(sw!=0)
			            {sw=0;
			                if(k==0)
			                {	for(i=li;i<=ls-1;i++)
			                    {if(nom[i]>nom[i+1])
			                        {x=nom[i]; nom[i]=nom[i+1]; nom[i+1]=x; sw=1;
			                        }
			                    }
			                    ls=ls-1; k=1;
			                }
			                else
			                {	for(i=ls;i>=li+1;i--)
			                    {if(nom[i]<nom[i-1])
			                        {x=nom[i]; nom[i]=nom[i-1]; nom[i-1]=x; sw=1;
			                        }
			                    }
			                li=li-1; k=0;
			                }
			            }
			        }
			}