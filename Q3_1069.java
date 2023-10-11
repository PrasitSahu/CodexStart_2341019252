/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1069/
 */

import java.util.Scanner;

public class Q3_1069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sequence = in.nextLine();
        int count = 1, prevCount = 0;

        if(sequence.length() == 1){
            prevCount = 1;
        } else {
            for(int i = 0; i < sequence.length() - 1; i ++ ){
                if(sequence.charAt(i) == sequence.charAt(i + 1)){
                    count ++;
                } else {
                    count = 1;
                }
                prevCount = Math.max(prevCount, count);
            }
        }

        System.out.println(prevCount);

    }
}
