import java.io.*;
import java.util.*;

public class answer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //숫자 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine()); // 값 입력받기

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(); //Hash 선언
        for (int i = 0; i < n; i++) { //값의 길이만큼 검사
            int input = Integer.parseInt(st.nextToken()); //공백으로 나눈 문자열의 값을 정수형으로 바꿔서 저장.
            // 해당 key값에 저장된 value가 null이면 1을 대입 아니면 +1을 해준다.
            if (hash.get(input) == null) //저장된 값이 Hash에 존재하는지 검사
                hash.put(input, 1); //존재하지 않는다면 key에 값을, value에 1을 저장
            else
                hash.put(input, hash.get(input) + 1); //존재하는 경우에는 해당 값(key)의 value에 1을 더해서 저장
        }

        n = Integer.parseInt(br.readLine()); //숫자 입력받기
        st = new StringTokenizer(br.readLine()); //값 입력받기

        StringBuilder sb = new StringBuilder(); //최종 결과를 입력받을 문자열 생성
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (hash.get(input) == null)// 해당 key값에 저장된 value가 null이면 0을 sb에 저장해준다.
                sb.append(0).append(" ");
            else
                sb.append(hash.get(input)).append(" "); //null이 아니면 해당 값을 저장.
        }
        System.out.println(sb);
    }

}