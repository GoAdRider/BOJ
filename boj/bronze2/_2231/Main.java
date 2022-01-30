package bronze2._2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 분해합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int n = Integer.parseInt(br.readLine());
        System.out.println(solve(n));
    }

    static int solve(int n){
        for (int i = 0; i < n; i++) {
            int result=i+calc(i);
            if(result == n) return i;
        }
        return 0;
    }

    static int calc(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
