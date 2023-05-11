package Laboratorios.Lab5.E1;
import java.util.Scanner;
public class Fecha {
    private
        int dia;
        int mes; 
        int año;
    public
        Fecha()
        {
            dia=10;
            mes=4;
            año=2023;
        }
        Fecha (int a, int b, int c)
        {
            dia=a;
            mes=b;
            año=c;
        }
        Fecha(int a)
        {
            dia=a;
            mes=9;
            año=2023;
        }
        Fecha(int a, int b)
        {
            dia=a;
            mes=b;
            año=2023;
        }
        int obtd()
        {return dia;}
        void pond(int a)
        {dia=a;}
        int obtm()
        {return mes;}
        void ponm(int a)
        {mes=a;}
        int obta()
        {return año;}
        void pona(int a)
        {año=a;}
        void leer()
        {
            Scanner sc=new Scanner(System.in);
            dia=sc.nextInt();
            mes=sc.nextInt();
            año=sc.nextInt();
        }
        void mostrar()
        {
            System.out.println(" "+dia+" "+mes+" "+año+" ");
        }
        void compara(Fecha F)
        {
            if (dia==F.obtd()&&mes==F.obtm()&&año==F.obta())
            {System.out.println("Misma fecha");}
            else
            {System.out.println("Fechas distintas");}
        }
        void compara(int d)
        {
            if (dia==d)
            System.out.println("Mismo dia");
            else
            {System.out.println("Distintos dias");}
        }
        void compara(int a, int b)
        {
            if (dia==a&&mes==b)
            {System.out.println("Mismo dia y mismo mes");}
            else
            {System.out.println("Distinots dia/mes");}
        }
        void compara(int a, int b, int c)
        {
            if(dia==a&&mes==b&&año==c)
            {System.out.println("Mismo dia mismo mes y mismo año");}
            else
            {System.out.println("Distintos dias/mes/año");}
        }
}
