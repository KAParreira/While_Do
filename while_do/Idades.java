package while_do;
  import java.util.Scanner;
public class Idades {
  public static void main(String[] args) {
	
	 Scanner leia = new Scanner(System.in);
	 
	  int i=1, idade, menor=0, maior=0;
	 
	  while (i <=10) {	  
	  
	    System.out.println("Digite a idade");
	    idade = leia.nextInt();
		
		 if (idade < 18) {		 
			 menor = menor + 1;		
		 } 
		 else {
			 maior = maior + 1;	
	     }i++;     
	  }	 leia.close();	      
	  
	  System.out.println("O numero de alunos maiores é "+ maior);
	  System.out.println("O numero de alunos menores é "+ menor);
   } 
}
