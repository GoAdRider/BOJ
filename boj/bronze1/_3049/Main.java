package bronze1._3049;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 다각형의 대각선

// 식 참조 사이트
// https://voya.tistory.com/entry/다각형-내부-대각선-교차점-갯수

/*
4개의 꼭지점으로 만들어진 2개의 선이 만나는 부분에서 하나의 교차점이 생긴다. 
결국 n개의 꼭지점에서 4개로 만들 수 있는 모든 경우의 수를 구하면 된다. 
(n) * (n-1) * (n-2) * (n-3) / 4 * 3 * 2 * 1
*/
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int calc = (n*(n-1)*(n-2)*(n-3))/24;
        String result=String.valueOf(calc);
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
