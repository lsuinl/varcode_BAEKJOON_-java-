import java.util.Scanner;

public class b2439 {
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();//개행
        }

        sc.close();
        //숫자를 입력받음
        //입력받은 숫자만큼 반복하는 반복문
        //입력받은 횟수-i만큼 공백, i만큼  별 출력
    }
}