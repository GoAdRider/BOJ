package basic._1158;

// 참조 : https://steady-coding.tistory.com/21
// 풀이법 : 큐를 이용한 풀이
// 예) input 7 3 일때
// [1][2][3][4][5][6][7]
// 1) 앞의 1, 2를 뒤로 보낸다
// 2) K의 배수인 3을 StringBuilder 에 담고 없앤다.
// [4][5][6][7][1][2] -- 남은 데이터
// 위와 같은 사이클 반복

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BetterAns {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        Queue<Integer> q = new LinkedList<>();
        
        // Queue에 1~N까지 값을 offer한다.
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
 
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        // Queue의 사이즈가 1일 때까지 반복한다.
        while(q.size() != 1) {
            // K - 1번째까지는 처음에 있던 값을 맨 뒤로 보낸다.
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            // K번째 값은 poll한 후 출력한다.
            sb.append(q.poll() + ", ");
        }
        
        // Queue의 사이즈가 1일 때는 단순히 poll하면 된다.
        sb.append(q.poll() + ">");
 
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
