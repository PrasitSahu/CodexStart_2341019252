/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1072/
 */

import java.util.Scanner;

public class Q6_1072 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        for(long i = 1; i <= n; i ++){
            long ways = ((i * i * ((i * i) - 1)) / 2) - 4 * (i - 2) * (i - 1);
            System.out.println(ways);
        }
    }
}
