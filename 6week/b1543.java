import java.util.Scanner;

public class b1543 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String n="";
        String hint="";
        n= sc.nextLine();
        hint=sc.nextLine(); 
        
        int result=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==hint.charAt(0)){
                int count=0;
                for(int j=0;j<hint.length();j++){
                    if((i+j<n.length()) && (n.charAt(i+j)==hint.charAt(j)))
                        count++;
                }
                if(count==hint.length()){
                    result++;
                    i=i+hint.length()-1;
                }
            }
        }
        System.out.println(result);
    }
}
