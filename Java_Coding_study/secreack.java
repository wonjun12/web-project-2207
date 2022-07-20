package Java_Coding_study;

import javafx.scene.AmbientLight;

public class secreack {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        //Integer.toBinaryString(arr1);
        //String b = String.format("%05d", Integer.parseInt(Integer.toBinaryString(14)));
        //String.format("%05d", Integer.parseInt(Integer.toBinaryString(14)))
        //String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i])))
        for(int i = 0; i < n; i++){
            //System.out.println(String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i]))));
            String str = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i] | arr2[i])));
            str = str.replace("1", "#");
            str = str.replace("0", " ");
            System.out.println(str);         
        }
    }
}
