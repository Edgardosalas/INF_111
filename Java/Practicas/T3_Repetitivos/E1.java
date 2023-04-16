package Practicas.T3_Repetitivos;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        int n;
        int s, c, p, c2, i, j, k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s=0; c=n; p=1; c2=1;

        for (i=1;i<=n;i++)
            {s=s+c2*((int)Math.pow(10, (c-1)));
                c=c-1;
                c2=c2+1;}
        System.out.println(s);
        c=n;
        for (j=1;j<n;j++)
        {c=c-1;
            s=s%(int)Math.pow(10, (c));
            System.out.println(s);
        }
        c=n;
        for (k=1;k<=n-1;k++)
        {s=s*(int)Math.pow(10, p)+(c-1);
            c=c-1;
            System.out.println(s);
        }
            
    }
}