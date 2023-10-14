/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1617/
 */

import java.io.*;

public class Q8_1617 {
    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());

        int count = 1;
        for(int i = 0; i < n; i ++) {
            count = (count * 2) % 1000000007;
        }

        out.write(count + "\n");
        out.flush();
    }
}
