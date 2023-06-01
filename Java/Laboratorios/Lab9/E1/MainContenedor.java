package Laboratorios.Lab9.E1;

public class MainContenedor {
    public static void main(String[] aStrings){
        Contenedor <Integer> C1sbe=new Contenedor<Integer>(10);
        Contenedor <Integer> C2sbe=new Contenedor<Integer>(10);
        C1sbe.mostrar();
        C2sbe.mostrar();
        C1sbe.compara(C2sbe);
        Contenedor <Double> C3sbe=new Contenedor<Double>(3.0);
        Contenedor <Double> C4sbe=new Contenedor<Double>(3.5);
        C3sbe.mostrar();
        C4sbe.mostrar();
        C3sbe.compara(C4sbe);
    }
}
