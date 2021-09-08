package basic._10828;

//스택

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();	

    private int[] arr;
    private int top = 0;
    public Main(int stackSize){
        this.arr = new int[stackSize];
    }
	public static void main(String[] args) throws IOException {
        Main main = new Main(Integer.parseInt(br.readLine()));

        for (int i = 0; i < main.arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    main.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(main.pop()+"\n");
                    break;
                case "size":
                    sb.append(main.size()+"\n");
                    break;
                case "empty":
                    sb.append(main.empty()+"\n");
                    break;
                case "top":
                    sb.append(main.top()+"\n");
                    break;
            }
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
