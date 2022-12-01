import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 3, 6, 3, 5, 7,10, 10};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num!=max1) {
                max2 = num;
            }
        }
        System.out.println(max2);
    }
}