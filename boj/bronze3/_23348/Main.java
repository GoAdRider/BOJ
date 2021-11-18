package bronze3._23348;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 스트릿 코딩 파이터

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] points = new int[3];
        for (int i = 0; i < points.length; i++) {
            points[i] = Integer.parseInt(st.nextToken());
        }

        int size = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < size; i++) {
            int[] nums = new int[4];
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                nums[1] += Integer.parseInt(st.nextToken());
                nums[2] += Integer.parseInt(st.nextToken());
                nums[3] += Integer.parseInt(st.nextToken());
            }
            nums[1] = nums[1]*points[0];
            nums[2] = nums[2]*points[1];
            nums[3] = nums[3]*points[2];

            nums[0] = nums[1]+ nums[2] + nums[3];
            max = max> nums[0] ? max : nums[0];
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
