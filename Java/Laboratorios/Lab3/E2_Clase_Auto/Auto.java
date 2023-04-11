package Laboratorios.Lab3.E2_Clase_Auto;
import java.util.Scanner;
public class Auto {
		private
			String placa;
			String marca;
			int año;
			String tipo;
		public
			Auto()
			{	placa="USB-123";
				marca="Toyota";
				año=2015;
				tipo="Vagoneta";
			}
			Auto(String a, String b, int c, String d)
			{	placa=a;
				marca=b;
				año=c;
				tipo=d;
			}
			Auto(int a, String b, String c, String d)
			{	placa=b;
				marca=c;
				año=a;
				tipo=d;
			}
			Auto(String a, int b, String c, String d)
			{	placa=a;
				marca=c;
				año=b;
				tipo=d;
			}
			Auto(String a, String b, int c)
			{	placa=a;
				marca=b;
				año=c;
				tipo="Automovil";
			}
			Auto(String a, String b)
			{	placa=a;
				marca=b;
				año=2021;
				tipo="Camioneta";
			}
			Auto(String a)
			{	placa=a;
				marca="VW";
				año=2021;
				tipo="Camioneta";
			}
			Auto(int a)
			{	placa="ABC-321";
				marca="Suzuki";
				año=a;
				tipo="Jeep";
			}
			Auto(String a, int b)
			{	placa=a;
				marca="Nissan";
				año=b;
				tipo="Camioneta";
			}
			String obtp()
			{return(placa);}
			String obtm()
			{return(marca);}
			int obta()
			{return(año);}
			String obtt()
			{return(tipo);}
			void ponm(String a)
			{this.marca=a;}
			
			void mismoaño(Auto A)
			{	if(año==A.obta()) {
				System.out.println("Tienen el mismo año");
				}
				else {
					System.out.println("Tienen distinto año");
					}
			}
			void leer()
			{Scanner sc=new Scanner(System.in);
			 System.out.println("Intro Placa");
			 placa=sc.next();
			 System.out.println("Intro Marca");
			 marca=sc.next();
			 System.out.println("Intro año");
			 año=sc.nextInt();
			 System.out.println("Intro tipo");
			 tipo=sc.next();
			}
			void mostrar()
			{System.out.println(" "+placa+" "+marca+" "+año+" "+tipo);
			}
		}