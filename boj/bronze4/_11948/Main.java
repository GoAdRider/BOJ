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
        String str="";
        
        int[] subjects= new int[6];
        int sum =0;
        for(int i =0; i<6; i++){
            sum+= (subjects[i] = Integer.parseInt(br.readLine()));
        }

        sb.append(sum-minimum(subjects));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int minimum(int[] subjects){

        int min = subjects[0];
        for(int i=1; i<4; i++){
            if(min>subjects[i]){
                min=subjects[i];
            }
        }

        min+=subjects[4]>=subjects[5]?
            subjects[5]:subjects[4];

        return min;
    }
}