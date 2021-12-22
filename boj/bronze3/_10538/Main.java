package bronze3._10538;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 수빈이와 수열

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine());
        int[] intArr = new int[size];
        intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 1; i <= size; i++) {
            sb.append(intArr[i-1]*i-sum).append(" ");
            sum+=intArr[i-1]*i-sum;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
