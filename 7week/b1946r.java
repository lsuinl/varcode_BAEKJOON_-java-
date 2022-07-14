import java.util.Scanner;

public class b1946r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a,result = 1;
            int[] b = new int[n];
            
            // 입력받기
            for (int j = 0; j < n; j++) {
                a = sc.nextInt();
                b[a-1] = sc.nextInt();
            }
            int cutline=b[0];
            for (int j = 1; j < n; j++) {
                if(cutline>b[j]){
                    result++;
                    cutline=b[j];
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}