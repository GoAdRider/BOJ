package bronze2._4564;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 숫자 카드놀이

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        String str;
        while(!(str=br.readLine()).equals("0")){
            sb.append(str);
            int s = Integer.parseInt(str);
            if(s>=10){
                sb.append(" ");
                solve(s);
            } 
            else sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String solve(int s){
        int card=1;
        while(s!=0){
            card*=s%10;
            s/=10;
        }
        sb.append(card);
        if(card>=10){
            sb.append(" ");
            return solve(card);
        }else{
            sb.append("\n");
            return sb.toString();
        }
    }
}