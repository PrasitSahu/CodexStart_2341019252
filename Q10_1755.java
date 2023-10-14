/*
 * Name: Prasit Sahu
 * Reg No: 2341019252
 * PS LINK: https://cses.fi/problemset/task/1755/
 */

import java.io.*;
import java.util.HashSet;

public class Q10_1755 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String sequence = in.readLine();
        StringBuilder seq1 = new StringBuilder();
        StringBuilder seq2 = new StringBuilder();
        StringBuilder alone = new StringBuilder();
        HashSet<Integer> usedIndices = new HashSet<>();
        boolean isPossible = true;

        for (int i = 0; i < sequence.length(); i++) {
            if (usedIndices.contains(i)) {
                continue;
            }
            char ch = sequence.charAt(i);
            int indexC = sequence.indexOf(ch, i + 1);
            if (indexC > 0 && !usedIndices.contains(indexC)) {
                seq1.append(ch);
                seq2.append(sequence.charAt(indexC));
                usedIndices.add(i);
                usedIndices.add(indexC);
            } else if (alone.length() == 0) {
                alone.append(ch);
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            out.write(seq1 + alone.toString() + seq2.reverse() + "\n");
        } else {
            out.write("NO SOLUTION\n");
        }
        out.flush();
    }
}

