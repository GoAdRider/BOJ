package bronze3._2985;

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firNum = Integer.parseInt(st.nextToken());
        int secNum = Integer.parseInt(st.nextToken());
        int thiNum = Integer.parseInt(st.nextToken());

        if(firNum==(secNum+thiNum)){
            sb.append(String.format("%d=%d+%d", firNum,secNum,thiNum));
        }else if(firNum==(secNum-thiNum)){
            sb.append(String.format("%d=%d-%d", firNum,secNum,thiNum));
        }else if(firNum==(secNum*thiNum)){
            sb.append(String.format("%d=%d*%d", firNum,secNum,thiNum));
        }else if(firNum==(secNum/thiNum)){
            sb.append(String.format("%d=%d/%d", firNum,secNum,thiNum));
        }else if((firNum+secNum)==thiNum){
            sb.append(String.format("%d+%d=%d", firNum,secNum,thiNum));
        }else if((firNum-secNum)==thiNum){
            sb.append(String.format("%d-%d=%d", firNum,secNum,thiNum));
        }else if((firNum*secNum)==thiNum){
            sb.append(String.format("%d*%d=%d", firNum,secNum,thiNum));
        }else if((firNum/secNum)==thiNum){
            sb.append(String.format("%d/%d=%d", firNum,secNum,thiNum));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
