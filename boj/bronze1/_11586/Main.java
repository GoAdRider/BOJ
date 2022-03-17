package bronze1._11586;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 지영 공주님의 마법 거울

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Stack<String> st = new Stack();
        String[] sA= new String[n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            sA[i] = str;
            st.push(str);
        }

        int k = Integer.parseInt(br.readLine());

        if(k==1){
            for (int i = 0; i < n; i++) {
                sb.append(sA[i]).append("\n");
            }
        }else if(k==2){
            for (int i = 0; i < n; i++) {
                for (int j = n-1; j >= 0; j--) {
                    sb.append(sA[i].charAt(j));
                }
                sb.append("\n");
            }
        }else{
            for (int i = 0; i < n; i++) {
                sb.append(st.pop()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
