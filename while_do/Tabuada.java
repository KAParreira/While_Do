package while_do;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i = 1, num, aux = 0;

		System.out.println("Digite um numero inteiro");
		num = leia.nextInt();

		do {
			aux = num * i;
			i++;
			System.out.println(aux);
		} while (i <= 10);
		leia.close();

	}
}
