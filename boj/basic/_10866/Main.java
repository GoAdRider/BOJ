package basic._10866;

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

    public static void main(String[] args) throws IOException {
        Queue queue = new Queue(Integer.parseInt(br.readLine()));
        int size = queue.length();

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    queue.pushFront(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    queue.pushBack(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(queue.popFront()+"\n");
                    break;
                case "pop_back":
                    sb.append(queue.popBack()+"\n");
                    break;
                case "size":
                    sb.append(queue.size()+"\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()+"\n");
                    break;
                case "front":
                    sb.append(queue.printFront()+"\n");
                    break;
                case "back":
                    sb.append(queue.printBack()+"\n");
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

    protected int isEmpty(){
        if(size()==0){
            return 1;
        }else{
            return 0;
        }
    }

    protected void resize(){
        int size = componentNum;
        int[] newArr = new int[length()*2];
        int j =1;
        while (size-- != 0) {
            newArr[j++] = intArr[(++front)%length()];
        }
        intArr = newArr;
        front = 0;
        rear = size()+1;
    }

    protected void pushBack(int num){
        if((rear+1)%length() == front){
            resize();
        }

        intArr[rear++] = num;
        rear = rear%length();
        componentNum++;
    }

    protected void pushFront(int num){
        int frontCheck = (front-1 < 0 ) ? length()-1 : front-1;
        if(frontCheck == rear){
            resize();
        }

        intArr[front--] = num;
        front = (front < 0 ) ? length()-1 : front;
        componentNum++;
    }

    protected int popFront(){
        if(size()==0){
            return -1;
        }else{
            componentNum--;
            front = (front+1)%length();
            return intArr[front];
        }
    }

    protected int popBack(){
        if(size()==0){
            return -1;
        }else{
            componentNum--;
            rear = rear-1 < 0 ? length()-1 : rear-1;
            return intArr[rear];
        }
    }

    protected int printFront(){
        if(size() != 0){
            return intArr[(front+1)%length()];
        }else{
            return -1;
        }
    }

    protected int printBack(){
        if(size() != 0){
            return intArr[rear-1 < 0 ? length()-1 : rear-1];
        }else{
            return -1;
        }
    }
}
