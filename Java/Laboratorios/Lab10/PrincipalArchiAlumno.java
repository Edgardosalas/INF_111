import java.io.IOException;
import java.util.Scanner;
public class PrincipalArchiAlumno {
	 public static void main(String[] args)
	 {
	  int opsbe, numsbe;
	  ArchiAlumno AA = new ArchiAlumno("Alumno2.dat");
	  Alumno A = new Alumno();
	  try
	  {   do
	   {
	    System.out.println("\n \t\tMENU ALUMNO ");
	    System.out.println(" 1: ADICIONAR ALUMNO ");
	    System.out.println(" 2: MOSTRAR ALUMNOS ");
	    System.out.println(" 3: CONSULTA SEGUN COD ");
	    System.out.println(" 4: CONSULTA SOLO MUJERES ");
	    System.out.println(" 5: ELIMINAR UN ALUMNO ");
	    System.out.println(" 6: Edad de los ALUMNOS ");
	    System.out.println(" 7: CONSULTA SOLO VARONES ");
	    System.out.println(" 8: PROMEDIO ");
	    System.out.println(" 9: ORDEN");
	    System.out.println(" 10: SALIR ");
	    System.out.println(" Intro Opcion ");
	    opsbe = Leer.datoInt();
	    
	    switch(opsbe)
	    {
	     case 1: System.out.println("En Adicionar ");
	       A.leer();
	       AA.adicionar(A.obtcoda(), A.obtape(), A.obtnom(), A.obtedad(), A.obtsexo());
	       break;
	     case 2: 
	       AA.mostrar();
	       break;
	     case 3: System.out.println("Intro cod a buscar ");
	       numsbe=Leer.datoInt();
	       AA.buscarcod(numsbe);
	       break;
	     case 4: AA.consulmuj(0);
	       break;
	     case 5: System.out.println("Intro cod a eliminar ");
	       numsbe=Leer.datoInt();
	       AA.eliminar(numsbe);
	       break;
	     case 6: System.out.println("Intro cod de alumno");
	       numsbe=Leer.datoInt();	
	       AA.mostraredad(numsbe);
	       break;
	     case 7: AA.consulvar(1);
	       break;
	     case 8:
	       AA.promedio();
	       break;
	     case 9:
	       AA.ordenar();
	       break;
	    }
	   }while(opsbe<=9);
	   System.out.println(" CHAUUUU... ");
	  }
	  catch(IOException e){}
	 }
}
