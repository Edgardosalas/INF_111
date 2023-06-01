package Laboratorios.Lab6.E1;

public class MainPersona {
    public static void main(String[] args){
        Docente D1sbe=new Docente();
        Docente D2sbe=new Docente(3435,"Carmen Huanca",1992,4321,"IA");
        Alumno A1sbe=new Alumno(6453, "Sandro Aro", 2003, 97654, 456874);
        System.out.println("\nDocentes...\n");
        D1sbe.mostrart();
        D1sbe.mostrar();
        D2sbe.mostrar();
        System.out.println("\nAlumnos...\n");
        A1sbe.mostrart();
        A1sbe.mostrar();
        D2sbe.mismaedad(A1sbe);
    }
}
