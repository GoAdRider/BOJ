package bronze2._4458;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 첫 글자를 대문자로

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if(c >= 97) c =(char)(c-32);

            sb.append(c).append(str.substring(1)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
