package bronze3._2476;

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
        int people = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i=0; i<people; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int prize = 0;
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());
            int c =Integer.parseInt(st.nextToken());
            if(a == b && a==c){
                prize = 10000+a*1000;
            }else if(a!=b && b!=c && a!=c){
                b= b>c?
                    b:c;

                a = a>b?
                    a:b;

                prize = a*100;

            }else{
                prize = a==b?
                1000+a*100 : b==c?
                1000+b*100 : 1000+c*100;
            }
            max= max>prize?
                max:prize;
        }
        sb.append(max);
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
