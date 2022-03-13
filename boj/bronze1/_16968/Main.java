package bronze1._16968;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 차량 번호판1

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[] cArr = br.readLine().toCharArray();
        int c=26;
        int d=10;
        int ans=1;

        for (int i = 0; i < cArr.length; i++) {
            if(i>0){
                if(cArr[i]==cArr[i-1]){
                    if(cArr[i]=='c') ans *= (c-1);
                    else if(cArr[i]=='d') ans *= (d-1);
                }else ans = calc(ans, cArr[i], c, d);
            }else ans = calc(ans, cArr[i], c, d);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
    static int calc(int ans, char cha, int c, int d){
        if(cha=='c') return ans *= c;
        else return ans *= d;
    }
}
