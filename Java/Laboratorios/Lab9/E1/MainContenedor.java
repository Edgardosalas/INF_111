package Laboratorios.Lab9.E1;

public class MainContenedor {
    public static void main(String[] aStrings){
        Contenedor <Integer> C1=new Contenedor<Integer>(10);
        Contenedor <Integer> C2=new Contenedor<Integer>(10);
        C1.mostrar();
        C2.mostrar();
        C1.compara(C2);
        Contenedor <Double> C3=new Contenedor<Double>(3.0);
        Contenedor <Double> C4=new Contenedor<Double>(3.5);
        C3.mostrar();
        C4.mostrar();
        C3.compara(C4);
    }
}
