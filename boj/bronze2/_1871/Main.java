package bronze2._1871;

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
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(),"-");
            String str = st.nextToken();
            long sum = 0;
            int k=2;
            for (int j = 0; j < str.length(); j++) {
                int num = str.charAt(j)-'A';
                long squre = (long)Math.pow(26, k--);
                sum+= num*squre;
            }
            int diff = Integer.parseInt(st.nextToken());
            sb.append(Math.abs(sum-diff)<=100 ? "nice" : "not nice").append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}