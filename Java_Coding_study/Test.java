package Java_Coding_study;

import javax.security.auth.x500.X500Principal;

class Test2 {
    
}

public class Test {
    static int APPLE = 10;
    public static void main(String[] args) {
        String answer = "";
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++){
            char[] chr = str[i].toCharArray();
            str[i] = "";
            for(int j = 0; j < chr.length; j++){
                if(j % 2 ==0){
                    chr[j] = Character.toUpperCase(chr[j]);    
                }else{
                    chr[j] = Character.toLowerCase(chr[j]);
                }
                str[i] += chr[j];
            }
            answer += str[i];
            if(str.length != (i+1)){
                answer += " ";
            }
            
        }
        return answer;
    }
}
