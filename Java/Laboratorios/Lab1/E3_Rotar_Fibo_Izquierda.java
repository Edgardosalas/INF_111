package Laboratorios.Lab1;
import java.util.Scanner;
public class E3_Rotar_Fibo_Izquierda {
        static public int asbe[]=new int[20];
        static public void llenarv(int tsbe)
        {int isbe;
            Scanner sc = new Scanner(System.in);
                for (isbe=1;isbe<=tsbe;isbe++)
                {
                    System.out.println(" asbe["+isbe+"]=");
                    asbe[isbe]=sc.nextInt();
                }
            }
        static public void mostrarv(int tsbe)
        { int isbe;
            System.out.println("");
            for (isbe=1;isbe<=tsbe;isbe++)
            {
                System.out.print(" "+ asbe[isbe]);
            }
        }
        static public int esfibo(int wsbe)
        {int asbe=-1, bsbe=1, ksbe=0, dsbe=0;
            while(dsbe<wsbe)
            {dsbe=asbe+bsbe;
                asbe=bsbe; bsbe=dsbe;
            }
            if (dsbe==wsbe) ksbe=1;
            return ksbe;
        }
        public static void main(String[] args)
        {   int nsbe,ksbe,isbe,xsbe,ysbe,psbe;
            ksbe=0; xsbe=0; psbe=0;
            Scanner sc = new Scanner(System.in);
            do
            {   System.out.println("intro n");
                nsbe=sc.nextInt();
            }while (nsbe>20);
            llenarv(nsbe);
            mostrarv(nsbe);
            for (isbe=nsbe;isbe>=1;isbe--)
            {   if (esfibo(asbe[isbe])==1)
                {   if(ksbe==0)
                    {   xsbe=asbe[isbe]; psbe=isbe; ksbe=1;}
                    else
                    {   ysbe=asbe[isbe]; asbe[isbe]=xsbe; xsbe=ysbe;}
                }
            }
            if(ksbe==1){   asbe[psbe]=xsbe;}
            mostrarv(nsbe);
        }
    }
    