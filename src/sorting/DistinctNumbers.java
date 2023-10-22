package sorting;

import java.io.*;
import java.util.HashSet;

public class DistinctNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> distinctNumbers = new HashSet<>();

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			distinctNumbers.add(Integer.parseInt(input[i]));
		}

		bw.write(Integer.toString(distinctNumbers.size()));
		bw.flush();
	}
}
