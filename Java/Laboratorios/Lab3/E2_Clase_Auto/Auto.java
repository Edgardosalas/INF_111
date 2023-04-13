package Laboratorios.Lab3.E2_Clase_Auto;
import java.util.Scanner;
public class Auto {
		private
			String placasbe;
			String marcasbe;
			int añosbe;
			String tiposbe;
		public
			Auto()
			{	placasbe="USB-123";
				marcasbe="Toyota";
				añosbe=2015;
				tiposbe="Vagoneta";
			}
			Auto(String asbe, String bsbe, int csbe, String dsbe)
			{	placasbe=asbe;
				marcasbe=bsbe;
				añosbe=csbe;
				tiposbe=dsbe;
			}
			Auto(int asbe, String bsbe, String csbe, String dsbe)
			{	placasbe=bsbe;
				marcasbe=csbe;
				añosbe=asbe;
				tiposbe=dsbe;
			}
			Auto(String asbe, int bsbe, String csbe, String dsbe)
			{	placasbe=asbe;
				marcasbe=csbe;
				añosbe=bsbe;
				tiposbe=dsbe;
			}
			Auto(String asbe, String bsbe, int csbe)
			{	placasbe=asbe;
				marcasbe=bsbe;
				añosbe=csbe;
				tiposbe="Automovil";
			}
			Auto(String asbe, String bsbe)
			{	placasbe=asbe;
				marcasbe=bsbe;
				añosbe=2021;
				tiposbe="Camioneta";
			}
			Auto(String asbe)
			{	placasbe=asbe;
				marcasbe="VW";
				añosbe=2021;
				tiposbe="Camioneta";
			}
			Auto(int asbe)
			{	placasbe="ABC-321";
				marcasbe="Suzuki";
				añosbe=asbe;
				tiposbe="Jeep";
			}
			Auto(String asbe, int bsbe)
			{	placasbe=asbe;
				marcasbe="Nissan";
				añosbe=bsbe;
				tiposbe="Camioneta";
			}
			String obtp()
			{return(placasbe);}
			String obtm()
			{return(marcasbe);}
			int obta()
			{return(añosbe);}
			String obtt()
			{return(tiposbe);}
			void ponm(String asbe)
			{this.marcasbe=asbe;}
			
			void mismoaño(Auto Asbe)
			{	if(añosbe==Asbe.obta()) {
				System.out.println("Tienen el mismo añosbe");
				}
				else {
					System.out.println("Tienen distinto añosbe");
					}
			}
			void leer()
			{Scanner sc=new Scanner(System.in);
			 System.out.println("Intro Placa");
			 placasbe=sc.next();
			 System.out.println("Intro Marca");
			 marcasbe=sc.next();
			 System.out.println("Intro añosbe");
			 añosbe=sc.nextInt();
			 System.out.println("Intro tiposbe");
			 tiposbe=sc.next();
			}
			void mostrar()
			{System.out.println(" "+placasbe+" "+marcasbe+" "+añosbe+" "+tiposbe);
			}
		}