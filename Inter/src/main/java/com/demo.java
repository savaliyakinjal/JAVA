package com;

import java.util.ArrayList;

public class demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(20);
		al.add(50);
		al.add(10);
		al.add(60);
		al.add(7);
		System.out.println("Unsorted Arraylist:");
		System.out.println(al);
		int count = al.size();
		String temp;
		Object[] arr = al.toArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				int a=(int) arr[i];
				int b=(int) arr[j];
				if (a>b) {
					tmp = (int) arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}
}
