package bronze1._11050;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


// 이항계수 1

// 이항계수 계산법
//  N
//  K   =   N! / K!(N-K)! 이다

public class Main{
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] sA = br.readLine().split(" ");
        int n;
        int k = Integer.parseInt(sA[1]);
        if(k == 0){
            sb.append(1);
        }else{
            n = Integer.parseInt(sA[0]);
            
            sb.append(factorial(n)/(factorial(k)*factorial(n-k)));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int factorial(int num){
        int result=1;
        for (int i = num; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}