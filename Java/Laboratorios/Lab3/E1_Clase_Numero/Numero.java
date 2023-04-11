package Laboratorios.Lab3.E1_Clase_Numero;
import java.util.Scanner;
public class Numero {
	private
		int num;
	public
		void leer()
		{Scanner sc=new Scanner(System.in);
		 System.out.println("num:");
		 num=sc.nextInt();
		}
		void mostrar()
		{System.out.println(" "+num);
		}
		void sumardig()
		{int d, s=0, n=num;
		 while(n!=0)
		 {d=n%10;
		  n=n/10;
		  s=s+d;
		 }
		 System.out.println("suma dig="+s);
		}
		int MayDig()
		{int d, may=0, n=num;
		 while(n!=0)
		 {d=n%10;
		  n=n/10;
		  if(d>may) {may=d;}
		 }
		 return may;
		}
		int MenDig()
		{int d, men=9, n=num;
			while(n!=0)
			{d=n%10;
			 n=n/10;
			 if(d<men) {men=d;}
			}
			return men;
		}
		void EliDigCen()
		{int a,b,c,n,cd,d, k=0, p=0;
		 n=num;
		 cd=(int)Math.log10(n)+1;
		 if(cd%2==0) {p=(cd/2)-1; k=2;}
		 else {p=(cd/2); k=1;}
		 b=n%(int)Math.pow(10,p);
		 n=n/(int)Math.pow(10,p);
		 a=n/(int)Math.pow(10,k);
		 c=a*(int)Math.pow(10,p)+b;
		 System.out.println("Sin centro="+c);
		}
}