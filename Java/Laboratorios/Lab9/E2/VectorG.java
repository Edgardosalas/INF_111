package Laboratorios.Lab9.E2;

public class VectorG <T> {
    private
    Object dat[]=new Object[20];
    int n;
    private
    VectorG()
    {n=1;}
    VectorG(T x, int t)
    {
        int i; n=t;
        for(i=1;1<=n;i++)
        {dat[i]=x;}
    }
    VectorG(T a, T b, T c, T d, T e)
    {
        n=5;
        dat[1]=a; dat[2]=b; dat[3]=c;
        dat[4]=d; dat[5]=e;
    }
    void invertir()
    {
        int i,k; k=n;
        T x;
        for(i=1; i<=n/2; i++)
        {
            x=(T)dat[i]; dat[i]=dat[k];
            dat[k]=x; k=k-1;
        }
    }
    void mostrar()
    {
        int i;
        System.out.println("\n");
        for(i=1;i<=n;i++)
        {System.out.println(" "+dat[i]);}
    }
    void ordenar()
    {
        int i, j;
        T x;
        for (i = 1; i <= n-1; i++) 
        {
            for(j=i+1;j<=n;j++)
            {
                if(dat[i].toString().compareTo(dat[j].toString())>0)
                {x=(T)dat[i]; dat[i]=dat[j]; dat[j]=x;}
            }    
        }
    }
}
