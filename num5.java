import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		
		float x;
		
		System.out.println("Digite um número e descubra se ele é par ou ímpar:");
		x = leitor.nextFloat(); 
		
		if (x%2==0) 
	    System.out.println("O número "+x+" é par.");
		else
		System.out.println("O número "+x+" é ímpar.");	
		
	}

}
