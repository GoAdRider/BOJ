package basic._9093;

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

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int til = st.countTokens();
            for (int j = 0; j < til; j++) {
                sb.append(reverse(st.nextToken())+" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String reverse(String str){
        int size = str.length();
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = size-1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
