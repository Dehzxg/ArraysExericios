package ExemplosArray;

import java.util.Scanner;

public class ExArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO 3 -  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int A [][] = new int [3][3];
		int cont=0,linha,coluna;
		
		Scanner leia = new Scanner(System.in);
		
		//Preenchimento da Matriz
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEscreva os valores da Matriz: ");
				A [linha][coluna] = leia.nextInt();
			}
		}
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				if(A[linha][coluna]>10)
					cont++;
			}
		}
		System.out.printf("\nQuantidade de números maiores que dez: %d",cont);
	}
	

}
