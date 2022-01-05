package while_do;
import java.util.Scanner;
public class Expoente {
 public static void main(String[] args) {
	Scanner digite = new Scanner (System.in);
	int i,base;
	int resultado=1;
	
	
	System.out.println("Digite um número");
     base = digite.nextInt();
     System.out.println("Digite um expoente");
     i = digite.nextInt();
    
    do {
	     resultado *= base;
	     i--;
		} while (i != 0 ); digite.close();
	     System.out.println("O resultado é: "+ resultado);
	 }
}
