package bronze1._11557;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Yangjojang of The Year

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int N;
        while(T-->0){
            N = Integer.parseInt(br.readLine());
            String[] colleages = new String[N];
            int[] alcohol = new int[N];
            int num=0;
            int max=0;
            for (int i = 0; i < N; i++) {
                String[] temp = br.readLine().split(" ");
                colleages[i] = temp[0];
                alcohol[i] = Integer.parseInt(temp[1]);
                if(max<alcohol[i]){
                    max = alcohol[i];
                    num = i;
                }
            }
            sb.append(colleages[num]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}