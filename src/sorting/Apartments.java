package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apartments {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);

		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		String[] aInput = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(aInput[i]));
		}

		String[] bInput = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			b.add(Integer.parseInt(bInput[i]));
		}

		Collections.sort(a);
		Collections.sort(b);

		int result = 0;
		int i = 0;
		int j = 0;

		while (i < n && j < m) {
			if (Math.abs(a.get(i) - b.get(j)) <= k) {
				result++;
				i++;
				j++;
			} else if (a.get(i) < b.get(j)) {
				i++;
			} else {
				j++;
			}
		}

		bw.write(Integer.toString(result));
		bw.flush();
	}
}
