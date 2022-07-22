package Java;
// 객체 지향 프로그램은 라이브러리(부분 객체 및 완성 객체)와 실행 클래스가 분리 되어있다.
public class class_study {
    public static void main(String[] args) {
                                    //기본 생성자
        class_study_class cs1 = new class_study_class();
        class_study_class cs2 = new class_study_class();
        System.out.println("객체 참조합니다.");
        // 필드는 따로 초기화를 하지않아도 자동 초기화가 진행된다.
        System.out.println(cs1.iNum);

        //class_study_class 안의 number필드의 값을 가져와서 사용한다.
        cs1.aNum = 5;
        System.out.println(cs1.aNum);
        //cs1과 cs2는 같은 클래스를 가르키고 있지만, 주소를 가르키는 것이 아닌 복사를 한다.
        System.out.println(cs2.aNum);

        //생성자로 초기화 하는 방법이다.
        class_study_class cs3 = new class_study_class(5, 6);
        System.out.print(cs3.jNum1+" ");
        System.out.print(cs3.jNum2+" ");
        System.out.print(cs3.jNum3+" \n");



        //this 사용한 생성자
        class_study_class cs4 = new class_study_class(30);
        
        System.out.print(cs4.jNum1+" ");
        System.out.print(cs4.jNum2+" ");
        System.out.print(cs4.jNum3+" \n");


        //메소드 사용
        class_study_class ms1 = new class_study_class();
        ms1.printOut();
        System.out.println(ms1.plusNumber(5, 7));

        //배열을 이용한 메소드 사용방법 (매개 변수가 정확히 알지 못할때)
        class_study_class ary1 = new class_study_class();
        {
            int[] value = {2, 5, 3};
            int result = ary1.plusNumberArray(value);
            System.out.println(result);
        }

        //void로 return 활용하기
        class_study_class void1 = new class_study_class();
        {
            System.out.println(void1.haveGas()); //가스 소유 유무 확인
            void1.setGas(5); //가스 설정
            System.out.println(void1.haveGas());
            void1.gasRun(); //가스 만큼 반복하며, 가스 값이 없을 경우 return해서 메소드 종료
        }
        

    }
}
