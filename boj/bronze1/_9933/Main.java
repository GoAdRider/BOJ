package bronze1._9933;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 민균이의 비밀번호

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] sArr=new String[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sArr[i]);
            sb2.reverse();
            int len = sArr[i].length();
            boolean check=false;
            char middle=' ';
            for (int j = i; j < n; j++) {
                if(sb2.toString().equals(sArr[j])){
                    check = true;
                    middle = sArr[j].charAt(len/2);
                    break;
                }
            }

            if(check){
                sb.append(len).append(" ").append(middle);
                break;
            } 
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}