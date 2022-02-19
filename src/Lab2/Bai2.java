package Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap a:");
        a = scanner.nextDouble();
        System.out.printf("Nhap b:");
        b = scanner.nextDouble();
        System.out.printf("Nhap c:");
        c = scanner.nextDouble();

        if(a == 0) bac1(b,c);
        else {
            Double delta = Math.pow(b,2) - 4*a*c;
            if(delta < 0) System.out.printf("Phuong trinh vo nghiem");
            else if(delta == 0) System.out.printf("Phuong trinh co nghiem kep x: %f", -b/(2*a));
            else {
                System.out.printf("Phuong trinh co nghiem x1: %f", (-b + Math.sqrt(delta))/(2*a));
                System.out.printf("Phuong trinh co nghiem x2: %f", (-b - Math.sqrt(delta))/(2*a));
            }
        }
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
