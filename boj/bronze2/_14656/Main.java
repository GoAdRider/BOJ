package bronze2._14656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 조교는 새디스트야!!

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException  {
		int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[num];
		int count = 0;
		for(int i=0;i<p.length;i++)
		{
			p[i] = Integer.parseInt(st.nextToken());
			if(p[i] != i+1) count++;
		}
		bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}