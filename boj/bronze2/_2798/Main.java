package bronze2._2798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 블랙잭

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException  {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] cards = br.readLine().split(" ");
        int x;
        int y;
        int sum;
        int result=0;
        
        outOfLoop:
        for (int i = 0; i < n-2; i++) {
            x = Integer.parseInt(cards[i]);
            if(x > m) continue;

            for (int j = i+1; j < n-1; j++) {
                y = Integer.parseInt(cards[j]);
                if(x + y > m) continue;

                for (int k = j+1; k < n; k++) {
                    sum = x+y+Integer.parseInt(cards[k]);
                    if(sum==m){
                        result=sum;
                        break outOfLoop;
                    }

                    if(result<sum && sum<m){
                        result = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
