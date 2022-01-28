package bronze2._3062;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 수 뒤집기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args)throws IOException  {
        StringBuilder sb;
        int t = Integer.parseInt(br.readLine());
        String A,B;
        int a,b;
        for (int i = 0; i < t; i++) {
            sb = new StringBuilder();
            A = br.readLine();
            int len = A.length();
            for (int j = len-1; j >= 0; j--) {
                sb.append(A.charAt(j));
            }

            a = Integer.parseInt(A);
            b = Integer.parseInt(sb.toString());
            System.out.println(solve(String.valueOf(a+b)));
        }
    }

    static String solve(String sum){
        int len = sum.length();
        int i=0;
        int size = len/2;
        --len;
        boolean cont = true;
        while(size-->0){
            if(sum.charAt(i++)!=sum.charAt(len--)) cont = false;
        }
        
        if(cont) return "YES";
        else return "NO";
    }
}
