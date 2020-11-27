/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      String str = "abcd123dc1234sd12345678";
        printMaxLongNumberStr(str);
    }

    private static void printMaxLongNumberStr(String str) {
        int index = 0;
        ArrayList<ArrayList<Character>> lists = new ArrayList<>();
        while(index < str.length()){
            while(isNum(str.charAt(index)) && index < str.length()){
                ArrayList<Character> list = new ArrayList<>();
                System.out.println(str.charAt(index));
               list.add(str.charAt(index));
               index++;
            }
           /// System.out.println(list.toString());
            lists.add(list);
            index++;
        }
        System.out.println(lists.toString());
        int max = lists.get(0).size();
        int point = 0;
        for (int i = 0; i < lists.size(); i++) {
            if(lists.get(i).size() > max){
                max = lists.get(i).size();
                point = i;
            }
        }
        System.out.println(lists.get(point).toString());
    }

    private static boolean isNum(char c) {
        if('0' <= c && c <= '9'){
            return true;
        }
        return false;
    }
}*/

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String str = scan.nextLine();
            int count = 0,max = 0,end = 0;
            for(int i = 0; i < str.length();i++){
                if(str.charAt(i)>= '0' && str.charAt(i) <= '9'){
                    count++;
                    if(count > max){
                        max = count;
                        end = i;
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            deletContions(str1,str2);
        }
    }
    public static void deletContions(String str1,String str2){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str2.length();i++){
            set.add(str2.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str1.length(); i++){
            char ret = str1.charAt(i);
            if(!set.contains(ret)){
                sb.append(ret);
            }
        }
        System.out.println(sb.toString());
    }
}