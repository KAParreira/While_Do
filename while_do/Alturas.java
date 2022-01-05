
package while_do;

public class Alturas {

	public static void main(String[] args) {
		
		double pedro=1.45, joao=1.34;
		int i=0;
		
		 while (joao < pedro) {
		 
		  joao = joao + 0.025;
		  pedro = pedro + 0.020; 
		   
		  i++; 
		  
		} System.out.println("Em " + i + " anos.");
    } 	
}
