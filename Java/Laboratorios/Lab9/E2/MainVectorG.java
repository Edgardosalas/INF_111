package Laboratorios.Lab9.E2;

public class MainVectorG {
    public static void main(String[] aStrings){
        VectorG <Integer> V1sbe= new VectorG<Integer>(new Integer(5), new Integer(4), new Integer(8), new Integer(3), new Integer(7));
    V1sbe.mostrar();
    V1sbe.invertir();
    V1sbe.mostrar();
    V1sbe.invertir();
    V1sbe.mostrar();
    String a="limon", b="manzana", c="uva", d="platano", e="cereza";
    VectorG <String> V2sbe=new VectorG<String>(a, b, c, d, e);
    V2sbe.mostrar();
    V2sbe.invertir();
    V2sbe.mostrar();
    V2sbe.ordenar();
    V2sbe.mostrar();
    Double d1=0.25, d2=3.1415, d3=1.5, d4=2.15, d5=1.75;
    VectorG<Double> V3sbe=new VectorG<Double>(d1, d2, d3, d4, d5);
    V3sbe.mostrar();
    V3sbe.invertir();
    V3sbe.mostrar();
    V3sbe.ordenar();
    V3sbe.mostrar();
    }
}
