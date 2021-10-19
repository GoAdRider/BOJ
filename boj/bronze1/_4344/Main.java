package bronze1._4344;

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
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int[] intArr = new int[len];
            int sum=0;

            for (int j = 0; j < len; j++) {
                int value = Integer.parseInt(st.nextToken());
                intArr[j] = value;
                sum+= value;
            }

            double percent = sum/len;
            double count=0;

            for(int j = 0 ; j < len ; j++) {
				if(intArr[j] > percent) {
					count++;
				}
			}

            sb.append(String.format("%.3f%%\n",(count/len)*100));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
