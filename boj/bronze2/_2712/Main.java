package bronze2._2712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 미국스타일

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            sb.append(convert(num, str)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static String convert(double num, String str){
        double toLb = 2.2046;
        double toKg = 0.4536;
        double toG = 0.2642;
        double toL = 3.7854;
        switch (str) {
            case "kg":
                return String.format("%.4f lb",num*toLb);
            case "lb":
                return String.format("%.4f kg",num*toKg);
            case "l":
                return String.format("%.4f g",num*toG);
            case "g":
                return String.format("%.4f l",num*toL);
        }
        return "";
    }
}
