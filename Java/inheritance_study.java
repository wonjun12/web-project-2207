package Java;

import org.omg.Messaging.SyncScopeHelper;

class Substrac {
    void Substrac(){
    System.out.println("Substrac 출력");
    }
    int plusSubstac (int a){
        return a+5;
    }
}

class Substrac_2 extends Substrac {
    void Substrac_2() {
    System.out.println("Substrac_2 출력");
    }
    void sum() {
        System.out.println("Substrac_2 sum 메소드");
    }
}

class substrac_3 extends Substrac {

}


class substrac_4 extends Substrac_2{
    //부모 클래스의 sum메소드를 자식 클래스에서 sum 메소드를 재조정하여 사용하는 것이 오버라이딩(overriding)이다.
    void sum() {
        System.out.println("Substrac_4 sum 메소드");
    }
}

public class inheritance_study {


    public static void main(String[] args) {
        Substrac sub1 = new Substrac();
        sub1.Substrac();
        //sub1.Substrac_2(); 
        //부모 상속이기 때문에 사용할수 없다.
        Substrac_2 sub2 = new Substrac_2();
        sub2.Substrac();
        //자식으로서 부모의 함수를 상속 받아서 사용할수 있다.
        //단, 한번에 하나의 부모만 가질수 있으며, 다른 클래스 들이 같은 부모를 상속 받아도 사용가능하다.
        sub2.Substrac_2();
        System.out.println(sub2.plusSubstac(5));
        //상속을 받아서 사용할 경우 하나의 클래스로 여러개의 함수를 사용할수 있게 만든다.
        
        substrac_4 sub4 = new substrac_4();
        sub4.Substrac_2();
        sub4.Substrac();
        //여러번 상속으로 인한 상위 개채에 간섭이 가능하다.
        //즉, 여러번 상속 한다면 최상위 클래스도 사용이 가능하다.\

        //오버라이딩(overriding) 사용하는 예제
        sub2.sum();
        sub4.sum();

    }

    
}
