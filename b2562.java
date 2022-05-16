import java.util.Scanner; //입력받을 수 있도록 호출

public class b2562 { 
    public static void main(String[] args){  
        int[] number= new int[9];
        int maxx=0, line=0;
        
        Scanner sc =new Scanner(System.in); //sc라는 객체에 system.in 으로 입력한 값을 읽어 저장

        for(int i=0;i<9;i++){
            number[i]=sc.nextInt();
            if(number[i]>maxx)
                maxx=number[i];
        }
        sc.close();
        for(int i=0;i<9;i++){
            if(number[i]==maxx){
                line=i+1;
                break;
            }
        }
        System.out.println(maxx);
        System.out.println(line);


    }
}
