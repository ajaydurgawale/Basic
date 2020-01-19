package com.csi.basic;

import java.util.HashMap;

class Test {
	void stringRev() {
		StringBuffer sb = new StringBuffer();
		sb.append("Ajay");
		sb.reverse();
		System.out.println(sb);
	}

	void stringRev2() {
		String str = "Samar";
		char[] c = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

	void swap() {
		int i = 4, j = 6, k;
		k = i;
		i = j;
		j = k;
		System.out.println("\n" + i + "" + j);
	}

	void swap1() {
		int i = 4, j = 5;
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println(i + "" + j);
	}

	void numberOfWords() {
		HashMap<String, Integer> hm = new HashMap<>();
		String str = "snvkmsdv";
		String[] ar = str.split("");
		for (int i = 0; i < ar.length; i++) {
			if(hm.containsKey(ar[i])){
				int count = 0;
			hm.put(ar[i],count);
			count++;
			}else{
				hm.put(ar[i],i);
			}
		}
		System.out.println(hm);
	}
}

public class ReverseStringWithoutStringMethod {
	public static void main(String[] args) {
		Test t = new Test();
		t.stringRev();
		t.stringRev2();
		t.swap();
		t.swap1();
		t.numberOfWords();
	}
}
