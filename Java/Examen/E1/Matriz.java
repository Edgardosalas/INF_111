package Examen.E1;
import java.util.Scanner;
public class Matriz {
    Scanner sc=new Scanner(System.in);
	private 
		int [][] mat=new int[100][100];
		int N;
	public 
		Matriz() {
			N=5;
		}
		Matriz(int a){
			N=a;
		}
        void leer(){
            int i, j, n;
            System.out.println("Intro n");
            for(i=1;i<=5;i++)
            {   for(j=1;j<=5;j++)
                {
                    n=sc.nextInt();
                    mat[i][j]=n;
                }

            }
        }
		void mostrar(){
			for(int i = 1 ; i<=N ; i++) {
				for(int j = 1 ; j<=N ; j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
		void MatrizL() {
			int fila,columna,sw,lim1,lim2,cont;
			fila=N-1;
			cont=2;
			columna=N;
			sw=0;
			lim1=N-2;
			lim2=N+1;
			mat[N][N]=1;
			for(int i = 2 ; i<= N*N ; i++) {
				if(sw==0) {
					mat[fila][columna]=i;
					columna=columna-1;
					if(columna==lim1) {
						columna=columna+1;
						lim1=lim1-1;
						fila=fila+1;
						sw=1;
					}
				}
				else {
					mat[fila][columna]=i;
					fila=fila+1;
					if(fila==lim2) {
						fila=fila-cont-1;
						columna=N;
						cont=cont+1;
						sw=0;
					}
				}
				
			}
		}
}
