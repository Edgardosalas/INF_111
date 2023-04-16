package Practicas.T3_Repetitivos;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        int f, c, n, i;
        Scanner sc=new Scanner(System.in);
        f=1;
        c=1;
        while (true)
            {
                n=sc.nextInt();
                if (n>0)
                {   for (i=1;i<n;i++)
                    {
                        f=f+f*c;
                        c=c+1;
                    }
                System.out.println(f);
                break;
                }
            }
    }
}