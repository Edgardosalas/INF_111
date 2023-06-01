public class Alumno {
	private
	  int coda;
	  String ape="";
	  String nom="";
	  int edad;
	  int sexo;
	 public
	  Alumno()
	  { coda = 10;
	   ape  = "Torrez";
	   nom  = "Cecilia";
	   edad = 15;
	   sexo = 0;
	  }
	  Alumno(int a,String b, String c, int d, int e)
	  { coda = a;
	   ape  = b;
	   nom  = c;
	   edad = d;
	   sexo = e;
	  }
	  void leer()
	  {System.out.println(" Intro el codigo: ");
	   coda = Leer.datoInt();
	   System.out.println(" Intro Apellido: ");
	   ape = Leer.dato();
	   System.out.println(" Intro Nombre: ");
	   nom = Leer.dato();
	   System.out.println(" Intro edad: ");
	   edad= Leer.datoInt();
	   System.out.println(" Intro Sexo (1: Varon  0: Mujer)" );
	   sexo = Leer.datoInt();
	  }
	  void mostrar()
	  {
	   System.out.print(""+coda);
	   System.out.print("\t"+ape);
	   System.out.print("\t\t"+nom);
	   System.out.print("\t"+edad);
	   System.out.print("\t"+sexo+"\n");
	  }
	  int obtcoda()
	  {  return(coda);}
	  String obtape()
	  {  return(ape);}
	  String obtnom()
	  {  return(nom);}
	  int obtedad()
	  {  return(edad);}
	  int obtsexo()
	  {  return(sexo);}
	  void ponercoda(int a)
	  { coda = a; }
	  void ponerape(String a)
	  { ape = a; }
	  void ponernom(String a)
	  { nom = a; }
	  void poneredad(int a)
	  { edad = a; }
	  void ponersexo(int a)
	  { sexo = a; }
	  void ponertodo(int a, String b, String c, int d, int e)
	  {
	   coda = a;
	   ape  = b;
	   nom  = c;
	   edad = d;
	   sexo = e;
	  }

}

