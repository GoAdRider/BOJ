package bronze2._3047;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException  {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArr = new int[3];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(intArr);
        ABC abc = new ABC();
        abc.A = intArr[0];
        abc.B = intArr[1];
        abc.C = intArr[2];
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            ValueToField vtf = new ValueToField(abc);
            sb.append(vtf.get(Character.toString(str.charAt(i)))+" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class ValueToField{
    private ABC abc;

    ValueToField(ABC abc){
        this.abc = abc;
    }

    Object get(String key){
        try {
            return this.abc.getClass().getDeclaredField(key).get(abc);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class ABC {
    int A = 0;
    int B = 0;
    int C = 0;
}