import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
	
		 Scanner ent = new Scanner(System.in);
		
		 System.out.println("Aluno, digite sua 1� nota");
         Float nota1 = ent.nextFloat();
         
         System.out.println("Aluno, digite sua 2� nota");
         Float nota2 = ent.nextFloat();
		
         System.out.println("Aluno, digite sua 3� nota");
         Float nota3 = ent.nextFloat();
		
         System.out.println("Aluno, digite sua 4� nota");
         Float nota4 = ent.nextFloat();
         
         Float total = (nota1 + nota2 + nota3 + nota4)/4;
         		
		 System.out.println("A M�dia � : " + total);
		
		
	}

}
