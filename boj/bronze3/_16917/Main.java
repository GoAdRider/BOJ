package bronze3._16917;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 양념 반 후라이드 반

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 양념
        int b = Integer.parseInt(st.nextToken()); // 후라이드
        int c = Integer.parseInt(st.nextToken()); // 반반
        int x = Integer.parseInt(st.nextToken()); // 양념 최소 개수
        int y = Integer.parseInt(st.nextToken()); // 후라이드 최소 개수

        int price=0;
        if ((a+b) <= c*2) {
            price += (a*x) + (b*y);
        }else{
            if(x>y){
                price += y*(c*2);
                price += Math.min((x-y)*a,(x-y)*(c*2));
            }else{
                price += x*(c*2);
                price += Math.min((y-x)*b, (y-x)*(c*2));
            }
        }
        bw.write(String.valueOf(price));
        bw.flush();
        bw.close();
    }
}
