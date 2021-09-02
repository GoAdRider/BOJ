package bronze3._2490;

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
        String str = "";
        while((str=br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            int sum = 0;

            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }

            switch (sum) {
                case 0:
                    bw.write("D\n");
                    break;
                case 1:
                    bw.write("C\n");
                    break;
                case 2:
                    bw.write("B\n");
                    break;
                case 3:
                    bw.write("A\n");
                    break;
                default:
                    bw.write("E\n");
                    break;
            }
            bw.flush();
        }
        bw.close();

    }
}