import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchiAlumno {
	private
	  String nomarch="";
	 public
	  ArchiAlumno()
	  { nomarch="";
	  }
	  ArchiAlumno(String x)
	  { nomarch=x;
	  }
	  void adicionar(int a,String b, String c, int d, int e) throws IOException
	  { 
	   DataOutputStream Archi = null;
	   try
	   {
	    Archi = new DataOutputStream( new FileOutputStream("../"+nomarch,true));
	    Archi.writeInt(a);
	    Archi.writeUTF(b);
	    Archi.writeUTF(c);
	    Archi.writeInt(d);
	    Archi.writeInt(e);
	    Archi.close();
	   }
	   catch(FileNotFoundException fnfe) {System.out.println("error "+fnfe);}
	   catch (IOException ioe) { System.out.println("error 1"+ioe);}
	  }
	  void mostrar() throws IOException
	  { 
	   DataInputStream Archi = null;
	   //int suma=0,cont=0;
	   //double promedio=0; //promedio edad
	   try
	   { //Alumno A = new Alumno();
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATERNO \tNOMBRE \tEDAD \tSEXO");
	    while (true)
	    {   Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     A.mostrar();
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void buscarcod(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATERNO \tNOMBRE \tEDAD \tSEXO");
	    while (true)
	    { Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if (A.obtcoda()==x)
	     {
	      A.mostrar();
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void consulmuj(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATERNO \tNOMBRE \tEDAD \tSEXO");
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if (A.obtsexo()==x)
	     {
	      A.mostrar();
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void eliminar(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   DataOutputStream ArchiTemp = null;
	   try
	   { ArchiTemp = new DataOutputStream( new FileOutputStream("../temporal.dat",true ) );
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if (A.obtcoda()!=x)
	     { 
	      ArchiTemp.writeInt(A.obtcoda());
	      ArchiTemp.writeUTF(A.obtape());
	      ArchiTemp.writeUTF(A.obtnom());
	      ArchiTemp.writeInt(A.obtedad());
	      ArchiTemp.writeInt(A.obtsexo());
	     }
	     
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   try
	   {
	    Archi.close();
	    ArchiTemp.close();
	    File file1 = new File("../"+nomarch);
	    File file2 = new File("../temporal.dat");
	    if (file1.exists()){  file1.delete();}
	    file2.renameTo(file1);
	   }
	   catch(IOException var){ System.out.println(" error ");}
	  }
	  void modificar(int x) throws IOException
	  {}
	  void varonmayor() throws IOException
	  {}
	  void mostraredad(int num) throws IOException
	  { 
	   DataInputStream Archi = null;
	   //int suma=0,cont=0;
	   //double promedio=0; //promedio edad
	   try
	   { //Alumno A = new Alumno();
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    while (true)
	    {   Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if(A.obtcoda()==num){
	    	 System.out.println(A.obtnom()+" "+A.obtedad());
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void consulvar(int x) throws IOException
	  { 
	   DataInputStream Archi = null;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println("COD\t PATERNO \tNOMBRE \tEDAD \tSEXO");
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if (A.obtsexo()==x)
	     {
	      A.mostrar();
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	  }
	  void promedio() throws IOException
	  { 
	   DataInputStream Archi = null;
	   double var,muj;
	   int c1,c2;
	   var=muj=c1=c2=0;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    System.out.println();
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     if(A.obtsexo()==1){
	    	 var+=A.obtedad();
	    	 c1++;
	     }
	     else{
	    	 muj+=A.obtedad();
	    	 c2++;
	     }
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   var=var/c1;
	   muj=muj/c2;
	   System.out.println("Varones = "+var);
	   System.out.println("Mujeres = "+muj);
	   Archi.close();
	  }
	  void ordenar() throws IOException
	  { 
	   DataInputStream Archi = null;
	   int cont;
	   cont=0;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     cont++;
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	   //==========================================
	   Archi = null;
	   Alumno [] vec=new Alumno[cont+1];
	   int i=1;
	   try
	   {
	    Archi = new DataInputStream( new FileInputStream("../"+nomarch) );
	    while (true)
	    {
	     Alumno A = new Alumno();
	     A.ponercoda(Archi.readInt());
	     A.ponerape(Archi.readUTF());
	     A.ponernom(Archi.readUTF());
	     A.poneredad(Archi.readInt());
	     A.ponersexo(Archi.readInt());
	     vec[i]=A;
	     i++;
	    }
	   }
	   catch(FileNotFoundException fnfe) {}
	   catch (IOException ioe) {}
	   Archi.close();
	   
	   for(int j=1;j<=cont;j++){
		   for(int k=j+1;k<=cont;k++){
			   if(vec[j].obtape().compareTo(vec[k].obtape())>0){
				   Alumno x=vec[j];
				   vec[j]=vec[k];
				   vec[k]=x;
			   }
		   }
	   }
	   System.out.println("COD\t PATERNO \tNOMBRE \tEDAD \tSEXO");
	   for (int h=1;h<=cont;h++){
		   vec[h].mostrar();
	   }
	   
	  }
	  
}
