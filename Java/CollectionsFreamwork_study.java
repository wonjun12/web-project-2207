package Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsFreamwork_study {
    public static void main(String[] args) {

        //Collections. << 다양한 정렬 메소드 사용가능
        //Collections.sort(LIST)
        //Set HashSet : 중복을 허용하지 않는다.
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(2);
        A.add(3);
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }

        //Map : HashMap
        HashMap<String, Integer> B = new HashMap<String, Integer>();
        B.put("one", 1);
        B.put("two", 1);
        System.out.println(B.get("one"));
        System.out.println(B.get("two"));

        

    }
}
