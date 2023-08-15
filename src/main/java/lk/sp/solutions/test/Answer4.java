package lk.sp.solutions.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Answer4 {
    public static void main(String[] args) {

        int[] nums = new int[]{50,2,1,9};
        int[] elements = new int[0];
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            char[] chars = s.toCharArray();
            //System.out.println(chars);
            for (char aChar : chars) {
                //System.out.println(aChar);
                int numChar = aChar - '0';
               // System.out.println(numChar);
                int[] temp = new int[elements.length + 1];
                temp[temp.length-1]=numChar;
                for (int j = 0; j < elements.length; j++) {
                    temp[j]=elements[j];
                }
                elements=temp;
            }
        }

        Arrays.sort(elements);
        int[] temp = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            temp[elements.length - i - 1] = elements[i];
        }
        //System.out.println(Arrays.toString(temp));

        StringBuilder stringBuilder = new StringBuilder();

        for (int i : temp) {
            stringBuilder.append(i);
        }
        int maxNum = Integer.parseInt(stringBuilder.toString());
        System.out.println(maxNum);

    }

}
