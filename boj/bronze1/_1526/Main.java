package bronze1._1526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 가장 큰 금민수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String result="";
        for (int i = n; i >= 4; i--) {
            int check = calc(i);
            if(check != 0){
                result = String.valueOf(check);
                break;
            } 
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
    static int calc(int num){
        int check;
        int origin = num;
        while(num!=0){
            check=num%10;
            if(check ==7 || check ==4) num/=10;
            else return 0;
        }
        return origin;
    }
}
