package Laboratorios.Lab9.E2;

public class VectorG <T> {
    private
    Object datsbe[]=new Object[20];
    int nsbe;
    private
    VectorG()
    {nsbe=1;}
    VectorG(T x, int t)
    {
        int i; nsbe=t;
        for(i=1;1<=nsbe;i++)
        {datsbe[i]=x;}
    }
    VectorG(T a, T b, T c, T d, T e)
    {
        nsbe=5;
        datsbe[1]=a; datsbe[2]=b; datsbe[3]=c;
        datsbe[4]=d; datsbe[5]=e;
    }
    void invertir()
    {
        int i,k; k=nsbe;
        T x;
        for(i=1; i<=nsbe/2; i++)
        {
            x=(T)datsbe[i]; datsbe[i]=datsbe[k];
            datsbe[k]=x; k=k-1;
        }
    }
    void mostrar()
    {
        int i;
        System.out.println("\nsbe");
        for(i=1;i<=nsbe;i++)
        {System.out.println(" "+datsbe[i]);}
    }
    void ordenar()
    {
        int i, j;
        T x;
        for (i = 1; i <= nsbe-1; i++) 
        {
            for(j=i+1;j<=nsbe;j++)
            {
                if(datsbe[i].toString().compareTo(datsbe[j].toString())>0)
                {x=(T)datsbe[i]; datsbe[i]=datsbe[j]; datsbe[j]=x;}
            }    
        }
    }
}
