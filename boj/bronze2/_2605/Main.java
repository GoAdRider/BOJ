package bronze2._2605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// 줄 세우기
// 2개의 Stack을 이용한 풀이

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack left = new Stack();
        Stack right = new Stack();

        for (int i = 1; i <= size; i++) {
            int num = Integer.parseInt(st.nextToken());
 
            for (int j = 0; j < num; j++) {
                right.push(left.pop());
            }
            left.push(i);
 
            while (!right.isEmpty()) {
                left.push(right.pop());
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while (!right.isEmpty()) {
            sb.append(right.pop() + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
