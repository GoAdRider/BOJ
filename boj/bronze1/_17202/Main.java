package bronze1._17202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// 핸드폰 번호 궁합

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        char[] cA1 = br.readLine().toCharArray();
        char[] cA2 = br.readLine().toCharArray();
        for (int i = 0; i < cA1.length; i++) {
            q.add(cA1[i]-'0');
            q.add(cA2[i]-'0');
        }
        int len = q.size();
        for (int i = 0; i < len-2; i++) {
            int size = q.size()-1;
            int x = q.remove();
            for (int j = 0; j < size; j++) {
                int y = q.remove();
                q.add((x+y)%10);
                x=y;
            }
        }
        sb.append(q.remove()).append(q.remove());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
