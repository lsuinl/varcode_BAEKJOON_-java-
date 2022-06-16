import java.util.Scanner;

public class b1475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        int[] suin= new int[10];

        int set=sc.nextInt();

        for(int i=10;i<=set*10;i*=10){
            suin[set%i/(i/10)]++;
        }
        suin[6]=suin[6]+suin[9];
        if(suin[6]%2==0)
            suin[6]/=2;
        else 
            suin[6]=suin[6]/2+1;
        suin[9]=0;

        for(int i=0;i<10;i++){
            if(count<suin[i])
                count=suin[i];
        }
        System.out.println(count);
        sc.close();
    }    
}
