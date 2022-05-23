//프로그래머스 문제: 1단계.신규 아이디 추천
//정규표현식 공부, 줄여보기 https://velog.io/@daehong770/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%97%B0%EC%8A%B5-Level-1-%EB%A1%9C%EB%98%90%EC%9D%98-%EC%B5%9C%EA%B3%A0-%EC%88%9C%EC%9C%84%EC%99%80-%EC%8B%A0%EA%B7%9C-%EC%95%84%EC%9D%B4%EB%94%94-%EC%9E%90%EB%B0%94-Java

public class class0517 {
    public static void main(String[] args){  
        
        class Solution {
            public String solution(String new_id) {
                //1단계
                String answer =new_id.toLowerCase();
                //2단계
                for(int i=0; i<answer.length();i++){
                    int a=answer.charAt(i);
                    
                    if( (96<a && 123>a) || (47<a && 58>a) ||a==95 || a==45 ||a==46){
                    }
                    else
                    {
                        answer=answer.replace(answer.charAt(i), ' ');
                    }
                    
                }
                answer=answer.replaceAll(" ","");
                
                //3단계
                while(answer.contains("..")){
                    answer=answer.replace("..", ".");
                }
                //4단계
                while(answer.charAt(0)=='.' || answer.charAt(answer.length()-1)=='.'){
                    if(answer.length()<=1){
                        answer="";
                        break;
                    }
                    if(answer.charAt(0)=='.')
                        answer=answer.substring(1, answer.length());
                    else
                        answer=answer.substring(0, answer.length()-1);
                }
                //5단계
                if(answer.isEmpty())
                    answer="a";
                //6단계
                if(answer.length()>=16){
                    answer=answer.substring(0,15);
                } 
                while(answer.charAt(answer.length()-1)=='.'){
                    answer=answer.substring(0, answer.length()-1);
                }
                //7단계
                while(answer.length()<3){
                    answer+=answer.charAt(answer.length()-1);
                }
                
                return answer;
            }
        }
    }
}