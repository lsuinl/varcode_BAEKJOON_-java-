import java.util.Scanner;

public class week2_practice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("초를 입력하세요.");
        int time= sc.nextInt();
        int sec=time%60;
        int min=time/60;
        System.out.println(time+"초는"+min+"분"+sec+"초입니다.");

        int x = 1, y = 1;
        int a = x++; // x의 값이 사용되기 전에 증가된다. a는 1가 된다.
        int b = ++y; // y의 값이 사용된 후에 증가된다. b는 2이 된다.
        System.out.println("a="+a+", b="+b);
        int c = 100, d = 200;
        c += 10; // c = c + 10
        d /= 10; // d = d / 10
        System.out.println("c="+c+", d="+d);
    }
}