
// class SafeArray{
//     private int a[];
//     public int length;

//     public SafeArray(int size){
//         a = new int[size];
//         length=size;
//     }
//     public int get(int index){
//         if(index>=0 && index<length){
//             return a[index];
//         }
//         return -1;
//     }
//     public void put(int index, int value){
//         if(index >=0 && index<length){
//             a[index]=value;
//         }else
//             System.out.println("잘못된 인덱스"+index);
//     }
// }
// public class test1 {
//     public static void main(String[] args){
//         SafeArray array= new SafeArray(3);

//         for(int i=0;i<(array.length+1);i++){
//             array.put(i,i*10);
//         }
//         System.out.print(array.get(1));
//     }
// }

import java.util.Scanner;

public class test1{
    public static void main(String[] args){
        String[][] gugudan = new String[11][9];

        System.out.print("몇단을 출력할까요");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int k=2; k<gugudan.length+1; k++){
            for(int m=1; m<gugudan.length; m++){
                gugudan[k-2][m-1] = k + "*" + m + "=" + k*m;
            }
        }

        for(int n=1; n<gugudan.length+1; n++)
            System.out.println(gugudan[num-2][n-1]);
    }
}