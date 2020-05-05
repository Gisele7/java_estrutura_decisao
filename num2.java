import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		
		
		 Scanner leitor = new Scanner (System.in);
			
			int x , y ;
			
			
			System.out.println("Digite um número:");
			x=leitor.nextInt();
			System.out.println("Digite outro número:");
			y=leitor.nextInt();
			
			
			
			
			if (x+y>10) 
		    System.out.println("O resultado é igual a "+(x+y)+" que é maior que 10.");
			if (x+y==10)
			System.out.println("O resultado é igual a"+(x+y)+" que é igual á 10");
			if (x+y<10)
			System.out.println("O resultado é igual a "+(x+y)+" que é menor que 10");
			

	}

}
