package Laboratorios.Lab3.E1_Clase_Numero;
import java.util.Scanner;
public class Numero {
	private
		int numsbe;
	public
		void leer()
		{Scanner sc=new Scanner(System.in);
		 System.out.println("numsbe:");
		 numsbe=sc.nextInt();
		}
		void mostrar()
		{System.out.println(" "+numsbe);
		}
		void sumardig()
		{int dsbe, ssbe=0, nsbe=numsbe;
		 while(nsbe!=0)
		 {dsbe=nsbe%10;
		  nsbe=nsbe/10;
		  ssbe=ssbe+dsbe;
		 }
		 System.out.println("suma dig="+ssbe);
		}
		int MayDig()
		{int dsbe, maysbe=0, nsbe=numsbe;
		 while(nsbe!=0)
		 {dsbe=nsbe%10;
		  nsbe=nsbe/10;
		  if(dsbe>maysbe) {maysbe=dsbe;}
		 }
		 return maysbe;
		}
		int MenDig()
		{int dsbe, mensbe=9, nsbe=numsbe;
			while(nsbe!=0)
			{dsbe=nsbe%10;
			 nsbe=nsbe/10;
			 if(dsbe<mensbe) {mensbe=dsbe;}
			}
			return mensbe;
		}
		void EliDigCen()
		{int asbe,bsbe,csbe,nsbe,cssbe,dsbe, ksbe=0, psbe=0;
		 nsbe=numsbe;
		 cssbe=(int)Math.log10(nsbe)+1;
		 if(cssbe%2==0) {psbe=(cssbe/2)-1; ksbe=2;}
		 else {psbe=(cssbe/2); ksbe=1;}
		 bsbe=nsbe%(int)Math.pow(10,psbe);
		 nsbe=nsbe/(int)Math.pow(10,psbe);
		 asbe=nsbe/(int)Math.pow(10,ksbe);
		 csbe=asbe*(int)Math.pow(10,psbe)+bsbe;
		 System.out.println("Sin centro="+csbe);
		}
}