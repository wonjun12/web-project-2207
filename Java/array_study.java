package Java;

import java.util.Arrays;

public class array_study {
    public static void main(String[] args) {
        // 1차원 배열 선언 방법
        int[] aInt;
        aInt = new int[] {1,2,3}; //귀찮음

        int[] dInt = new int[] {1,2,3}; //개 귀찮음

        int[] bInt = new int[4];
        bInt[0] = 1;

        int[] cInt = {1,2,3};


        // 2차원 배열 선언 방법
        int[][] zInt = {
            {1,2,3,4},
            {1,2,3}
        };

        int[][] yInt = new int[2][4];

        System.out.println(yInt.length);
        //1차원 배열의 크기를 말해준다.
        System.out.println(yInt[0].length);
        //2차원 배열의 크기를 말해준다.


        //0. 1차원 배열 선언
        int[] arr1 = {1,2,3,4,5};
        int len = 10;

        //1. System 클래스의 arraycopy() 메소드
        int[] arr2 = new int[len];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        //2. Arrays 클래스의 copyOf() 메소드
        int[] arr3 = Arrays.copyOf(arr1, 4);

        //3. Object 클래스의 clone() 메소드
        int[] arr4 = arr1.clone();
        
        //4. for 문과 인덱스를 이용한 복사
        int[] arr5 = new int[len];


        //Enhanced for 문
        for(int e : arr1){
            e += 10;
            System.out.println(e);
            System.out.println(arr1[0]);
        }
        
    }
}
