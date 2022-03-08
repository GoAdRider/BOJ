package bronze1._11005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 진법 변환 2

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int jinbub = Integer.parseInt(str[1]);
        int add;
        char c;
        while (num>0) {
            add=num%jinbub;
            if(add>=10) c=(char)(add+55);
            else c=(char)(add+48);
            sb.append(c);
            num/=jinbub;
        }
        sb.reverse();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}