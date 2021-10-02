package bronze1._1268;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FailFuckingStupidQuestion {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static int size;                    // 학생 수
    private static int[][] students;            // [학생s][학년]
    private static boolean[][] whoSame;         // [같은반이있다면?][학년]
    private static int[] countArr;              // key : value = [몇번학생] : 몇번 같은반 친구 있었음?
    public static void main(String[] args) {
        process();
    }
    
    static void process() {
        initialize();
        solve();
        result();
    }

    static void solve(){
        for (int i = 0; i < 5; i++) {                               // i : 학년
            compareStudent(i);
        }
    }

    static void compareStudent(int level){                          // level : 학년
        for (int j = 0; j < size; j++) {                            // j : from 비교 주체
            for (int k = j+1; k < size; k++) {                      // k : with 누구랑 비교
                if(students[j][level] == students[k][level]){       // 비교주체 == 누구랑비교 ? 
                    whoSame[j][level] = true;                       // 비교주체, 비교하는 사람 같으면 true
                    whoSame[k][level] = true;
                }
            }
            if(whoSame[j][level]){                                  // 같은 학년이었던 적이 있는지?
                countArr[j]++;                                      // 그럼 가산점+ => countArr(j번 학생)
            }
        }
    }

    static void result(){
        int resultStudentSelection;
        resultStudentSelection = selectedStudent();
        try {
            bw.write(String.valueOf(resultStudentSelection));
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // countArr[] ? whichStudent = 몇번째 학생, value = 중복된 횟수
    static int selectedStudent(){
        int whoMaxCount = 0;
        int whoSelected = 1;
        for (int i = 0; i < size; i++) {
            if(whoMaxCount < countArr[i]){
                whoMaxCount = countArr[i];
                whoSelected = i+1;
            }
        }
        return whoSelected;
    }

    static void initialize(){
        try {
            size = Integer.parseInt(br.readLine());
            students = new int[size][5];
            countArr = new int[size];
            whoSame = new boolean[size][5];
            for (int i = 0; i < size; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    students[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}