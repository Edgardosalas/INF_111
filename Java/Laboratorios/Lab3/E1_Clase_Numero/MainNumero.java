package Laboratorios.Lab3.E1_Clase_Numero;
public class MainNumero{
	public static void main(String[] args) {
		Numero nsbe=new Numero();
		nsbe.leer();
		nsbe.sumardig();
		System.out.println("may"+nsbe.MayDig());
		System.out.println("men"+nsbe.MenDig());
		nsbe.EliDigCen();
	}
}
