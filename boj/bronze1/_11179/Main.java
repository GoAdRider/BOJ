package bronze1._11179;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 2진수 뒤집기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb2 = new StringBuilder();
        while(n!=0){
            int x = n%2;
            sb2.append(x);
            n/=2;
        }
        if(sb2.charAt(0)=='0') sb2.deleteCharAt(0);
        int len = sb2.length();
        int num=1;
        int sum=0;
        for (int i = len-1; i >=0; i--) {
            int a = sb2.charAt(i)-'0';
            sum+= a*num;
            num*=2;
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
