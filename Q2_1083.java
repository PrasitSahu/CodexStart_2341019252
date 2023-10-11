/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1083/
 */

import java.util.*;

public class Q2_1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int[] list = csti(in.nextLine().split(" "));
        Arrays.sort(list);

        for(int number = 1; number <= n; number ++){

            if(Arrays.binarySearch(list, number) < 0){
                System.out.println(number);
                break;
            }
        }

    }

    public static int[] csti(String[] list){
        int[] fList = new int[list.length + 1];
        int index = -1;
        for(String i: list){
            index ++;
            fList[index] = Integer.parseInt(i);

        }
        return fList;
    }
}
