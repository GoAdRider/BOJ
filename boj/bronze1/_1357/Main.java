package bronze1._1357;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Reverse rev = new Reverse();
    }
}

class Reverse{
    private static BufferedReader br; 
    private static StringTokenizer st;
    private static BufferedWriter bw;

    Reverse(){
        initialize();
        process();
    }

    static void process(){
        int x = rev(Integer.parseInt(st.nextToken()));
        int y = rev(Integer.parseInt(st.nextToken()));
        int result = rev(x+y);
        output(String.valueOf(result));
    }

    static void output(String result){
        try {
            bw.write(result);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int rev(int num){//7543
        int result=0;
        while(num!=0){
            result= result*10+num%10;   // 3 , 30+4 , 340+5, 3450+7
            num /= 10;//754, 75, 7, 0
        }
        return result;
    }

    static void initialize(){
        br = new BufferedReader(new InputStreamReader(System.in)); 
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}