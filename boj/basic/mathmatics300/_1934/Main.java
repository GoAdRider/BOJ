package basic.mathmatics300._1934;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 최소 공배수
// 문제 2601(최대공약수와 최소공배수)과 같은 풀이
// 유클리드 호제법으로 최대공약수를 구한 후 입력받은 두 수에 최대공약수를 나누면 최소공배수

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a*b/gcd(a, b)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int gcd(int a, int b){
        int r;
        while (b!=0) {
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
