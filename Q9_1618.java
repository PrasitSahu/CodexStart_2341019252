/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1618/
 */

import java.util.Scanner;

public class Q9_1618 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        long n = in.nextLong();
        long count = 0;

        while(n > 0) {
            count += n / 5;
            n /= 5;
        }
        System.out.println(count);
    }
}