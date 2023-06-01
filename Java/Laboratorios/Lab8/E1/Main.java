package Laboratorios.Lab8.E1;

public class Main {
    public static void main(String[] aStrings){
        Cliente C1sbe=new Cliente(12345,"Carmen Hurtado",71515);
        Empresa E1sbe=new Empresa("Inst. America", "Lande 123", C1sbe);
        E1sbe.mostrar();
        E1sbe.leer();
        E1sbe.mostrar();
    }
}
