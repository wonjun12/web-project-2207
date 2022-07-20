package Java_Coding_study;

import javax.security.auth.x500.X500Principal;

import org.omg.Messaging.SyncScopeHelper;

class Test2 {
    int a;
    
    
    String test1(int x){
        a = x;
        String str = "";
        for(int i = 1; i <= 9 ; i++){
            str += x + " * " + i + " = " + (x*i);
            if(i!=9){
                str += "\n";
            }
        }

        return str;
    }
    void test2(){
        for(int i = 0; i < a; i++){
            for(int j = a; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i +1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

public class Test {
    static int APPLE = 10;
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        
        System.out.println(t1.test1(2));
        t1.test2();

           
        

    }
}
