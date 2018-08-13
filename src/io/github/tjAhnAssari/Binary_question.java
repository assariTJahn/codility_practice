package io.github.tjAhnAssari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary_question {

	public int maxZeroLength(int num) {
		String binStr = Integer.toBinaryString(num);
		List<Integer> buffer = new ArrayList<>();
		List<Integer> count = new ArrayList<>();

		System.out.println(binStr);
		for (int i = 0; i < binStr.length(); i++) {
			if (binStr.charAt(i) == '1') {
				buffer.add(i);
			}
		}

		for (int n = 1; n < buffer.size(); n++) {
			count.add(buffer.get(n) - buffer.get(n - 1) - 1);
		}

		return count.size()>0?Collections.max(count):0;
	}
	
	
	public static void main(String[] args) {
		Binary_question bq = new Binary_question();
		int num = 16;
		
		int result = bq.maxZeroLength(num);
		
		System.out.println(result);
	}
}
