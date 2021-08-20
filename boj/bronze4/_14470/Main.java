package bronze4._14470;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        int[] arr = new int[5];
        for(int i =0; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int total =0;

        if(arr[0]<0){
            total =Math.abs(arr[0]*arr[2]);
            if(arr[1]>=0){
                total+=arr[3]+(arr[1]*arr[4]);
            }
        }else if(arr[0]==0){
            total = arr[3]+(arr[1]*arr[4]);
        }else{
            total = (arr[1]-arr[0])*arr[4];
        }

        sb.append(total);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
