package bronze2._1076;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        ValueToField vtf = new ValueToField(new Ohm());
        long makeVal = Long.parseLong(vtf.get(br.readLine())+vtf.get(br.readLine()).toString());
        long multiplyVal = (long)Math.pow(10,(Integer)vtf.get(br.readLine()));
        sb.append(makeVal*multiplyVal);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class ValueToField{
    private Ohm ohm;

    ValueToField(Ohm ohm){
        this.ohm = ohm;
    }

    Object get(String key){
        try {
            return this.ohm.getClass().getDeclaredField(key).get(ohm);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class Ohm{
    protected final int black = 0;
    protected final int brown = 1;
    protected final int red = 2;
    protected final int orange = 3;
    protected final int yellow = 4;
    protected final int green = 5;
    protected final int blue = 6;
    protected final int violet = 7;
    protected final int grey = 8;
    protected final int white = 9;
}