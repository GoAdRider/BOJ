package bronze3._23794;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 골뱅이 찍기 - 정사각형

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine())+2;
        for(int i=0; i<size ; i++){
            for(int j=0; j<size ; j++){
                if(i==0 || i == size-1){
                    sb.append("@");
                }else{
                    if(j==0 || j== size-1){
                        sb.append("@");
                    }else{
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}