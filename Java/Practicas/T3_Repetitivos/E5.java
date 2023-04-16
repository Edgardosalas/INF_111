package Practicas.T3_Repetitivos;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
    int s, c, p, n, i, j;
    Scanner sc=new Scanner(System.in);
    s=0;
    c=1;
    p=1;
    n=sc.nextInt();
    for (i=1;i<=n;i++)
    {
        for (j=1;j<=p;j++)
        {
            s=s+1;
            if (j==c)
            {System.out.println(s);
            c=c+1;}
            else
            {System.out.print(s+" ");}
        }
        p=p+1;
    }
    }
}
