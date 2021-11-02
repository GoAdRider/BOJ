package basic._10845;

// 코드 출처 : https://st-lab.tistory.com/183

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2<E> {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();

    private static final int DEFAULT_CAPACITY = 64;
    private Object[] arr;
    private int componentSize;

    private int rear;
    private int front;

    public Main2(){
        this.arr = new Object[DEFAULT_CAPACITY];
        this.componentSize = 0;
        this.rear = 0;
        this.front = 0;
    }

    public Main2(int capacity){
        this.arr = new Object[capacity];
        this.componentSize = 0;
        this.rear = 0;
        this.front = 0;
    }

    public static void main(String[] args) throws IOException {
        Main2 main = new Main2(Integer.parseInt(br.readLine()));

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
                case "front":
                    sb.append(main.front()+"\n");
                    break;
                case "back":
                    sb.append(main.back()+"\n");
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private void resize(int newCapacity) {

        int arrayCapacity = arr.length; // 현재 용적 크기

        Object[] newArray = new Object[newCapacity]; // 용적을 변경한 배열

        /*
         * i = new array index 
         * j = original array 
         * index 요소 개수(size)만큼 새 배열에 값 복사
         */
        for (int i = 1, j = front + 1; i <= componentSize; i++, j++) {
            newArray[i] = arr[j % arrayCapacity];
        }

        this.arr = null;
        this.arr = newArray; // 새 배열을 기존 array의 배열로 덮어씌움

        front = 0;
        rear = componentSize;
    }

    private boolean push(E item){
	// 용적이 가득 찼을 경우 
	if((rear + 1) % arr.length == front) {
		resize(arr.length * 2);	// 용적을 두 배 늘려준다. 
	}
		
	rear = (rear + 1) % arr.length;	// rear을 rear의 다음 위치로 갱신 
		
	arr[rear] = item;
	componentSize++;	// 사이즈 1 증가 
		
	return true;
    }

    private E pop(){
        if(componentSize == 0){
            return (E)new Integer(-1);
        }
        front = (front + 1) % arr.length; // front 를 한 칸 옮긴다.
		
        @SuppressWarnings("unchecked")
        E item = (E) arr[front];	// 반환할 데이터 임시 저장 
        
        arr[front] = null;	// 해당 front의 데이터 삭제
        componentSize--;	// 사이즈 감소 
            
            
        // 용적이 최소 크기(64)보다 크고 요소 개수가 1/4 미만일 경우
        if(arr.length > DEFAULT_CAPACITY && componentSize < (arr.length / 4)) {

            // 아무리 작아도 최소용적 미만으로 줄이지는 않도록 한다. 
            resize(Math.max(DEFAULT_CAPACITY, arr.length / 2));
        }

        return item;
    }

    private E front(){
        if(componentSize == 0){
            return (E)new Integer(-1);
        }

        @SuppressWarnings("unchecked")
        E item = (E) arr[(front + 1) % arr.length];
        return item;
    }

    private int size(){
        return this.componentSize;
    }

    private int empty(){
        if(size()==0){
            return 1;
        }else{
            return 0;
        }
    }

    private int back(){
        if(size()!=0){
            return rear;
        }else{
            return -1;
        }
    }
}