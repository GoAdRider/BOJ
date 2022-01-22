package bronze2._4470;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 줄번호

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());

        for (int i = 1; i <= size; i++) {
            sb.append(i).append(". ").append(br.readLine()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
