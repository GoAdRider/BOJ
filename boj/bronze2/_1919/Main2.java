package bronze2._1919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 애너그램 만들기 다른사람 풀이

public class Main2 {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        String s1 = br.readLine();
        String s2 = br.readLine();
        int[] count = new int[26];

        for (char c : s1.toCharArray()) count[c-'a']++;
        for (char c : s2.toCharArray()) count[c-'a']--;
        int ret = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) ret += Math.abs(count[i]);
        }

        bw.write(String.valueOf(ret));
        bw.flush();
        bw.close();
    }
}
