package bronze3._2783;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        StringTokenizer st25 = new StringTokenizer(br.readLine());
        double x25 = Double.parseDouble(st25.nextToken());
        double y25 = Double.parseDouble(st25.nextToken());
        int count = Integer.parseInt(br.readLine());

        if(count!=0){
            double[][] dblArr = new double[count+1][3];//{{x1,y1,func}, {x2,y2,func}, {x3,y3,func}, {x4,y4,func}}
    
            dblArr[0][0] = x25; 
            dblArr[0][1] = y25; 
            dblArr[0][2] = x25/y25; 
            
            for (int i = 0; i < count; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                dblArr[i+1][0] = Double.parseDouble(st.nextToken());
                dblArr[i+1][1] = Double.parseDouble(st.nextToken());
                dblArr[i+1][2] = dblArr[i+1][0]/dblArr[i+1][1];

                if(dblArr[0][2]>=dblArr[i+1][2]){
                    dblArr[0][0] = dblArr[i+1][0];
                    dblArr[0][1] = dblArr[i+1][1];
                    dblArr[0][2] = dblArr[i+1][2];
                }
            }
            sb.append(String.format("%.2f",dblArr[0][0]*1000.0/dblArr[0][1]));
    
        }else{
            sb.append(String.format("%.2f",x25*1000.0/y25));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
