package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da matriz ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		preencheMatriz(mat);
		imprimeMatriz(mat);
		System.out.println();
		diagonalPrincipal(mat);
		numerosNegativos(mat);
		
		sc.close();
	}
	public static void preencheMatriz(int[][] mat) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < mat.length; i++) 
			for(int j = 0; j < mat[i].length; j++) 
				mat[i][j] = sc.nextInt() ;
		sc.close();
	}
	public static void imprimeMatriz(int[][] mat) {
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length; j++) 
				System.out.printf("%3d ", mat[i][j]);
		}
	}
	public static void diagonalPrincipal(int[][] mat) {
		System.out.println("\nDiagonal principal");
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length; j++) {
				if(i == j)
					System.out.printf("%3d ", mat[i][j]);
				else
					System.out.printf("   ");
			}
		}
	}
	public static void numerosNegativos(int[][] mat) {
		System.out.println("\nNumeros negativos");
		for(int i = 0; i < mat.length; i++) {
			System.out.println();
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0)
					System.out.printf("%d ", mat[i][j]);

			}
		}
	}
	
	//fim do programa
}
	//fim da classe principal