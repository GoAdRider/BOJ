package bronze3._1212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        if(str.equals("0")){
            sb.append(0);
        }else{
            for (int i = 0; i < str.length(); i++) {
                char[] charArr = new char[3];
                Arrays.fill(charArr,'0');
                int oneNum = str.charAt(i)-'0';
                while(oneNum>0){
                    if(oneNum>=4){
                        oneNum-=4;
                        charArr[0]='1';
                    }else if(oneNum>=2){
                        oneNum-=2;
                        charArr[1]='1';
                    }else if(oneNum==1){
                        oneNum-=1;
                        charArr[2]='1';
                    }
                }
                sb.append(charArr, 0, 3);
            }
        }
        if(sb.length()>1&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()>1&&sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}