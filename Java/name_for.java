package Java;
public class name_for {
    public static void main(String[] args) {
        aLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for(int j = 0; j< 3; j++){
                System.out.println(j);
                if(j==2){
                    break aLoop;
                }
            }
            
        }
        bLoop:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for(int j = 0; j< 3; j++){
                System.out.println(j);
                if(j==2){
                    break bLoop;
                }
            }
            
        }
    }
}
