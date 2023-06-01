package Laboratorios.Lab8.E1;

public class Main {
    public static void main(String[] aStrings){
        Cliente C1=new Cliente(12345,"Carmen Hurtado",71515);
        Empresa E1=new Empresa("Inst. America", "Lande 123", C1);
        E1.mostrar();
        E1.leer();
        E1.mostrar();
    }
}
