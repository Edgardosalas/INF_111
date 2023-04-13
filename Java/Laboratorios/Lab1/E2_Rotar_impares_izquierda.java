package Laboratorios.Lab1;
import java.util.Scanner;
public class E2_Rotar_impares_izquierda {
        static public int asbe[]=new int[20];
        static public void llenarv(int tsbe)
        {int isbe;
            Scanner sc=new Scanner(System.in);
            for (isbe=1;isbe<=tsbe;isbe++)
            {
                System.out.println(" asbe["+isbe+"]=");
                asbe[isbe]=sc.nextInt();
            }
        }
        static public void mostrarv(int tsbe)
        {int isbe;
            System.out.println("");
            for (isbe=1;isbe<=tsbe;isbe++)
            {
                System.out.print(" "+ asbe[isbe]);
            }
        }
        static public void impar(int tsbe)
        {int isbe, xsbe=0,psbe=0,ksbe=0;
            for (isbe=1;isbe<=tsbe;isbe++)
            {	if (asbe[isbe]%2==1)
                {	if (ksbe==0)
                    {	xsbe=asbe[isbe]; psbe=isbe; ksbe=1;}
                    else
                    {	asbe[psbe]=asbe[isbe]; psbe=isbe;}
                }
            }
            if (ksbe==1) {	asbe[psbe]=xsbe;}
        }
        public static void main(String[] args) 
        {int nsbe,ksbe,isbe,xsbe,ysbe,possbe;
            ksbe=0; xsbe=0; possbe=0;
            Scanner sc = new Scanner(System.in);
            do
            {	System.out.println("intro tam de vec");
                nsbe=sc.nextInt();
            }while(nsbe>20);
            llenarv(nsbe);
            mostrarv(nsbe);
            impar(nsbe);
            mostrarv(nsbe);
        }
    }
