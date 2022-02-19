package Lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int elec;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap vao so dien can tinh:");
        elec = scanner.nextInt();

        if(elec < 50) System.out.printf("So tien dien: %d", elec*1000);
        else System.out.printf("So tien dien: %d", 50*1000 + (elec - 50)*1200);
    }
}
