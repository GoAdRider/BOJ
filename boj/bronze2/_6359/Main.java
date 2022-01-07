package bronze2._6359;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 만취한 상범

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuffer sb = new StringBuffer();	
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        boolean[] door=null;
        int n;
        while(t-->0){
            n = Integer.parseInt(br.readLine());
            door = test(n, door);
            sb.append(print(door)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean[] test(int n, boolean[] door){
        door = new boolean[n];
        n--; // 첫라운드는 문을 다 여는 관계로 알고리즘에서 제외
        int increase = 2;
        int num=1;
        int i=1;
        while(n-->0){
            for (; num < door.length; num+=increase) {
                if(door[num] == true){
                    door[num]=false;
                }else{
                    door[num]=true;
                }
            }
            increase++;
            ++i;
            num=i;
        }
        return door;
    }

    private static int print(boolean[] door){
        int count=0;
        for (int i = 0; i < door.length; i++) {
            if(door[i]==false){
                count++;
            }
        }
        return count;
    }
}
