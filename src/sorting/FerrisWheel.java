package sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FerrisWheel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);

		List<Integer> p = new ArrayList<>();
		String[] pInput = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			p.add(Integer.parseInt(pInput[i]));
		}

		Collections.sort(p);

		int gondolas = 0;
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			if (p.get(left) + p.get(right) <= x) {
				left++;
			}
			right--;
			gondolas++;
		}

		bw.write(Integer.toString(gondolas));
		bw.flush();
	}
}
