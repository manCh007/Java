package com.manCh007.example.array;

public class ArrayFunctions {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 5; arr[1] = 3; arr[2] = 4; arr[3] = 2; arr[4] = 9;
		System.out.print("Array is : ");
		for(int element : arr) {
			System.out.print(element);
		}
		
		// Sort array
		bubbleSort(arr);
		selectionSort(arr);
		insertionSort(arr);
		System.out.println();
		mergeSort(arr, 0, arr.length-1);
		System.out.print("Sorted Array (merge) is : ");
		for(int element : arr) {
			System.out.print(element);
		}
		System.out.println();
		quickSort(arr, 0, arr.length-1);
		System.out.print("Sorted Array (Quick) is : ");
		for(int element : arr) {
			System.out.print(element);
		}
		System.out.println();

	}
	
	// Take a pivot from left to right find the number bigger than pivot and from right 
	// find the number lesser than pivot. once found swap them
	// Complexity : Best Case O(nlogn)
	
	private static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int pivot = partition(arr, l, h);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, h);
		}
		
	}
	
	private static int partition(int[] arr, int l, int h) {
		int pivot = arr[l];
		int i = l, j = h;
		
		while(i<j) {
			while(arr[i]<=pivot) i++;
			while(arr[j]>pivot) j--;
			if(i<j)
				arr = swap(arr, i, j);
			
		}
		if(i>j)
			arr = swap(arr, j, l);
		return j;
	}
	
	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return arr;
		
	}

	//In this the array was divided into two parts until the smallest block then was
	// sorted while merging back into the main array
	// Complexity O(nlogn)

	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		
		int n1 = (mid-left)+1;
		int n2 = right-mid;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int p = 0; p<n1; p++) {
			l[p] = arr[left+p];
		}
		
		for(int p = 0; p<n2; p++) {
			r[p] = arr[mid +1 +p];
		}
		
		int i=0, j=0, k=left; 
		while(i<n1 && j<n2) { 
			if(l[i]<=r[j]) { 
				arr[k] = l[i]; 
				i++; 
			}
			else {
				arr[k] = r[j];
				j++;
			}
			k++; 
		}
		
		while(i<n1) {
			arr[k]=l[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
		
	}
	
	//one by one check if the next one is bigger than the one you are on if yes swap and continue 
	// Until the correct place for the element is found
	//Complexity O(n^2)

	private static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				int temp = arr[j];
				arr[j] = key;
				arr[j+1] = temp;
				j=j-1;
			}
			arr[j+1] = key;
		}
		System.out.println();
		System.out.print("Sorted Array (insertion) is : ");
		for(int element : arr) {
			System.out.print(element);
		}
	}
	
	// Find the minimum and swap with index 0 and continue while increasing the index
	// Complexity O(n^2)

	private static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min_idx = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_idx])
					min_idx = j;
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		System.out.println();
		System.out.print("Sorted Array (Selection) is : ");
		for(int element : arr) {
			System.out.print(element);
		}
	}

	// Take one element and swap with the next element and continue that
	// Complexity O(n^2)
	
	private static void bubbleSort(int[] arr) { 
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) { 
					int temp = arr[j+1]; 
					arr[j+1] = arr[j];
					arr[j] = temp; 
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array (Bubble) is : ");
		for(int element : arr) {
			System.out.print(element);
		}
	}

}
