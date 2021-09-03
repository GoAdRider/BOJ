package bronze3._2765;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    private static final double pi = 3.1415927;
    public static void main(String[] args) throws IOException {
        String str = "";
        int count = 1;

        while ((str=br.readLine())!=null) {
            double mile = 0;
            double mph = 0;
            StringTokenizer st = new StringTokenizer(str);
            double round = Double.parseDouble(st.nextToken())*pi;// 단위는 인치 // 1피트 = 12 인치 // 1마일 = 5280피트
            int rotate = Integer.parseInt(st.nextToken());
            if(rotate==0)
                break;
            double second = Double.parseDouble(st.nextToken());

            mile = (round*rotate)/63360;
            mph = (mile/second)*3600;

            sb.append(String.format("Trip #%d: %.2f %.2f\n",count, mile, mph));
            count++;
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}