package bronze2._1159;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int til = Integer.parseInt(br.readLine());
        char[] charArr = new char[til];
        for (int i = 0; i < til; i++) {
            charArr[i] = br.readLine().charAt(0);
        }

        Arrays.sort(charArr);

        Map<Character, Integer> map = new HashMap<>();
        for (char c : charArr) {
            if(map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
                if(map.get(c)==5){
                    sb.append(c);
                }
            } else {
                map.put(c, 1);
            }
        }
        
        if(sb.toString().isBlank())
            sb.append("PREDAJA");
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}