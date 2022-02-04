import java.util.*;


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int amostra = scanner.nextInt();

        scanner.close();
        
       
            boolean expression = amostra % 2 == 0;

            if(expression){
                if(amostra >= 2 && amostra <= 5){
                    System.out.println("Not Weird");
                } 
                if(amostra >= 6 && amostra <= 20){
                    System.out.println("Weird");
    
                } 
                if(amostra > 20){
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }
         
        
        
       
        
        
        
    }
}