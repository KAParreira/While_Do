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
		
		System.out.println("O preço de venda do produto é " + valorV + " Reais");
		System.out.println("Deseja continuar a execução? 1- Sim /2- Não ");
	    i = digite.nextInt();
	} while (i==1);
	    digite.close();
   }
}
