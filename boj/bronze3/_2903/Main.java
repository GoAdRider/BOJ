package bronze3._2903;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
        sb.append(solve(Long.parseLong(br.readLine())));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static long solve(long num){  //1,2,3,4 ...
        //3, 5, 9, 17 ... 각 변 사이에 점한개씩 추가
        long result = 1;
        for (int i = 0; i < num; i++) {
            result*=2;
        }
        result+=1;
        result*=result;
        return result;
    }
}
