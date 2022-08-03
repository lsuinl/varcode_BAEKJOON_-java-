import java.util.Scanner;

public class b10816 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 가지고 있는 카드
        int n = sc.nextInt();
        System.out.println("야");
        // 카드입력받기
        String input = sc.nextLine();
        System.out.println("야");
        String[] suin=input.split(" ",n);
        System.out.println("야");
        int m = sc.nextInt();
        System.out.println("야");
        input = sc.nextLine();
        System.out.println("야");
        String[] compare = input.split(" ", m);
        System.out.println("야");
        int[] result;
        System.out.println("야");
        result= new int[m]; //결과 
        System.out.println("야");


        //compare의 i번째와 모든 suin의 값을 비교하며 같으면 
        //1번째 result에 1증가
        for(int i=0;i<compare.length;i++){
            for(String e: suin){
                if(compare[i] == e)
                    result[i]++;
            }
        }
        System.out.println(result);
        sc.close();
    }

}
