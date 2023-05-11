package Laboratorios.Lab5.E1;

public class MainFecha {
    public static void main(String[]args){
        Fecha F1=new Fecha();
        Fecha F2=new Fecha();
        Fecha F3=new Fecha();
        Fecha F4=new Fecha();
        F1.compara(F2);
        F1.compara(10, 4, 2023);
        F2.compara(4, 4);
    }
}
