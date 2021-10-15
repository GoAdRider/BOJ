package bronze1._2702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        int gcd = 0;
        int num2 = 0;
        int num1 = 0;
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            gcd = gcd(num1, num2);
            sb.append(/*최소공배수*/num1 * num2 / gcd+" ").append(gcd).append(System.lineSeparator());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    //최대공약수 //유클리드 호제법
    /* ex) 
    gcd(72,30), num1 = 72, num2 = 30, num1%num2 = 12
    gcd(30,12), num1 = 30, num2 = 12, num1%num2 = 6
    gcd(12,6), num1 = 12, num2 = 6, num1%num2 = 0
    */
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}