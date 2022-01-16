package bronze2._2846;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 오르막길

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] distance = new int[2];
        int pre=0;
        int max=0;
        for (int i = 0; i < size; i++) {
            int pi = Integer.parseInt(st.nextToken());
            if(pi > pre && distance[0] == 0){
                distance[0] = pi;
            }

            if(pi > pre){  // 오르막길이 지속되고 있을 때
                pre = pi;
            }else{         // 오르막길이 끝났을 때 / 큰 오르막길 세팅 해주고, 시작점 초기화
                distance[1] = pre;
                int num = distance[1]-distance[0];
                max = max < num ? num : max;
                distance[0] = pi;
                distance[1] = 0;
                pre = pi;
            }
        }
        if(distance[1] < pre){
            distance[1] = pre;
            int num = distance[1]-distance[0];
            max = max < num ? num : max;
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
