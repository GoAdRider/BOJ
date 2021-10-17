package bronze1._2851;

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
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
			arr[i] = Integer.parseInt(br.readLine());

		int result = 0;
        
		for(int i=0;i<10;i++) {
			int sum = 0;
			for(int j=0;j<=i;j++)
				sum += arr[j];
			
			if(Math.abs(100 -result) == Math.abs(100-sum)) result = (result>sum)?result:sum;
			else if(Math.abs(100-result) > Math.abs(100-sum)) result = sum;
		}
		
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}