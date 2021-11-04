package basic.datastructure200._1874;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	

    private int top = 0;
    private int[] arr;

    public Main(int stackSize){
        this.arr = new int[stackSize];
    }
	public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(br.readLine());
        Main main = new Main(size);
        int idx = 1;
        
        for (int i = 0; i < size; i++) {
            int m = Integer.parseInt(br.readLine());

            if(m >= idx){

                for (int j = idx; j <= m; j++) {
                    main.push(j);
                    idx++;
                    sb.append('+').append('\n');
                }

            }else if(main.top() != m){
                System.out.println("NO");
                return;
            }

            main.pop();
            sb.append('-').append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private void push(int i){
        if(top < arr.length){
            arr[top++] = i;
        }else{
            System.out.println("stack is full");
        }
    }

    private int pop(){
        if(top > 0){
            return arr[--top];
        }else{
            // throw new java.util.NoSuchElementException();
            return -1;
        }
    }

    private int size(){
        return this.top;
    }

    private int empty(){
        if(this.top==0){
            return 1;
        }else{
            return 0;
        }
    }
    
    private int top(){
        if(top==0){
            return -1;
        }else{
            return arr[top-1];
        }
    }
}
