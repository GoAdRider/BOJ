package bronze3._2576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 홀수
// 입력받는 자연수 7개 중 홀수의 합과 그 홀수의 최소값을 구해라. 없으면 -1

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int[] intArr = new int[7];
        int j = 0;
        for (int i = 0; i < intArr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n%2 == 1) intArr[j++] = n;
        }

        int sum =0;
        int min =0;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
            if (intArr[i]==0) {
                break;
            }
            min = min < intArr[i] ? min : intArr[i];
            sum += intArr[i];
        }

        if (sum == 0) {
            bw.write(-1);
        } else {
            sb.append(sum).append("\n").append(min);
            bw.write(sb.toString());
        }
        bw.flush();
        bw.close();
    }
}