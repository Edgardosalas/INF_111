package Laboratorios.Lab1;
import java.util.Scanner;
public class E2_Rotar_impares_izquierda {
        static public int a[]=new int[20];
        static public void llenarv(int t)
        {int i;
            Scanner sc=new Scanner(System.in);
            for (i=1;i<=t;i++)
            {
                System.out.println(" a["+i+"]=");
                a[i]=sc.nextInt();
            }
        }
        static public void mostrarv(int t)
        {int i;
            System.out.println("");
            for (i=1;i<=t;i++)
            {
                System.out.print(" "+ a[i]);
            }
        }
        static public void impar(int t)
        {int i, x=0,p=0,k=0;
            for (i=1;i<=t;i++)
            {	if (a[i]%2==1)
                {	if (k==0)
                    {	x=a[i]; p=i; k=1;}
                    else
                    {	a[p]=a[i]; p=i;}
                }
            }
            if (k==1) {	a[p]=x;}
        }
        public static void main(String[] args) 
        {int n,k,i,x,y,pos;
            k=0; x=0; pos=0;
            Scanner sc = new Scanner(System.in);
            do
            {	System.out.println("intro tam de vec");
                n=sc.nextInt();
            }while(n>20);
            llenarv(n);
            mostrarv(n);
            impar(n);
            mostrarv(n);
        }
    }
