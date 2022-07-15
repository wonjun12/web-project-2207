package Java;
/*  [final]
 *      - 최종적인 값을 의미한다.
 *      - 초기값이 저장되면 해당 값이 최종적인 값이 되어서 프로그램 실행 도중 수정 할 수 없다.
 *          [수정 방법]
 *              1. 필드 선언 방법
 *              2. 생성자 초기화 방법
 *  [static final]
 *      - 불변의 값 - "상수" 라고 한다.
 *      - 상수는 static이면서 final이어야 한다.
 *      - final과는 다르게 객체마다 저장되지 않고, 클래스에만 포함되기 때문이다.
*/
public class final_test {
    public static void main(String[] args) {
        final_con fin = new final_con("황원준",28,15);

        System.out.println(fin.nation+" / "+fin.name+" / "+fin.age+" / "+fin.num);
        /* final 초기값을 2가지 방법으로 사용한 후 중간에 수정이 안되는 것을 알 수 있다.
        fin.nation = "미국";
        fin.name = "Hwang";
        fin.age = 30;       */
        fin.num = 20;
        System.out.println(fin.nation+" / "+fin.name+" / "+fin.age+" / "+fin.num);        
    }
}

class final_con{
    final String nation = "korea";
    final String name;
    final int age;
    int num;

    public final_con(String name, int age, int num){
        this.name = name;
        this.age = age;
        this.num = num;
    }
}