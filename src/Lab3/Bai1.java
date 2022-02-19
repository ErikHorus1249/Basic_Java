package Lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so:");
        number = scanner.nextInt();

        if(isPrimeNumber(number)) System.out.printf("%d la so nguyen", number);
        else System.out.printf("%d khong phai la so nguyen", number);

    }

    public static Boolean isPrimeNumber(int number){
        if(number < 2) return  false;
        for(int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return  false;
        return  true;
    }
}
