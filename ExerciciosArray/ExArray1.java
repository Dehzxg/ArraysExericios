package ExemplosArray;

public class ExArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,0,5,-2,-5,7};
		int soma=0,x;
		
		soma = A[0] + A[1] + A[5];
		A[3] = 100;
		
		System.out.printf("\nO valor da soma é: "+soma);
		
		for(x=0;x<6;x++) {
			
			System.out.printf("\nValor do vetor A "+A[x]);	
}

		
	}

}
 