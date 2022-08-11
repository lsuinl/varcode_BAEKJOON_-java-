import java.util.HashSet;
import java.util.Scanner;

public class answer {
    static HashSet<String> set;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        set = new HashSet<String>();
        String name = "";

        for(int i=0;i<s.length();i++){
            name="";
            for(int j=i;j<s.length();j++){
                name+=s.substring(j,j+1);
                set.add(name);
            }
        }
        System.out.println(set.size());
    }
}
