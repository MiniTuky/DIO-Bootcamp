import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
	
		 Scanner ent = new Scanner(System.in);
		
		 System.out.println("Aluno, digite sua 1ª nota");
         Float nota1 = ent.nextFloat();
         
         System.out.println("Aluno, digite sua 2ª nota");
         Float nota2 = ent.nextFloat();
		
         System.out.println("Aluno, digite sua 3ª nota");
         Float nota3 = ent.nextFloat();
		
         System.out.println("Aluno, digite sua 4ª nota");
         Float nota4 = ent.nextFloat();
         
         Float total = (nota1 + nota2 + nota3 + nota4)/4;
         		
		 System.out.println("A Média é : " + total);
		
		
	}

}
