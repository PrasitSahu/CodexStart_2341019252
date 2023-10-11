/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1094/
 */

import java.util.Scanner;

public class Q4_1094 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        long[] numbs = csti(in.nextLine().split(" "));
        long moves = 0;

        for(int i = 1; i < n; i ++) {
            if(numbs[i] < numbs[i - 1]){
                long diff = numbs[i - 1] - numbs[i];
                moves += diff;
                numbs[i] += diff;
            }
        }
        System.out.println(moves);
    }

    public static long[] csti(String[] list) {
        long[] fList = new long[list.length];
        int index = -1;
        for (String i : list) {
            index++;
            fList[index] = Integer.parseInt(i);
        }
        return fList;
    }
}
