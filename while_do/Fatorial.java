package while_do;
import java.util.Scanner;
public class Fatorial {
   public static void main(String[] args) {
	
	Scanner digite = new Scanner (System.in);
     int numero, fat=1;
	 
       System.out.println("Digite um número inteiro");
       numero = digite.nextInt();
      int i = 1;
       while (i <= numero){
    	   fat = fat *i;
         i++;
       }digite.close();
      System.out.println("fatorial é: " + fat); 
   }
}
