package bronze2._2153;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 소수 단어

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        char[] cArr  = br.readLine().toCharArray();
        int sum=0;
        for (int i = 0; i < cArr.length; i++) {
            if(cArr[i] < 97) sum += cArr[i]-38;
            else sum += cArr[i]-96;
        }

        for (int i = 2; i < sum; i++) {
            if(sum%i==0){
                sb.append("It is not a prime word.");
                break;
            }
        }
        if(sb.length()==0) sb.append("It is a prime word.");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
