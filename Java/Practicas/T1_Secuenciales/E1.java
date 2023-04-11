package Practicas.T1_Secuenciales;
import java.util.Scanner;
public class E1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double dolares;
			dolares = sc.nextDouble();
			dolares = dolares*0.83;
			System.out.println(Math.round(dolares*100.0)/100.0);
		}
	}

}