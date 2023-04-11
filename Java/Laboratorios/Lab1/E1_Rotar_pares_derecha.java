package Laboratorios.Lab1;
import java.util.Scanner;
public class E1_Rotar_pares_derecha {
    public static void main(String[] args)
    {   int n,k,i,x,y,p;
        k=0; x=0; p=0;
        int a[]= new int[20];
        try (Scanner sc = new Scanner(System.in)) {
            do
            {   System.out.println("intro tam de vec");
                n=sc.nextInt();
            }while (n>20);
            for(i=1; i<=n; i++)
            {   System.out.println(" a[" +i+ "]=");
                a[i]=sc.nextInt();
            }
        }
        for(i=1;i<=n;i++)
        {   if (a[i]%2==0)
            {   if(k==0)
                {   x=a[i]; p=i; k=1; }
                else
                {   y=a[i]; a[i]=x; x=y; }
            }
        }
        if(k==1){   a[p]=x; }
        System.out.println(" ");
        for (i=1;i<=n;i++)
        {   System.out.println(" "+ a[i]);
        }
    }
}