import java.io.*;
import java.util.*;

public class Solution {
public static boolean armstrong(int a) {
        int sum = 0;
        for (int idx = a;idx >0;idx/=10) {
            int digit = idx %10;
            int cube = digit * digit * digit;
            sum += cube;
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i=1;i<=t;i++) {
            int n = scn.nextInt();
            
            boolean result = armstrong(n);
            System.out.println(result);
        }
    }
}
