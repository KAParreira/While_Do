package while_do;
import java.util.Scanner;
public class Idade {
  public static void main (String [] args) {
	  Scanner leia = new Scanner (System.in);
	  int i= 0, idade, aNasc, aAtual ;
	  
	  while (i <= 6) {
	  System.out.println("Digite o ano de nascimento");
	  aNasc = leia.nextInt();
	  System.out.println("Digite o ano atual");
	  aAtual = leia.nextInt();
	  idade = aAtual - aNasc;
	  System.out.println("Sua idade é " + idade + " anos");
	   if (idade <=18) {
		   System.out.println("Menor de idade");
	   } else {
		   System.out.println("Maior de idade");
	   } i++; leia.close();
	  
 
  
  }
  }
}
