package basic.datastructure200._10845;

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
        Queue queue = new Queue(Integer.parseInt(br.readLine()));

        for (int i = 0; i < queue.length(); i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(queue.pop()+"\n");
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    sb.append(queue.empty()+"\n");
                    break;
                case "front":
                    sb.append(queue.front()+"\n");
                    break;
                case "back":
                    sb.append(queue.back()+"\n");
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class Queue{
    int[] intArr;
    int componentNum;
    int front;
    int rear;

    public Queue(int capacity) {
        intArr = new int[capacity];
        this.componentNum = 0;
        this.front = 0;
        this.rear = 1;
    }

    protected int length(){
        return this.intArr.length;
    }

    protected int size(){
        return this.componentNum;
    }

    protected void resize(){
        intArr = Arrays.copyOf(intArr, size()*2);
        front = 0;
        rear = size()+1;
    }

    protected void push(int num){

        if((rear+1)%length() == front){
            resize();
        }

        intArr[(rear++)%length()] = num;
        componentNum++;
    }

    protected int pop(){
        if(size() == 0){
            return -1;
        }else{
            componentNum--;
            return intArr[(++front)%length()];
        }
    }

    protected int empty(){
        if(size() == 0){
            return 1;
        }else{
            return 0;
        }
    }

    protected int front(){
        if(size() != 0){
            return intArr[(front+1)%length()];
        }else{
            return -1;
        }
    }

    protected int back(){
        if(size() != 0){
            return intArr[rear-1 < 0 ? length()-1 : rear-1];
        }else{
            return -1;
        }
    }
}
