package Laboratorios.Lab1;
import java.util.Scanner;
public class E5_Ordenar_Sacudida {
        static public int a[]=new int[20];
        static public void llenarv(int t)
        {int i;
            Scanner sc = new Scanner(System.in);
                for (i=1;i<=t;i++)
                {
                    System.out.println(" a["+i+"]=");
                    a[i]=sc.nextInt();
                }
            }
        static public void mostrarv(int t)
        { int i;
            System.out.println("");
            for (i=1;i<=t;i++)
            {
                System.out.print(" "+ a[i]);
            }
        }
        static void sacudida(int t)
        {int i, x=0, sw=1, li=1, ls=t, k=0;
            while(sw!=0)
            {sw=0;
                if(k==0)
                {	for(i=li;i<=ls-1;i++)
                    {if(a[i]>a[i+1])
                        {x=a[i]; a[i]=a[i+1]; a[i+1]=x; sw=1;
                        }
                    }
                    ls=ls-1; k=1;
                }
                else
                {	for(i=ls;i>=li+1;i--)
                    {if(a[i]<a[i-1])
                        {x=a[i]; a[i]=a[i-1]; a[i-1]=x; sw=1;
                        }
                    }
                li=li-1; k=0;
                }
            }
        }
        public static void main(String[] args)
        {   int n;
            Scanner sc = new Scanner(System.in);
            do
            {   System.out.println("intro n");
                n=sc.nextInt();
            }while (n>20);
            llenarv(n);
            mostrarv(n);
            sacudida(n);
            mostrarv(n);
        }
    }
