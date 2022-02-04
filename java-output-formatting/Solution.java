import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            int quantidade = 3;
            String[] cursos = new String[quantidade];
            int[] preco = new int[quantidade];

            for(int i = 0; i < quantidade; i++){
                cursos[i] = sc.next();
                preco[i] = sc.nextInt();
            }

            System.out.println("================================");

            for(int i =0; i < quantidade; i++){
                System.out.printf("%-15s", cursos[i]);
                System.out.printf("%03d", preco[i]);
                System.out.printf("%n");
            }

            System.out.println("================================");

            sc.close();

    }
}
