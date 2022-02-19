package Lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao Ho va Ten:");
        String hoTen = scanner.nextLine();

        System.out.printf("Nhap vao diem trung binh:");
        Double diemTB = scanner.nextDouble();

        System.out.printf("%s %f điểm", hoTen, diemTB);
    }
}
