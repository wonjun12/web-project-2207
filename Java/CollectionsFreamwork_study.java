package Java;

import java.util.*;


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


        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println("arr 0번째 "+arr.get(0));
        //arr.sort((o1, o2) -> B.get(o2).compareTo(B.get(o1)));
        //Collections.sort(arr, (o1, o2) -> (B.get(o1).compareTo(B.get(o2))));
        Collections.reverse(arr);
        System.out.println(arr.get(0));
       

        

    }
}
