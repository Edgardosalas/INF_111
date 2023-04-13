package Laboratorios.Lab1;
import java.util.Scanner;
public class E5_Ordenar_Sacudida {
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
        static void sacudida(int tsbe)
        {int isbe, xsbe=0, swsbe=1, lisbe=1, lssbe=tsbe, ksbe=0;
            while(swsbe!=0)
            {swsbe=0;
                if(ksbe==0)
                {	for(isbe=lisbe;isbe<=lssbe-1;isbe++)
                    {if(asbe[isbe]>asbe[isbe+1])
                        {xsbe=asbe[isbe]; asbe[isbe]=asbe[isbe+1]; asbe[isbe+1]=xsbe; swsbe=1;
                        }
                    }
                    lssbe=lssbe-1; ksbe=1;
                }
                else
                {	for(isbe=lssbe;isbe>=lisbe+1;isbe--)
                    {if(asbe[isbe]<asbe[isbe-1])
                        {xsbe=asbe[isbe]; asbe[isbe]=asbe[isbe-1]; asbe[isbe-1]=xsbe; swsbe=1;
                        }
                    }
                lisbe=lisbe-1; ksbe=0;
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
            sacudida(nsbe);
            mostrarv(nsbe);
        }
    }
