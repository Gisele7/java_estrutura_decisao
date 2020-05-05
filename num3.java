import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		
		
		  Scanner leitor = new Scanner (System.in);
			
			int x;
			
			System.out.println("Digite um número e descubra se ele é positivo, negativo ou neutro:");
			x = leitor.nextInt(); 
			
			if (x > 0) 
		    System.out.println("O número "+x+" é positivo.");
			if (x==0)
			System.out.println("O número "+x+" é neutro.");
			if (x<0)
			System.out.println("O número "+x+" é negativo.");
	}

}
