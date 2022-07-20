package Java_Coding_study;

public class secreack {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46,33,33,22,31,50};
        int[] arr2 = {27,56,19,14,14,10};
        char[] chr2 = new char[n];
        //Integer.toBinaryString(arr1);
        //String b = String.format("%05d", Integer.parseInt(Integer.toBinaryString(14)));
        //String.format("%05d", Integer.parseInt(Integer.toBinaryString(14)))
        //String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i])))
        for(int i = 0; i < n; i++){
            //System.out.println(String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]))));
            char[] chr =  Integer.toBinaryString(arr1[i] | arr2[i]).toCharArray();
            for(int j = 0; j < chr2.length; j++){
                chr2[j] = '0';
            }
            for(int j = chr.length - 1, count = n - 1; j >= 0; j--, count--){
                chr2[count] = chr[j];

            }
            String str = String.valueOf(chr2);
            str = str.replace("1", "#");
            str = str.replace("0", " ");
            System.out.println(str);


            // str = str.replace("1", "#");
            // str = str.replace("0", " ");
            // str = str.replace("1", "#");
            // str = str.replace("0", " ");
            // System.out.println(str);         
        }
    }
}
