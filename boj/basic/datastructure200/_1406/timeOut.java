package basic.datastructure200._1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class timeOut {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    private static int cursor;
    public static void main(String[] args) throws IOException {
        sb.append(br.readLine());
        cursor = sb.length();
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            input(br.readLine());
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static void input(String input){
        StringTokenizer st = new StringTokenizer(input);

        String command = st.nextToken();

        switch (command) {
            case "L":
                cursor = (cursor <= 0) ? 0 : --cursor;
                break;
            case "D":
                int wordSize = sb.length();
                cursor =  (wordSize <= cursor) ? wordSize : ++cursor;
                break;
            case "B":
                if (cursor > 0) {
                    sb.deleteCharAt(--cursor);
                } else {
                    return;
                }
                break;
            case "P":
                String word = st.nextToken();
                sb.insert(cursor++, word);
                break;
        }
    }
}
