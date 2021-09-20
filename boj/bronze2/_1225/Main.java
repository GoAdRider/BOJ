package bronze2._1225;

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long sum=0;
        long temp =0;
        String Astr = st.nextToken();
        String Bstr = st.nextToken();

        for (int i = 0; i < Astr.length(); i++) {
            sum+= Astr.charAt(i)-'0';
        }
        for (int i = 0; i < Bstr.length(); i++) {
            temp+= Bstr.charAt(i)-'0';
        }
        sb.append(sum*temp);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
