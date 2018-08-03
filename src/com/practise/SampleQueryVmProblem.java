package com.practise;

public class SampleQueryVmProblem {

	public static void main(String[] args) {
		int arr1[] = {1,2,4,2};
		int arr2[] = {2,4};
		
		int rs[] = countBiggerNumbers(arr1, arr2);
		for (int i : rs){
			System.out.println(i);
		}
	}

	private static int[] countBiggerNumbers(int[] arr1, int[] arr2) {
		int finalArray[] = new int[arr2.length];
		for (int  i=0; i< arr2.length; i++){
			int count =0;
			for (int j=0 ; j< arr1.length; j++){
				if (arr1[j] <= arr2[i]){
					count++;
				}
			}
			finalArray[i] = count;
		}
		return finalArray;
	}

}
