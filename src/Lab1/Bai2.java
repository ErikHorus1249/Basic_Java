package Lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double w, h;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap chieu dai:");
        w = scanner.nextDouble();
        System.out.printf("Nhap chieu rong:");
        h = scanner.nextDouble();

        System.out.printf("Chu vi cua hinh chu nhat: %f ", (w+h)*2);
        System.out.printf("Dien tich cua hinh chu nhat: %f ", w*h);
        System.out.printf("Canh co do dai nho nhat: %f ", Math.min(w, h));
    }
}
