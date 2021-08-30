package bronze3._2460;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        int max = 0;
        for(int i =0; i<10 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            switch (i) {
                case 0:
                    arr[i] = in;
                    max = arr[i];
                    break;
                case 9:
                    arr[i]=arr[i-1]-out;
                    sb.append(max);
                    break;
            
                default:
                    arr[i]=arr[i-1]-out+in;
                    max=arr[i]>max?
                        arr[i]:max;
                    break;
            }
        }
        


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
