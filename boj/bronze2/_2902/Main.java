package bronze2._2902;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// KMP 는 왜 KMP 일까?

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int size = st.countTokens();
        for (int i = 0; i < size; i++) {
            sb.append(st.nextToken().charAt(0));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}