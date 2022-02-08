package bronze2._2810;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 컵홀더

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int countL = countChar(str, 'L');
        int countS = countChar(str, 'S');
        if(countL>2) System.out.println(countL/2+countS+1);
        else System.out.println(countL+countS);
    }

    static int countChar(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
