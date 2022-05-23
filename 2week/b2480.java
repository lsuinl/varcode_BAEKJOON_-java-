import java.util.Scanner;


public class b2480 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int result;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        sc.close();
        if(a==b && b==c)
            result=10000+(a*1000);
        else if(a==b || b==c || c==a){
            if(a==b||b==c)
                result=1000+(b*100);
            else    
                result=1000+(c*100);
        }
        else{
            result=Math.max(a,Math.max(b,c));
            result=result*100;
        }
        System.out.println(result);
        
    }
}
