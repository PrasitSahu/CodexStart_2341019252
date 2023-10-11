/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1068/
 */

import java.util.Scanner;

public class Q1_1068{
    public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            long n = Integer.parseInt(in.nextLine());

            while(n != 1){
                System.out.print(n + " ");
                if(n % 2 == 0){
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
            }
            System.out.print(n);
    }
}