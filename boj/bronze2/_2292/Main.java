package bronze2._2292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        int inputNum = Integer.parseInt(br.readLine());
        if(inputNum == 1){
            sb.append(1);
        }else if(inputNum>1 && inputNum<8){
            sb.append(2);
        }else{
            sb.append(solve(inputNum));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int solve(int inputNum){
        return recursion(inputNum);
    }

    private static int recursion(int inputNum){
        return recursionTail(2, 1, inputNum);
    }

    private static int recursionTail(int layerMinNum, int layer, int inputNum) {
        // System.out.println("layerMinNum : "+layerMinNum);
        // System.out.println("layer : "+layer);
        // System.out.println("inputNum : "+inputNum);
        // System.out.println();
        if(layerMinNum > inputNum)
            return layer;
        return recursionTail(layerMinNum+(6*layer), ++layer, inputNum);
    }
}
