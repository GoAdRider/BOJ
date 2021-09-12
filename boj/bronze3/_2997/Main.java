package bronze3._2997;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 3;
        int[] nums = new int[i];
        while(st.hasMoreTokens()){
            i--;
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int diff1 = nums[1]-nums[0];
        int diff2 = nums[2]-nums[1];

        if(diff1 == diff2){
            if(nums[2]+diff1>100){
                sb.append(nums[0]-diff1);
            }else{
                sb.append(nums[2]+diff1);
            }
        }else if(diff1 > diff2){
            sb.append(nums[0]+diff2);
        }else{
            sb.append(nums[1]+diff1);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}