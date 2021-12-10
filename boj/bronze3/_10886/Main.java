package bronze3._10886;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 0 = not cute / 1 = cute

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine());
        int cute = 0;
        int notCute = 0;
        for (int i = 0; i < size; i++) {
            if(br.readLine().equals("1")) ++cute;
            else ++notCute;
        }
        bw.write(String.valueOf(cute>notCute ? "Junhee is cute!" : "Junhee is not cute!"));
        bw.flush();
        bw.close();
    }
}
