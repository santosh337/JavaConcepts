import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rem = 0;
        int rev = 0;
        while(n!= 0) {
            rem = n%10;
            rev = rev * 10 + rem;
            System.out.println(rem);
            n = n/10;
        }
    }
}
