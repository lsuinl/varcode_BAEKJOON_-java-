import java.util.Scanner;

public class b2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        for(int i=0;i<n;i++){
            for(int j=m;j>0;j--){
            System.out.print("*");
            }
            m--;
            System.out.print("\n");
        }
    }
}
