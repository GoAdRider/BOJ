package basic.datastructure200._1406;

// 스택을 이용한 풀이
// 커서를 기준으로 leftStack, rightStack 을 나눈다.
// 출력은 leftStack 에 있는 것들을 rightStack 에 옮기고 pop 한다.

// 계속 틀렸던 부분 : 문제는 조건이 60만이나 입력의 조건은 10만
// 추가로 들어오는 입력이 50만이 더 들어올수 있으니 (10+60)M 이니 60만으로 조건 일치함

// 스택 수정할 필요 있음. 현재 커스텀한 스택은 capacity 가 정적인 부분이나 동적으로 capacity 를 resize 해 줘야함

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

    private char[] arr;
    private int top = 0;

    public Main(){
        this.arr = new char[]{};
    }
    public Main(int stackSize){
        this.arr = new char[stackSize];
    }
	public static void main(String[] args) throws IOException {
        String word = br.readLine();
        int wordLen = word.length();
        Main left = new Main(600000);
        Main right = new Main(600000);

        for (int i = 0; i < wordLen; i++) {
            left.push(word.charAt(i));
        }

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if(!left.isEmpty())
                        right.push(left.pop());
                    break;
                case "D":
                    if(!right.isEmpty())
                        left.push(right.pop());
                    break;
                case "B":
                    if(!left.isEmpty())
                        left.pop();
                    break;
                case "P":
                    left.push(st.nextToken().charAt(0));
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        while(!right.isEmpty()){
            sb.append(right.pop());
        }
        

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private void push(char c){
        if(top < arr.length){
            arr[top++] = c;
        }
    }

    private char pop(){
        if(top > 0){
            return arr[--top];
        }else{
            throw new java.util.NoSuchElementException();
        }
    }

    private int size(){
        return this.top;
    }

    private boolean isEmpty(){
        if(this.top==0){
            return true;
        }else{
            return false;
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
