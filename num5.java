import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		
		
		float x;
		
		System.out.println("Digite um n�mero e descubra se ele � par ou �mpar:");
		x = leitor.nextFloat(); 
		
		if (x%2==0) 
	    System.out.println("O n�mero "+x+" � par.");
		else
		System.out.println("O n�mero "+x+" � �mpar.");	
		
	}

}
