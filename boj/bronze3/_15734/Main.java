package bronze3._15734;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//명장 남정훈

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st= new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int tmp;
	
			int rst;
			for(;;) {
				if(a==b && c>=0) {
					a+=c/2;
					b+=c/2;
					rst = a+b;
			break;
				}
				if(a>b && c>0) {c--;b++;}
				if(a<b && c>0) {c--;a++;}
				if(c==0 && a>b){
					tmp = a-b;
					rst = (a-tmp)+b;
					break;
				}
				if(c==0 && a<b) {
					tmp = b-a;
					rst = (a-tmp)+b;
					break;
				}
			
			}
			bw.write(String.valueOf(rst));
			bw.flush();
    }
}
