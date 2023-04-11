package Laboratorios.Lab3.E1_Clase_Numero;
public class MainNumero{
	public static void main(String[] args) {
		Numero n=new Numero();
		n.leer();
		n.sumardig();
		System.out.println("may"+n.MayDig());
		System.out.println("men"+n.MenDig());
		n.EliDigCen();
	}
}
