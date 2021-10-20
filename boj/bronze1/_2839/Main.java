package bronze1._2839;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count=0;
        
        while (N>=0) {
            if(N%5==0){
                sb.append(N/5+count);
                break;
            }
            count++;
            N-=3;
        }

        if(sb.length()==0){
            sb.append(-1);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
