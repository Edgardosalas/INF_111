package Laboratorios.Lab1;
import java.util.Scanner;
public class E1_Rotar_pares_derecha {
    public static void main(String[] args)
    {   int nsbe,ksbe,isbe,xsbe,ysbe,psbe;
        ksbe=0; xsbe=0; psbe=0;
        int asbe[]= new int[20];
        try (Scanner sc = new Scanner(System.in)) {
            do
            {   System.out.println("intro tam de vec");
                nsbe=sc.nextInt();
            }while (nsbe>20);
            for(isbe=1; isbe<=nsbe; isbe++)
            {   System.out.println(" asbe[" +isbe+ "]=");
                asbe[isbe]=sc.nextInt();
            }
        }
        for(isbe=1;isbe<=nsbe;isbe++)
        {   if (asbe[isbe]%2==0)
            {   if(ksbe==0)
                {   xsbe=asbe[isbe]; psbe=isbe; ksbe=1; }
                else
                {   ysbe=asbe[isbe]; asbe[isbe]=xsbe; xsbe=ysbe; }
            }
        }
        if(ksbe==1){   asbe[psbe]=xsbe; }
        System.out.println(" ");
        for (isbe=1;isbe<=nsbe;isbe++)
        {   System.out.println(" "+ asbe[isbe]);
        }
    }
}