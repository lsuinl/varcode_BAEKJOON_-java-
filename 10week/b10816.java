import java.util.*;
import java.io.*;

public class b10816 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m =Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] suin = input.split(" ");

        m = Integer.parseInt(br.readLine());
        input = br.readLine();
        String[] compare = input.split(" ");
        
        for (int i = 0; i < m; i++)
            bw.write(Collections.frequency(Arrays.asList(suin), compare[i]) + " ");
        bw.flush();
        bw.close();
    }
}
