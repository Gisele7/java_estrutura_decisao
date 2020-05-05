import java.util.Scanner;

public class num10 {

	public static void main(String[] args) {
		
		
Scanner leitor = new Scanner (System.in);
		
		String sexo ;
		String Feminino = ("Feminino");
		float altura;
		
		System.out.println("Descubra seu peso ideal");
		System.out.println("Digite sua altura(cm):");
		altura=leitor.nextFloat();
		
		System.out.println("Seu sexo é masculino ou feminino:");
		sexo=leitor.next();
		
		if (sexo.equalsIgnoreCase(Feminino))
		
		System.out.println("Seu peso ideal é:"+((72.7*altura/100)-58));
		
		else
			
		System.out.println("Seu peso ideal é:"+((62.1*altura/100)-44.7));
		

	}

}
