package bronze3._15781;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 헬멧과 조끼

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int hmax =0;
        int h;
        for (int i = 0; i < n; i++) {
            h = Integer.parseInt(st.nextToken());
            hmax = hmax > h ? hmax : h;
        }
        
        st = new StringTokenizer(br.readLine());
        int amax =0;
        int a;
        for (int i = 0; i < m; i++) {
            a = Integer.parseInt(st.nextToken());
            amax = amax > a ? amax : a;
        }

        bw.write(String.valueOf(amax+hmax));
        bw.flush();
        bw.close();
    }
}
