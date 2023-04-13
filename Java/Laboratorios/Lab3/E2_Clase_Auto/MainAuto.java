package Laboratorios.Lab3.E2_Clase_Auto;

public class MainAuto{
	public static void main(String[] args) {
		Auto A1sbe=new Auto(2001);
		Auto A2sbe=new Auto("RTY-543");
		Auto A3sbe=new Auto("llk-654","Chevrolett",2022,"Vagoneta");
		Auto A4sbe=new Auto(1995,"hpo-987","daihatsu","jeep");
		
		A1sbe.mostrar();
		A2sbe.mostrar();
		A3sbe.mostrar();
		A4sbe.mostrar();
		
		System.out.println("La marca es:"+A2sbe.obtm());
		A2sbe.ponm("Toyota");
		A2sbe.mostrar();
		
		A1sbe.mismoaño(A3sbe);
	}
}
