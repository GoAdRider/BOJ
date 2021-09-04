package bronze3._2863;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        String[] strArr = new String[5];
        String str = (br.readLine()+" "+br.readLine()+" 0");
        strArr = str.split(" ");
        
        double[] dblArr = new double[5];
        for (int i = 0; i < dblArr.length; i++) {
            dblArr[i] = Double.parseDouble(strArr[i]);
        }

        double maxCheck = 0.0;
        int count = 0;

        for (int i = 0; i < 4; i++) {
            if(calculator(dblArr)>=maxCheck){
                maxCheck = calculator(dblArr);
                count = i;
            }
            rotateArr(dblArr);
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void rotateArr(double[] dblArr) {
        dblArr[4] = dblArr[0];
        dblArr[0] = dblArr[2];
        dblArr[2] = dblArr[3];
        dblArr[3] = dblArr[1];
        dblArr[1] = dblArr[4];
    }

    private static double calculator(double[] dblArr){
        return (dblArr[0]/dblArr[2])+(dblArr[1]/dblArr[3]);
    }
}
