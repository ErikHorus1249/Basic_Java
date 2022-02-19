package Lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Double a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.printf("The tich cua hinh lap phuong canh %f: %f", a, Math.pow(a, 3));
    }
}
