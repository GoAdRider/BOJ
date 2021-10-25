package bronze1._1977;

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
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 10001;

        int i = 1;
        int pow = 0;

        while(pow<=N){
            pow = i*i;
            
            if (M <= pow && pow <= N) {
                min = min < pow ? min : pow;
                sum += pow;
            }
            i++;
        }

        if(sum==0){
            sb.append(-1);
        }else{
            sb.append(sum).append("\n").append(min);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
