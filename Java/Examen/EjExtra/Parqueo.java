package Examen.EjExtra;
import java.util.Scanner;
public class Parqueo {
    Scanner sc=new Scanner(System.in);
    private
    Auto vec[]=new Auto[20];
    int tam;
    public
    Parqueo()
    {
        tam=1;
        vec[1]=new Auto();
    }
    Parqueo(int a)
    {   int i;
        tam=a;
        for(i=1;i<=tam-1;i++)
        {vec[i]=new Auto();}
        vec[a]=new Auto("azul");
    }
    public int getTam() {
        return tam;
    }
    public void setTam(int tam) {
        this.tam = tam;
    }
    public Auto[] getVec() {
        return vec;
    }
    public void setVec(Auto[] vec) {
        this.vec = vec;
    }
    public void ponc(int a, Auto X)
    {
        vec[a].setAño(X.getAño());
        vec[a].setColor(X.getColor());
        vec[a].setMarca(X.getMarca());
    }
    void leer()
    {   Scanner sc=new Scanner(System.in);
        int i;
        tam=sc.nextInt();
        for(i=1;i<=tam;i++)
        {vec[i].read();}
    }
    void mostrar()
    {   int i;
        for(i=1;i<=tam;i++)
        {vec[i].mostrar();}
    }
    void ContarAutosRojos()
    {   int i, c=0;
        for(i=1;i<=tam;i++)
        {   if(vec[i].getColor()=="rojo")
            {c=c+1;}
        }
        System.out.println("Cantidad de Autos Rojos: "+c);
    }
    void masModerno()
    {   int i, pos=0;
        for(i=1;i<=tam-1;i++)
        {   if(vec[i].getAño()>vec[i+1].getAño())
            {pos=i;}
            else
            {pos=i+1;}
        }
        System.out.println("El auto mas moderno esta en la posicion "+pos);
    }
    void marcaFrecuente()
    {   int i,cT=0,cR=0,cP=0, may; String m;
        for(i=1;i<=tam;i++)
        {   if(vec[i].getMarca()=="Toyota")
            {cT=cT+1;}
            else if(vec[i].getMarca()=="Patito")
            {cP=cP+1;}
            else if(vec[i].getMarca()=="Renault")
            {cR=cR+1;}
        }
        if(cT>cR)
        {may=cT;}
        else
        {may=cR;}
        if (cP>may)
        {may=cP;}

        if(may==cT)
        {System.out.println("La marca que mas se repite es Toyota");}
        else if(may==cR)
        {System.out.println("La marca que mas se repite es Renault");}
        else if(may==cP)
        {System.out.println("La marca que mas se repite es Patito");}
    }
}