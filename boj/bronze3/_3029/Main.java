package bronze3._3029;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {
        Solution.solution();
    }
}

class Solution{
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static StringBuilder sb = new StringBuilder();
    static Input input = new Input();

    static void solution(){
        int[][] times = new int[3][2];
        TimeCalc tc = new TimeCalc();
        times = input.shape();
        sb.append(tc.calcTime(times[0], times[1], times[2]));
        try {
            bw.write(sb.toString());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Input{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static int[] hours = new int[2];
    private static int[] mins = new int[2];
    private static int[] secs = new int[2];

    static void in() {

        try{
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(),":");
                hours[i] = Integer.parseInt(st.nextToken());
                mins[i] = Integer.parseInt(st.nextToken());
                secs[i] = Integer.parseInt(st.nextToken());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

    static int[][] shape(){
        in();
        int[][] times = new int[3][2];
        times[0] = hours;
        times[1] = mins;
        times[2] = secs;
        return times;
    }
}

class TimeCalc{
    int globalDay=0;
    int globalHour=0;
    int globalMin=0;

    String calcTime(int[] hours, int[] mins, int[] secs){
        String sec = Integer.toString(secCalc(secs));
        String min = Integer.toString(minCalc(mins));
        String hour = Integer.toString(hourCalc(hours));
        sec = sec.length()<2? "0"+sec:sec;
        min = min.length()<2? "0"+min:min;
        hour = hour.length()<2? "0"+hour:hour;
        return hour+":"+min+":"+sec;
    }

    int secCalc(int[] secs){
        int sec;
        if(secs[1]-secs[0]<0){
            globalMin-=1;
            secs[1]+=60;
        }
        sec = secs[1]-secs[0];
        return sec;
    }

    int minCalc(int[] mins){
        int min;
        mins[1] += globalMin;
        if(mins[1]-mins[0]<0){
            globalHour-=1;
            mins[1]+=60;
        }
        min = mins[1]-mins[0];
        return min;
    }

    int hourCalc(int[] hours){
        int hour;
        hours[1] += globalHour;
        if(hours[1]-hours[0]<0){
            globalDay+=1;
            hours[1]+=24;
        }
        hour = hours[1]-hours[0];
        return hour;
    }
}
