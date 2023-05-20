import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=1;i<=n;i++) {
            int val = scn.nextInt();
            
            int res = 0;
            
            while (val > 0) {
                int digit = val % 10;
                res = (res*10) + digit;
                val = val/10;
            }
            System.out.println(res);
        }
        
    }
}
