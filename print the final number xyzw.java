import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val;
        String temp = "";
        for (int i=1;i<=n;i++) {
            val = scn.nextInt();
            temp += Integer.toString(val);
        }
        System.out.print(temp);
    }
}
