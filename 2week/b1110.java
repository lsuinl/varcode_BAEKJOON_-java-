import java.util.Scanner;

public class b1110 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number, a, b, count=0, result, suin;
        number=sc.nextInt();
        if(number<10){
            a=0;
            b=number;
        }
        a=number/10;
        b=number%10;
        
        do{
            suin=a+b;
            a=b;
            b=suin%10;
            result=a*10+b;
            count++;
        }while(result!=number);
        
        System.out.println(count);
        
        sc.close();
    }
}
