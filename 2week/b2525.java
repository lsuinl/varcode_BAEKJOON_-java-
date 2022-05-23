import java.util.Scanner;

public class b2525 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //현재 시, 분
        int hour=sc.nextInt();
        int min=sc.nextInt();
        int need=sc.nextInt();

        sc.close();
        if(min+need%60>=60){
            min=min+need%60-60;
            hour++;
        }
        else
            min=min+need%60;

        hour=hour+need/60>=24 ? (hour+need/60-24):(hour+need/60);
        System.out.print(hour);
        System.out.print(" ");
        System.out.print(min);
        
    }
}
