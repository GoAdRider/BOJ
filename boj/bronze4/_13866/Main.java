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
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        for(int i =0; i<arr.length; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        sb.append(Math.abs((arr[0]+arr[3]) - (arr[1]+arr[2])));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
