package Java_Coding_study;

class Star {
    public Star() {}

    public void StarPira(int x){
        for(int i = 0; i < x; i++){
            for(int j = x - 1 ; j > i ; j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class StarStudy {
    public static void main(String[] args) {
        Star str1 = new Star();
        str1.StarPira(5);
    }
}
