package lk.sp.solutions.test;

public class Answer1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{10, 50, 6, 55, 4, 8, 32};
        int sum=0;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        sum=0;
        int i=0;
        while (i<numbers.length) {
            sum += numbers[i];
            i++;
        }
        System.out.println(sum);
    }
}
