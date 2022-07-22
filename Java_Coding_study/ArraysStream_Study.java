package Java_Coding_study;

import java.util.*;
public class ArraysStream_Study {
    public static void main(String[] args) {
        int[] num = {1,1,2,2,5,5,3,3,4,4};

        num = Arrays.stream(num).distinct().toArray();
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        Arrays.stream(num).sum();
        
    }
}
