import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
Scanner leitor = new Scanner (System.in);
		
		String nom1, nom2;
		int id1, id2;
		
		System.out.println("Descubra quem é mais velho.");
		
		System.out.println("Digite seu nome:");
		nom1 = leitor.nextLine();
		
		System.out.println("E agora digite sua idade:");
		id1=leitor.nextInt();
		
		System.out.println("Digite seu nome:");
		nom2 = leitor.next();
		
		System.out.println("E agora digite sua idade:");
		id2=leitor.nextInt();
		
		if (id1>id2)
		System.out.println("A pessoa mais velha é "+nom1+" com "+id1+" anos de idade.");
		if (id1<id2)
			System.out.println("A pessoa mais velha é  "+nom2+" com "+id2+" anos de idade.");

	}

}
