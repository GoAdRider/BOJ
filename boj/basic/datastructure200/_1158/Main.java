package basic.datastructure200._1158;

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
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int times = Integer.parseInt(st.nextToken());
        Josephus jose = new Josephus(size, times);
        jose.add();
        int[] joseNums = jose.outPut();

        sb.append("<");
        for (int i = 0; i < joseNums.length; i++) {
            if(i==0){
                sb.append(joseNums[i]);
            }else{
                sb.append(", ").append(joseNums[i]);
            }
        }
        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class Josephus{
    private int[] store;        // 처음 배열 저장
    private int[] transfer;     // 요세푸스 순서로 저장
    private int transferNum;    // transfer 배열 번호 transfer[transferNum] , garbage 데이터 개수로도 활용
    private int dataNum;        // 처리해야할 데이터 개수
    private int cs;             // store 데이터 처리할 커서(배열의 번호)
    private int times;          // 처리할 배수

    public Josephus(int capacity, int times){
        this.store = new int[capacity];
        this.transfer = new int[capacity];
        this.transferNum = 0;
        this.dataNum = capacity;
        this.cs = times-1;
        this.times = times;
    }

    protected int size(){
        return this.store.length;
    }

    protected void add(){
        for (int i = 0; i < size(); i++) {
            store[i] = i+1;
        }
    }

    protected void sort(){
        double temp = (cs-transferNum)%times;
        temp = (dataNum - temp)/times;
        int condition = (int)Math.ceil(temp);

        int workNum = 0;

        while(condition-- != 0){
            transfer[transferNum] = store[cs];
            store[cs] = 0;
            cs=cs+times;
            transferNum++;
            workNum++;
        }

        dataNum = dataNum-workNum;      // 남은 처리해야할 데이터 개수 세팅
        cs = cs%size()+transferNum;     // 다음 커서 세팅
        
        if(dataNum == 0) return;

        Arrays.sort(store);
        sort();
    }

    protected int[] outPut(){
        sort();
        return this.transfer;
    }
}