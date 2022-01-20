package bronze2._1673;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 치킨 쿠폰

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String[] store = new String[2];
        String str = "";
        while((str=br.readLine())!=null){
            store = str.split(" ");
            int n = Integer.parseInt(store[0]);
            int k = Integer.parseInt(store[1]);
            sb.append(toCoupon(n,k)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int toCoupon(int n, int k){
        int sum = n+(n/k);
        while(n/k != 0){
            n = n/k + n%k;
            sum += n/k;
        }
        return sum;
    }
}
