package Java;

/*  [싱글톤(Singleton)] = private
        - 단 하나의 객체만 만들도록 보장해야 하는 경우.
        - 클래스 외부에서 new 연산자로 생성자를 호출 할 수 없도록 만들어야 한다.
        - 클래스 내부에서 new 연산자로 생성자 호출이 가능하다.
        
    => 싱글톤은 여러개의 객체를 생성 하더라도 같은 하나의 클래스를 가르키는 방법이다.
        즉, 완전한 복사가 아닌 생성자 이름만 다르고 같은 주소를 가진다.

        -> 기존 클래스 생성자는 새로운 객체를 만들어 완전한 복사를 이루어 지기 때문에 싱글톤과는 아예 다른 개념이다.
*/ 
public class singleton_study {
    public static void main(String[] args) {
        singleton sin1 = singleton.getIns();
        singleton sin2 = singleton.getIns();

        System.out.println(sin1);
        System.out.println(sin2);
    }
}

class singleton {
    private static singleton sin = new singleton();

    private singleton() {
    }

    static singleton getIns(){
        return sin;
    } //외부에서 유일하게 객체를 얻는 방법.
}