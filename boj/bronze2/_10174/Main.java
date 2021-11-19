package bronze2._10174;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 팰린드롬수
// 앞으로 읽으나 뒤로 읽으나 똑같은 단어나 숫자

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        int size = Integer.parseInt(br.readLine());
        char[] palin;

        for (int i = 0; i < size; i++) {
            palin = br.readLine().toLowerCase().toCharArray();
            sb.append(palinDrome(palin)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String palinDrome(char[] palin){
        int j = palin.length-1;
        int i = 0;
        int condition = palin.length/2;
        while(condition>0){
            if(palin[j--] != palin[i++]){
                return "No";
            }
            condition --;
        }
        return "Yes";
    }
}
