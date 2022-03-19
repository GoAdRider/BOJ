package bronze1._10769;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 행복한지 슬픈지

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws IOException {
        int happy = 0;
        int sad = 0;
        char[] letters = br.readLine().toCharArray();
        boolean flag = false;
        for (int i = 0; i < letters.length; i++) {
            if(flag){
                if(letters[i]=='-') flag=true;
                else if(letters[i-1]=='-'){
                    if(letters[i]==')'){
                        happy++;
                        flag = false;
                    } 
                    else if(letters[i]=='('){
                        sad++;
                        flag = false;
                    }
                }
                else flag=false;
            }else if(letters[i]==':') flag = true;
        }
        String str;
        if(happy==0 && sad==0) str = "none";
        else{
            if(happy==sad) str= "unsure";
            else if(happy>sad) str= "happy";
            else str="sad";
        }
        bw.write(str);
        bw.flush();
        bw.close();
    }
}
