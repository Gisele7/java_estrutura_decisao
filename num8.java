import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		 
Scanner leitor = new Scanner (System.in);
		
		
		
		String senha;
		String AEDB = "AEDB";
		
		
		System.out.println("Digite a senha para entrar no sistema:");
		senha=leitor.next();
	    
		if (senha.equalsIgnoreCase(AEDB))
		
		System.out.println("Acesso permitido.");
		else 
		System.out.println("Você não possui acesso ao sistema.");
	}

}
