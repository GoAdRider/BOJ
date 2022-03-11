package bronze1._11098;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 첼시를 도와줘!

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int p = Integer.parseInt(br.readLine());
            int[] intArr= new int[p];
            String[] sArr= new String[p];
            StringTokenizer st;
            int max = 0;
            int num = 0;
            for (int i = 0; i < p; i++) {
                st = new StringTokenizer(br.readLine());
                intArr[i] = Integer.parseInt(st.nextToken());
                sArr[i] = st.nextToken();

                if(max<intArr[i]){
                    max = intArr[i];
                    num = i;
                }
            }
            sb.append(sArr[num]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
