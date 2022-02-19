package Lab3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= 9; j++)
                System.out.printf("%d * %d = %d \n", j,i,i*j);
            System.out.printf("\n\n");
        }
    }
}
