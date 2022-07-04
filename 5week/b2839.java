import java.util.Scanner;

public class b2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer, n, result = -1;
        n = sc.nextInt();
        for (int i = 0; i <= (n / 5); i++) {
            answer = n - 5 * i; // 5로 먼저 나누기

            if (answer >= 3)
                answer = (answer % 3 == 0) ? (answer / 3 + i) : -1; // 3으로 나누면 0인지 확인 후, 저장
            else if (answer == 0)
                answer = i;
            else
                answer = -1;

            if (answer != -1)
                result = result != -1 ? Math.min(result, answer) : answer;
        }
        System.out.println(result);
        sc.close();
    }
}
