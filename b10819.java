import java.util.Scanner;
public class b10819 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=0;
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt(); 
        }
        //for 문 
        //배열 수 바꾸기
        int sum=0;
        for(int i=1;i<n;i++){
            sum+=Math.abs(array[i-1]-array[i]);
        }
        max= max>sum?max:sum;
    }
    
}
