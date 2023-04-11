package Laboratorios.Lab1;
import java.util.Scanner;
public class E3_Rotar_Fibo_Izquierda {
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
        static public int esfibo(int w)
        {int a=-1, b=1, k=0, d=0;
            while(d<w)
            {d=a+b;
                a=b; b=d;
            }
            if (d==w) k=1;
            return k;
        }
        public static void main(String[] args)
        {   int n,k,i,x,y,p;
            k=0; x=0; p=0;
            Scanner sc = new Scanner(System.in);
            do
            {   System.out.println("intro n");
                n=sc.nextInt();
            }while (n>20);
            llenarv(n);
            mostrarv(n);
            for (i=n;i>=1;i--)
            {   if (esfibo(a[i])==1)
                {   if(k==0)
                    {   x=a[i]; p=i; k=1;}
                    else
                    {   y=a[i]; a[i]=x; x=y;}
                }
            }
            if(k==1){   a[p]=x;}
            mostrarv(n);
        }
    }
    