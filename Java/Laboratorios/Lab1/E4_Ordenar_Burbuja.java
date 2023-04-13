package Laboratorios.Lab1;
import java.util.Scanner;
public class E4_Ordenar_Burbuja {
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
        static void burbuja(int tsbe)
        {int isbe, jsbe, xsbe=0;
            for (isbe=1;isbe<=tsbe-1;isbe++)
            {	for (jsbe=isbe+1;jsbe<=tsbe;jsbe++)
                {	if(asbe[isbe]>asbe[jsbe])
                    {	xsbe=asbe[jsbe]; asbe[jsbe]=asbe[isbe]; asbe[isbe]=xsbe;
                    }
                }
            }
        }
        public static void main(String[] args)
        {   int nsbe;
            Scanner sc = new Scanner(System.in);
            do
            {   System.out.println("intro nsbe");
                nsbe=sc.nextInt();
            }while (nsbe>20);
            llenarv(nsbe);
            mostrarv(nsbe);
            burbuja(nsbe);
            mostrarv(nsbe);
        }
    }
