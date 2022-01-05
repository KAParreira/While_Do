package while_do;
import java.util.Scanner;
public class i {

    public static void main(String[] args){
       Scanner ent = new Scanner(System.in);
       int base, pot;
       int res = 1;
              
        do{
            System.out.println("Digite a base");
            base = ent.nextInt();
            
                System.out.println("Digite a potencia");
                pot = ent.nextInt();
        
                do{
                    res = res * base;
                    pot--;    
                }while(pot > 0);
        
                System.out.println(res);
                res = 1;
            
        }while((base != 0));ent.close();
        System.out.println("Você digitou base = 0. O programa foi finalizado.");
    }
}
