public class Alumno {
	private
	  int codasbe;
	  String apesbe="";
	  String nomsbe="";
	  int edadsbe;
	  int sexosbe;
	 public
	  Alumno()
	  { codasbe = 10;
	   apesbe  = "Torrez";
	   nomsbe  = "Cecilia";
	   edadsbe = 15;
	   sexosbe = 0;
	  }
	  Alumno(int a,String b, String c, int d, int e)
	  { codasbe = a;
	   apesbe  = b;
	   nomsbe  = c;
	   edadsbe = d;
	   sexosbe = e;
	  }
	  void leer()
	  {System.out.println(" Intro el codigo: ");
	   codasbe = Leer.datoInt();
	   System.out.println(" Intro apellido: ");
	   apesbe = Leer.dato();
	   System.out.println(" Intro nombre: ");
	   nomsbe = Leer.dato();
	   System.out.println(" Intro edad: ");
	   edadsbe= Leer.datoInt();
	   System.out.println(" Intro Sexo (1: Varon  0: Mujer)" );
	   sexosbe = Leer.datoInt();
	  }
	  void mostrar()
	  {
	   System.out.print(""+codasbe);
	   System.out.print("\t"+apesbe);
	   System.out.print("\t\t"+nomsbe);
	   System.out.print("\t"+edadsbe);
	   System.out.print("\t"+sexosbe+"\n");
	  }
	  int obtcoda()
	  {  return(codasbe);}
	  String obtape()
	  {  return(apesbe);}
	  String obtnom()
	  {  return(nomsbe);}
	  int obtedad()
	  {  return(edadsbe);}
	  int obtsexo()
	  {  return(sexosbe);}
	  void ponercoda(int a)
	  { codasbe = a; }
	  void ponerape(String a)
	  { apesbe = a; }
	  void ponernom(String a)
	  { nomsbe = a; }
	  void poneredad(int a)
	  { edadsbe = a; }
	  void ponersexo(int a)
	  { sexosbe = a; }
	  void ponertodo(int a, String b, String c, int d, int e)
	  {
	   codasbe = a;
	   apesbe  = b;
	   nomsbe  = c;
	   edadsbe = d;
	   sexosbe = e;
	  }

}

