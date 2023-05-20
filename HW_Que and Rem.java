import java.io.*;
import java.util.*;

public class Solution {

    public static int remainder(int a,int b) {
        return a/b;
    }
    
    public static int modulo(int a,int b) {
        return a%b;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(remainder(a,b)+" "+ modulo(a,b));
    }
}
