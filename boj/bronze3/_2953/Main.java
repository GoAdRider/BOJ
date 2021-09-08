package bronze3._2953;

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
	public static void main(String[] args) throws IOException {
        int[] intArr = new int[5];
        int top =0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            intArr[i] = Integer.parseInt(st.nextToken())
                            +Integer.parseInt(st.nextToken())
                                +Integer.parseInt(st.nextToken())
                                    +Integer.parseInt(st.nextToken());
            if(i!=0){
                top = intArr[top]<intArr[i] ?
                    i : top;
            }
        }

        sb.append((top+1)+" "+intArr[top]);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
