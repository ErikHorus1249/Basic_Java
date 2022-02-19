package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.printf("1. Sort");
        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[i]);

        int min = arr[0];
        for(int num : arr) min = Math.min(min, num);
        System.out.printf("2. Min: %d", min);

        int sum = 0, count = 0;
        for(int num : arr) if (num % 3 == 0){
            sum += num;
            count += 1;
        }
        System.out.printf("3. Trung binh chia het cho 3: %d", sum/count);
    }
}
