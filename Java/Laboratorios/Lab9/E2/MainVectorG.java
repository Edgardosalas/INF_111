package Laboratorios.Lab9.E2;

public class MainVectorG {
    public static void main(String[] aStrings){
        VectorG <Integer> V1= new VectorG<Integer>(new Integer(5), new Integer(4), new Integer(8), new Integer(3), new Integer(7));
    V1.mostrar();
    V1.invertir();
    V1.mostrar();
    V1.invertir();
    V1.mostrar();
    String a="limon", b="manzana", c="uva", d="platano", e="cereza";
    VectorG <String> V2=new VectorG<String>(a, b, c, d, e);
    V2.mostrar();
    V2.invertir();
    V2.mostrar();
    V2.ordenar();
    V2.mostrar();
    Double d1=0.25, d2=3.1415, d3=1.5, d4=2.15, d5=1.75;
    VectorG<Double> V3=new VectorG<Double>(d1, d2, d3, d4, d5);
    V3.mostrar();
    V3.invertir();
    V3.mostrar();
    V3.ordenar();
    V3.mostrar();
    }
}
