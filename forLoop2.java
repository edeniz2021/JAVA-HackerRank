import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp;
            temp= a + b;
        for(int j=0;j<n;j++){
            System.out.print(temp + " ");
            b = b * 2;
            temp = temp + b;
        }
        System.out.println();
        }
        in.close();
    }
}
