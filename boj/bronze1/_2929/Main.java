package bronze1._2929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 머신 코드

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[] oldP = br.readLine().toCharArray();
        int lowerCase = 1;
        int total = 0;
        for(int i=1;i<oldP.length;i++){
            int between=  oldP[i]-'A';
            if(0<=between && between<=26){
                if(lowerCase%4 != 0) total += 4-(lowerCase%4);
                lowerCase=1;
            }else lowerCase++;
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}
