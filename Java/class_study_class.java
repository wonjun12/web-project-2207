package Java;

public class class_study_class {
    int aNum = 0;
    int iNum;
    int age;
    int jNum1, jNum2, jNum3;
    
    // 기본 생성자는 자동으로 추가 된다. (생성자가 아무것도 없다면 기본으로 사용되는 생성자)
        //기본 생성자 외에 다른 생성자가 있다면 호출시 해당 생성자에 맞게 호출해야한다.
    public class_study_class() {
        
    }    
    //
    public class_study_class(int number, int number2){
        this(number,number2,510);
        aNum = number;
        iNum = number2;
    }

    public class_study_class(int age){
        this(age,1,2);
        this.age = age;
    //   필드    =  생성자 변수

        /*
        this(age,1,2);
        Constructor call must be the first statement in a constructor
        생성자에서 다른 생성자를 사용할때 무조건 첫 줄에 사용하는 것이 '원칙, 약속'이다.
        */
    }


/*
    생성자 오버로딩(Overloading)
        - 매개 변수를 달리하는 생성자를 여러개 선언 하는 것을 말한다.
        - 매개 변수의 타입과 개수 그리고 선언된 순서가 똑같은 경우 매개 변수 이름만 바꾸는 것은 생성자 오버로딩이라고 볼수없다.
            -> 위 코딩의 3가지 타입이 '생성자 오버로딩' 이라고 볼수있다.

*/

//  this() 예제 함수
    public class_study_class(int jNum1, int jNum2, int jNum3){
        this.jNum1 = jNum1;
        this.jNum2 = jNum2;
        this.jNum3 = jNum3;
    }




// 메소드 연습

    void printOut() {
        System.out.println("첫 출력입니다. 값을 받지 않습니다. 그렇습니다.");
    }
    //void형은 값을 리턴 할수없다. -> 리턴타입이 없는 메소드이기 때문이다.

    int plusNumber(int x,int y) {
        int sum = x + y;
        return sum;
    }
    //리턴타입이 int이기 때문에 int로 return해야한다.


    //배열을 이용한 메소드 사용법
    int plusNumberArray(int[] x){
        int sum = 0;
        for(int i = 0; i < x.length; i++){ //입력한 x만큼 반복
            sum += x[i];
        }
        return sum;
    }


    //void 메소드로 return을 사용해서 활용하기.
    int x;
    void setGas(int x){
        this.x = x;
    }

    boolean haveGas() {
        if(x == 0){
            System.out.println("No Gas");
            return false;
        }
        System.out.println("One Gas");
        return true;
    }

    void gasRun() {
        while(true) {
            if(x > 0) {
                System.out.println("Gas의 잔량 만큼 이동합니다.");
                System.out.println(x+"만큼 이동합니다.");
                x -= 1;
            }else {
                System.out.println("현재의 가스 잔량이 "+ x +"입니다. 멈춥니다.");
                return; //void 메소드의 return 활용방법
            }
        }
    }
    /////////////////////////
}
