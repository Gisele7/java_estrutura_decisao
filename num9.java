import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		
Scanner leitor = new Scanner(System.in);
		
		double x ;
		
		System.out.println("Digite o pre�o do produto:");
		x=leitor.nextDouble();
		
		if (x<=20)
			System.out.println("Dever� vender tal produto pelo pre�o de "+(x*45/100+x)+"R$.");
		else
			System.out.println("Dever� vender tal produto pelo pre�o de "+(x*30/100+x)+"R$.");

	}

}
