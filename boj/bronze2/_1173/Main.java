package bronze2._1173;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 1<= N,T,R <=200
// 50 <= m <= M <= 200
// 운동 N 분하는데 필요한 시간의 최솟값 출력 만약 운동을 N분 할 수 없다면 -1 출력
public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 운동횟수
        int m = Integer.parseInt(st.nextToken());   // 최소 심박수
        int M = Integer.parseInt(st.nextToken());   // 최대 심박수
        int T = Integer.parseInt(st.nextToken());   // 운동시 맥박 증가 수
        int R = Integer.parseInt(st.nextToken());   // 휴식시 맥박 하락 수
        int X = m;                                  // 현재 맥박 수
        int count = 0;                              // 운동을 N분 하는데 필요한 최솟값

        if(m+T<=M){
            while(N!=0){
                if(X+T<=M){
                    X+=T;
                    N--;
                }else{
                    X-=R;
                }
                
                count++;
                if(X<m)
                    X=m;
            }
            sb.append(count);
        }else{
            sb.append(-1);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
