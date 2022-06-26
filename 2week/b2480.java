import java.util.Scanner;


public class b2480 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int result=0, n, lucky=0;

        n=sc.nextInt();

        int[] num= new int[n];
        
        for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
        }
        sc.close();
        
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    result= (result>num[i]) ? result:num[i];
                }
            }
        }

        for(int i=0; i<n;i++){
            if(num[i]==result)
                lucky++;
        }

        if(lucky>=3)
            result=10000+(result*1000);
        else if(lucky==2)
            result=1000+(result*100);
        else {
            for(int i=1;i<=n;i++)
                result = Math.max(num[i],num[i-1]);
            result=result*100;
        }

        System.out.println(result);
    }
}
