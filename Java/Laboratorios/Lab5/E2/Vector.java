package Laboratorios.Lab5.E2;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
public class Vector {
    private
        int nom[]=new  int[10];
        int n;
    public
        Vector()
        {
            n=1;
            nom[1]=15;
        }
        Vector(int a)
        {   int i;
            n=a;
            for(i=1; i<=n; i++)
            {nom[i]=i;}
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
        {   Scanner sc=new Scanner(System.in);
            int i;
            System.out.println("intro n");
            n=sc.nextInt();
            for(i=1;i<=n;i++)
            {System.out.println("nom["+i+"]=");
                nom[i]=sc.nextInt();   
            }
        }
        void mostrar()
        {
            int i;
            System.out.println("\n");
            for(i=1;i<=n;i++)
            {System.out.println(" "+nom[i]);}
        }
        void ordenar()
        {   int i,j,x;
            for(i=1;i<=n-1;i++)
            {   for(j=1;j<=n-1;j++)
                {   if(nom[i]>nom[j])
                    {
                        x=nom[i]; nom[i]=nom[j]; nom[j]=x;
                    }
                }
            }
        }
        void ordenar(int a)
        {   int i,k=0,x;
            for(i=1;i<=n-1;i++)
            {   k=i;
               while(nom[k]<=nom[k-1]&&k>1)
                    {
                        x=nom[k]; nom[k]=nom[k-1]; nom[k-1]=x;
                    }
            }
        }
        void ordenar(double a)
        {   int i,k=0,x,sw=1,li=1,ls=n;
            while(sw!=0)
            {   sw=0;
                if(k==0)
                {   for(i=li;i<=ls-1;i++)
                    {if(nom[i]>nom[i+1])
                        {x=nom[i];nom[i]=nom[i+1];nom[i+1]=x; sw=1;}
                    }k=1;ls=ls-1;
                }
                else
                {   for(i=ls;i>=li+1;i--)
                    { 
                        if (nom[i]<nom[i-1])
                        { x=nom[i]; nom[i]=nom[i-1];nom[i-1]=x;sw=1;}
                    }k=1;li=li+1;
                }
            }
        }
}   
