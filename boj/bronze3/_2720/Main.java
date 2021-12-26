package bronze3._2720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 세탁소 사장 동혁

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int coinNum;
        for (int i = 0; i < size; i++) {
            int c = Integer.parseInt(br.readLine());

            coinNum = c/25;
            if(coinNum >=1){
                sb.append(coinNum).append(" ");
                c = c%25;
            }else{
                sb.append(0).append(" ");
            }

            coinNum = c/10;
            if(coinNum >=1){
                sb.append(coinNum).append(" ");
                c = c%10;
            }else{
                sb.append(0).append(" ");
            }
            
            coinNum = c/5;
            if(coinNum >=1){
                sb.append(coinNum).append(" ");
                c = c%5;
            }else{
                sb.append(0).append(" ");
            }

            sb.append(c >=1 ? c:0).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}