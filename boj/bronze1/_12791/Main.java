package bronze1._12791;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Starman

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        DBList dbl = new DBList();
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            StringBuilder sb2 = new StringBuilder();
            int count=0;
            String[] temp = br.readLine().split(" ");
            int s = Integer.parseInt(temp[0])-1967;
            int e = Integer.parseInt(temp[1])-1967;

            if(e>=0){
                if(s<0) s=0;

                for (int j = s; j < e+1; j++) {
                    if(dbl.sA[j]!=null && dbl.sA[j].length()>0){
                        String[] temp2 = dbl.sA[j].split(" ");
                        if(temp2.length>1){
                            count+=2;
                            sb2.append(j+1967).append(" ").append(temp2[0]).append("\n");
                            sb2.append(j+1967).append(" ").append(temp2[1]).append("\n");
                        }else{
                            count++;
                            sb2.append(j+1967).append(" ").append(temp2[0]).append("\n");
                        }
                    }
                }
            }
            sb.append(count).append("\n").append(sb2);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class DBList{
    private String str = 
    "1967 DavidBowie\n1969 SpaceOddity\n1970 TheManWhoSoldTheWorld\n1971 HunkyDory\n1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars\n1973 AladdinSane\n1973 PinUps\n1974 DiamondDogs\n1975 YoungAmericans\n1976 StationToStation\n1977 Low\n1977 Heroes\n1979 Lodger\n1980 ScaryMonstersAndSuperCreeps\n1983 LetsDance\n1984 Tonight\n1987 NeverLetMeDown\n1993 BlackTieWhiteNoise\n1995 1.Outside\n1997 Earthling\n1999 Hours\n2002 Heathen\n2003 Reality\n2013 TheNextDay\n2016 BlackStar\n";
    private int len;
    private static String[] temp;
    protected static String[] sA;
    
    DBList(){
        temp = str.split("\n");
        len = temp.length;
        sA = new String[len+30];
        devide();
    }

    private void devide(){
        for (int i = 0; i < len; i++) {
            String[] temp2 = temp[i].split(" ");
            int num = Integer.parseInt(temp2[0])-1967;
            if(sA[num] != null && sA[num].length() > 0) sA[num] += " " + temp2[1];
            else sA[num] = temp2[1];
        }
    }
}