package com.manCh007.example.array;

import java.util.HashMap;
import java.util.Map;

public class ArraySpecialQuestions {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5; arr[1] = 3; arr[2] = 4; arr[3] = 3; arr[4] = 5;
		System.out.print("Array is : ");
		for(int element : arr) {
			System.out.print(element);
		}
		System.out.println();
		
		// find duplicates
		findDuplicates(arr);
		
		// find if fibonacci 
		System.out.println("The array here is : "+ifFibonacci(arr));
	}

	private static void findDuplicates(int[] arr) {
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else 
				map.put(arr[i], (long) 1);
		}
		
		map.keySet().stream().forEach((x) -> {
			System.out.println("Value : "+x+" --> Occurance : "+map.get(x));
		});
	}
	
	private static String ifFibonacci(int[] arr) {
		int i=0, j=arr.length-1;
		while(i<j) {
			if(arr[i] != arr[j])
				return "Not Fibonacci";
			i++;
			j--;
		}
		return "Fibonacci";
	}

}
