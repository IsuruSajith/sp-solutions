package lk.sp.solutions.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer2 {
    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "c"};
        int[] numbers = new int[]{1, 2, 3};
        List combined = new ArrayList();

        int max=strings.length+numbers.length;
       /* if (strings.length >= numbers.length) {

            max = strings.length;
        } else {
            max = numbers.length;
        }*/
        int count=0;
        int count2=0;
        for (int i = 0; i < max; i++) {
            if (count2<strings.length) {
                combined.add(strings[i]);
                count2++;
            }
            if (count<numbers.length) {
                combined.add(numbers[i]);
                count++;
            }

        }

        System.out.println(combined);
    }
}
