import java.util.Scanner;

public class b2810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        String suin = sc.next();
        int result = 0;
        suin = suin.replaceAll("S", "*S*");
        suin = suin.replaceAll("LL", "*LL*");
        while (suin.contains("**"))
            suin = suin.replace("**", "*");

        for (int i = 0; i < suin.length(); i++) {
            if (suin.charAt(i) == '*')
                result++;
        }
        result = result > people ? people : result;

        System.out.println(result);

        sc.close();
    }
}