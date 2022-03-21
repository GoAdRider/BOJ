package bronze1._11383;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 뚊

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] sA = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                sb.append(temp.charAt(j)).append(temp.charAt(j));
            }
            sA[i] = sb.toString();
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if(str.length()==sA[i].length()){
                if(!str.equals(sA[i])) flag = false;
            }else{
                flag = false;
            }
        }
        
        if(flag) System.out.println("Eyfa");
        else System.out.println("Not Eyfa");
    }
}
