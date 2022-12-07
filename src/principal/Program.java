package principal;

import java.util.Scanner;
import service.PrintService;


public class Program {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.println("Quantos valores deseja adicionar? ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer first = ps.first();
        System.out.println("\n1º : " + first);


    }

}