import java.util.Scanner;

public class b1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;

        int n=sc.nextInt();
        //입력받기 반복
        for(int i=0; i<n;i++){
            String suin =sc.next();
            //검사하기
            int[] abc = new int[26];

            abc[suin.charAt(0)-97]++;
            for(int j=1;j<suin.length();j++){
                if(suin.charAt(j-1)!=suin.charAt(j)){
                    if(abc[suin.charAt(j)-97]==1){
                        count++;
                        break;
                    }
                    else
                        abc[suin.charAt(j)-97]++;
                }
            }
        }
        System.out.println(n-count);
        sc.close();
    }
}
