package bronze3._2959;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) throws IOException {
        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr);
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        sb.append(intArr[0]*intArr[2]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}