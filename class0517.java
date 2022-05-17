import java.util.Scanner;

public class class0517 {
    public static void main(String[] args){  
        String new_id;
        Scanner sc =new Scanner(System.in);
        new_id=sc.nextLine();
        
        //솔루션 함수

        //대소문자 치환
        new_id.toLowerCase();

        //문자 제외
        for(int i=0; i<new_id.length();i++){
            
        }

        //마침표 두개 하나로
        while(new_id.contains("..")){
            new_id=new_id.replaceAll("..", ".");
        }

        //마침표가 처음이나 끝에 위치하는지 확인
        while(new_id.charAt(0)=='.' || new_id.length()=='.'){
            if(new_id.charAt(0)=='.')
                new_id=new_id.substring(1, new_id.length());
            else
                new_id=new_id.substring(0, new_id.length()-1);
        }

        //빈 문자열인지 헉인
        if(new_id.isEmpty()){
            new_id="a";
        }

        //길이가 16자 이상인지 확인하고, 넘는다면 15개를 제외한 나머지 모두 제거
        if(new_id.length()>=16){
            new_id=new_id.substring(0,15);
        }

        //마침표가 끝에 있다면 끝에 마침표도 제거    
        while(new_id.length()=='.'){
            new_id=new_id.substring(0, new_id.length()-1);
        }

        //길이가 2자 이하면, 마지막 문자를 길이가 3이 될 때까지 붙임
        while(new_id.length()<=2){
            char a=new_id.charAt(new_id.length()-1);
            new_id=new_id+a;
        }

        sc.close();
    }    
}
//47줄?보다 적게 만들어 올 거임 니는 뒤졌다~