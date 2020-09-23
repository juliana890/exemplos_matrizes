package application;

import java.util.Scanner;

public class Program_Matriz_Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String saida = "";
		
		System.out.print("Digite o número de linhas: ");
		int m = sc.nextInt();
		
		System.out.print("Digite o número de colunas: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.print("Digite o valor X: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				
				if(mat[i][j] == x){
					int cPos = i;
					int lPos = j;
					saida += "\nPosition: " + cPos + "," + lPos;
					if(j > 0) {
						int left = mat[i][j-1];
						saida += "\nLeft: " + left;
					}
					if(j < mat[i].length - 1){
						int right = mat[i][j+1];
						saida += "\nRight: " + right;
					}
					
					if(i < mat.length - 1){
						int down = mat[i+1][j];
						saida += "\nDown: " + down;
					}
					
					if(i > 0){
						int up = mat[i-1][j];
						saida += "\nUp: " + up;
					}
					
				}
				
			}
		}
		
		System.out.println(saida);
		
		sc.close();

	}

}
