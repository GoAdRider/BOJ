package bronze1._2669;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 직사각형 네개의 합집합의 면적 구하기

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	private static StringBuilder sb = new StringBuilder();	
    public static void main(String[] args) throws IOException {
        boolean[][] boolMat;
        int[][] intMat=new int[4][4];
        int rMax=0, lMax=0;
        String[] temp;
        for (int i = 0; i < 4; i++) {
            temp = br.readLine().split(" ");
            for(int j = 0; j < 4; j++){
                intMat[i][j] = Integer.parseInt(temp[j]);
            }
            rMax = rMax < intMat[i][2] ? intMat[i][2] : rMax;
            lMax = lMax < intMat[i][3] ? intMat[i][3] : lMax;
        }
        boolMat = new boolean[lMax][rMax];
        int result = 0;
        for (int i = 0; i < 4; i++) {
            for(int x = intMat[i][1]; x < intMat[i][3]; x++){
                for(int y = intMat[i][0]; y < intMat[i][2]; y++){
                    if(!boolMat[x][y]){
                        boolMat[x][y] = true;
                        result++;
                    }
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
