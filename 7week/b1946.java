import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int result = 1;
            int[][] suin = new int[n][2];
            
            // 입력받기
            for (int j = 0; j < n; j++) {
                suin[j][0] = sc.nextInt();
                suin[j][1] = sc.nextInt();
            }
            // 서류 기준 정렬
            Arrays.sort(suin, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });

            int cutline = suin[0][1];
            for (int j = 1; j < n; j++) {
                if (suin[j][1] < cutline) {
                    result++;
                    cutline = suin[j][1];
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}