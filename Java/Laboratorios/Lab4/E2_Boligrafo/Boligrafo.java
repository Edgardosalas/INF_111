package Laboratorios.Lab4.E2_Boligrafo;
import java.util.Scanner;
public class Boligrafo {
	private
	int codbsbe;
	String marcasbe;
	String colorsbe;
	public Boligrafo()
	{	codbsbe=123;
		marcasbe="pylot";
		colorsbe="azul";
	}
	Boligrafo(int asbe, String bsbe, String csbe)
	{	codbsbe=asbe;
		marcasbe=bsbe;
		colorsbe=csbe;
	}
	Boligrafo(int asbe, String bsbe)
	{	codbsbe=asbe;
		marcasbe=bsbe;
		colorsbe="rojo";
	}
	Boligrafo(int asbe)
	{	codbsbe=asbe;
		marcasbe="Sabonis";
		colorsbe="negro";
	}
	void leer()
	{Scanner sc=new Scanner(System.in);
		System.out.println("Intro cod");
		codbsbe=sc.nextInt();
		System.out.println("Intro marcasbe");
		marcasbe=sc.next();
		System.out.println("Intro colorsbe");
		colorsbe=sc.next();
	}
	void mostrar()
	{System.out.println(" "+codbsbe+" "+marcasbe+" "+colorsbe);
	}
	String obtc()
	{return colorsbe;}
	String obtm()
	{return marcasbe;}
	void comparamarca(Boligrafo X)
	{if (marcasbe.compareTo(X.obtm())==0)
		{System.out.println("Marcas iguales");
		}
		else
		{System.out.println("marcas distntas");}
	}
}

