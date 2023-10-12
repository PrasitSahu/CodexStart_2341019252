/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1070/
 */

import java.util.Scanner;

public class Q5_1070 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = Integer.parseInt(in.nextLine());
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        if(n < 4 && n != 1){
            System.out.println("NO SOLUTION");
        } else {
            for(int number = 1; number <= n; number ++){
                if(number % 2 == 0){
                    even.append(number).append("");
                } else {
                    odd.append(number).append(" ");
                }
            }
        }



        System.out.println(even.toString().strip() + " " + odd.toString().strip());
    }

    public static int[] csti(String[] list) {
        int[] fList = new int[list.length];
        int index = -1;
        for (String i : list) {
            index++;
            fList[index] = Integer.parseInt(i);
        }
        return fList;
    }

}
