package while_do;
import java.util.Scanner;
public class Produto {
   public static void main(String[] args) {
	Scanner digite = new Scanner (System.in);
	
	double preco,lucro,valorV;
	int i=2;
	
	do {
		System.out.println("Digite o valor do produto");
		preco = digite.nextDouble();
		System.out.println("Digite a margem de lucro");
		lucro = digite.nextDouble();
		
		lucro = lucro/100;
		valorV = preco + (preco * lucro);
		
		System.out.println("O pre�o de venda do produto � " + valorV + " Reais");
		System.out.println("Deseja continuar a execu��o? 1- Sim /2- N�o ");
	    i = digite.nextInt();
	} while (i==1);
	    digite.close();
   }
}
