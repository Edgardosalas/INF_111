package Laboratorios.Lab6.E1;

public class MainPersona {
    public static void main(String[] args){
        Docente D1=new Docente();
        Docente D2=new Docente(3435,"Carmen Huanca",1992,4321,"IA");
        Alumno A1=new Alumno(6453, "Sandro Aro", 2003, 97654, 456874);
        System.out.println("\nDocentes...\n");
        D1.mostrart();
        D1.mostrar();
        D2.mostrar();
        System.out.println("\nAlumnos...\n");
        A1.mostrart();
        A1.mostrar();
        D2.mismaedad(A1);
    }
}
