package bronze1._3181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 줄임말 만들기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sArr = br.readLine().split(" ");
        String[] censor = {"i","pa","te","ni","niti","a","ali","nego","no","ili"};
        for (int i = 1; i < sArr.length; i++) {
            boolean check=true;

            for (int j = 0; j < censor.length; j++) {
                if(sArr[i].equals(censor[j])){
                    check=false;
                    break;
                } 
            }
            if(check) sb.append((char)(sArr[i].charAt(0)-32));
        }
        sb.insert(0,(char)(sArr[0].charAt(0)-32));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
