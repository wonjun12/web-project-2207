package Java;

public class array_study {
    public static void main(String[] args) {
        // 1차원 배열 선언 방법
        int[] aInt;
        aInt = new int[] {1,2,3}; //귀찮음

        int[] bInt = new int[4];
        bInt[0] = 1;

        int[] cInt = {1,2,3};

        int[] dInt = new int[] {1,2,3}; //개 귀찮음


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
    }
}
