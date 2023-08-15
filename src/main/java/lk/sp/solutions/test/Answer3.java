package lk.sp.solutions.test;

import java.util.Arrays;

public class Answer3 {
    public static void main(String[] args) {
        int first = 0;
        int second =1;
        int fib=0;
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            //System.out.println(fibonacci[i]);
        }
        System.out.println(Arrays.toString(fibonacci));
    }
}
