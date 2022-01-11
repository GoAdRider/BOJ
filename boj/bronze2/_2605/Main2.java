package bronze2._2605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 줄 세우기
// ArrayList 풀이

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		for(int i = 1 ; i < size+1 ; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(i-num,i);
		}

		for(int i = 1 ; i < size+1 ; i++) {
            sb.append(list.get(i)).append(" ");
		}
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
