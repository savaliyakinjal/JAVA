package Task_2;

import java.util.Arrays;

public class T2010_ParallelArraySort {
	public static void main(String[] args) {

		int arr[]= {10,50,84,120,4,51,1,0,70,15};
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("******** .sort() *********");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println("******** .parallelSort() *********");
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
