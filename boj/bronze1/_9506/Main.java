package bronze1._9506;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 약수들의 합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    private static String notPerf = " is NOT perfect.";
    public static void main(String[] args) throws IOException {
        int n;
        while((n=Integer.parseInt(br.readLine()))!=-1){
            sb.append(n)
            .append(solver(n))
            .append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String solver(int n){
        if(n%2==1) return notPerf;

        StringBuilder sb2 = new StringBuilder();
        int len=n/2;
        int temp=1;
        sb2.append(" = 1");
        for (int i = 2; i <= len; i++) {
            if(n%i==0){
                temp+=i;
                if(temp<=n) sb2.append(" + ").append(i);
                else return notPerf;
            }
        }
        if(temp==n) return sb2.toString();
        return notPerf;
    }
}