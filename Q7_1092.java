/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1092/
 */

import java.io.*;
import java.util.*;

public class Q7_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());

        if((n * (n + 1)) % 4 != 0) {
            out.write("NO\n");
            out.flush();
        } else {
            List<Integer> set1 = new ArrayList<Integer>();
            List<Integer> set2 = new ArrayList<Integer>();
 
            int a = 0;
            if(n % 4 != 0) {
                a = 3;
                set1.add(1);
                set1.add(2);
                set2.add(3);
            }
            for(int i = 1 + a; i <= n / 4 + a; i ++) {
                set1.add(i);
            }
            for(int i = n; i > n - n / 4; i --) {
                set1.add(i);
            }
            for(int i = n / 4 + a + 1; i <= n - n / 4; i ++) {
                set2.add(i);
            }
 
            out.write("YES\n");
            out.write(set1.size() + "\n");
            for(int i = 0; i < set1.size(); i++) {
                out.write(set1.get(i) + " ");
            }
 
            out.write("\n" + set2.size() + "\n");
            for(int i = 0; i < set2.size(); i ++) {
                out.write(set2.get(i) + " ");
            }
            out.flush();
        }
    }
}
