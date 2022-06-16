import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-2161%EB%B2%88-%EC%B9%B4%EB%93%9C1-%EC%9E%90%EB%B0%94Java
public class b2161 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        Queue<Integer> que= new LinkedList<>();
        
        for(int i=1;i<=n;i++) que.add(i);
        String a="";
        while(que.size()!=1){
            a+= que.poll().toString()+" ";
            que.add(que.poll());
        }
        System.out.println(a+que.poll());
        sc.close();
    }

}
