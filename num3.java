import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		
		
		  Scanner leitor = new Scanner (System.in);
			
			int x;
			
			System.out.println("Digite um n�mero e descubra se ele � positivo, negativo ou neutro:");
			x = leitor.nextInt(); 
			
			if (x > 0) 
		    System.out.println("O n�mero "+x+" � positivo.");
			if (x==0)
			System.out.println("O n�mero "+x+" � neutro.");
			if (x<0)
			System.out.println("O n�mero "+x+" � negativo.");
	}

}
