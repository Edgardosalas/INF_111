package Laboratorios.Lab1;
import java.util.Scanner;
public class E4_Ordenar_Burbuja {
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
        static void burbuja(int t)
        {int i, j, x=0;
            for (i=1;i<=t-1;i++)
            {	for (j=i+1;j<=t;j++)
                {	if(a[i]>a[j])
                    {	x=a[j]; a[j]=a[i]; a[i]=x;
                    }
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
            burbuja(n);
            mostrarv(n);
        }
    }
