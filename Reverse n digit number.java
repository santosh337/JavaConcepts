import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = 0;
        int rev = 0;
        
        for (int i=1;i<=n;i++) {
            int digit = scn.nextInt();
            res = res*10 + digit;
        }
        System.out.println(res);
        
        while (res > 0) {
            int rem = res%10;
            rev = rev * 10 + rem;
            res /= 10;
        }
        System.out.println(rev);
    }
}
