package Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Double a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap vao a:");
        a = scanner.nextDouble();
        System.out.printf("Nhap vao b:");
        b = scanner.nextDouble();

        bac1(a,b);
    }

    public static void bac1(Double a, Double b){
        if(a==0){
            if(b==0){
                System.out.printf("Phuong trinh vo so nghiem");
            }else {
                System.out.printf("Phuong trinh vo nghiem");
            }
        }else {
            System.out.printf("Phuong trinh co mot nghiem %f", -b/a);
        }
    }
}
