import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class b11478 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        StringTokenizer str= new StringTokenizer(br.readLine());

        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        for(int i=0;i<str.countTokens();i++){
            result+=str.countTokens()-i;
            String input =str.nextToken();

            
            if(hash.get(input)==null)
                hash.put(input, 1);
            else    
                result-=1;
        }
        System.out.println(result);
        }
    } 
