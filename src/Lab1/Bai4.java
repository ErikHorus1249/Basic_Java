package Lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vap a:");
        a = scanner.nextDouble();
        System.out.printf("Nhap vap b:");
        b = scanner.nextDouble();
        System.out.printf("Nhap vap c:");
        c = scanner.nextDouble();

        System.out.printf("Delta: %f", Math.pow(b,2)-4*a*c);
        System.out.printf("Can cua Delta: %f", Math.sqrt(Math.pow(b,2)-4*a*c));

    }
}
