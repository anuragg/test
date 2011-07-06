package com.anurag.Testing;

public class SSorting {
	public static int[] arrayX = {23, 47, 81, 95,7, 14, 39, 55, 62, 74};
	public static int[] arrayY = {23, 47, 81, 95,7, 14, 39, 55, 62, 74};
	public static int[] arrayZ = {23, 47, 81, 95,7, 14, 39, 55, 62, 74};
	public static int[] arrayA = {23, 47, 81, 95,7, 14, 39, 55, 62, 74};
	public static int size = 10;
	public static void main(String arg[]){
		System.out.println("Initial");
//		for(int ii : arrayY){
			for(int asd =0;asd<arrayY.length;asd++){
			System.out.print(arrayY[asd]+" ");
		}
		System.out.println();
		SelectionSort();
		BubbleSort();
		InsertionSort();
		ShellSort();
	}
	/*
	 * swap is O(N2) and sort O(N2) = (N*N-1)/2
	 * 
	 */
	public static void BubbleSort(){
		for(int i=size-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(arrayX[j] > arrayX[j+1]){
					int k = arrayX[j];
					arrayX[j] = arrayX[j+1];
					arrayX[j+1] = k;
				}
			}
		}
		System.out.println("bubble-sort");
//		for(int ii : arrayX){
			for(int asd =0;asd<arrayX.length;asd++){
			System.out.print(arrayX[asd]+" ");
		}
	}
	/*
	 * swap is O(N) and sort O(N2)= (N*N-1)/2
	 * 
	 */
	public static void SelectionSort(){
		for(int i=0; i<size-1;i++){
			int min = i;
			for(int j=i;j<size-1;j++){
				if(arrayY[min] > arrayY[j]){
					min = j;
				}
			}
			int k = arrayY[min];
			arrayY[min] = arrayY[i];
			arrayY[i]=k;
		}
		System.out.println("selection-sort");
//		for(int ii : arrayY){
		for(int asd =0;asd<arrayY.length;asd++){
			System.out.print(arrayY[asd]+" ");
		}
		System.out.println();
	}
	/*
	 * 
	 * 
	 */
	public static void InsertionSort(){
		int tmp;
		for(int i=1;i<size;i++){
			tmp = arrayZ[i];
			for(int j=i;j>0&&arrayZ[j-1]>arrayZ[j];j--){
				arrayZ[j]=arrayZ[j-1];
				arrayZ[j-1]=tmp;
			}
		}
		System.out.println();
		System.out.println("insertion sort");
//		for(int ii : arrayZ){
			for(int asd =0;asd<arrayZ.length;asd++){
			System.out.print(arrayZ[asd]+" ");
		}
	}
	public static void ShellSort(){
		int tmp;
		for(int Increment = size/2;Increment>0;Increment/=2){
			for(int i=Increment;i<size;i++){
				tmp=arrayA[i];
				for(int j=i;j>=Increment&&arrayA[j-Increment]>arrayA[j];j-=Increment){
					arrayA[j]=arrayA[j-Increment];
					arrayA[j-Increment]=tmp;
				}
			}
		}
		System.out.println();
		System.out.println("shell sort");
//		for(int ii : arrayA){
			for(int asd =0;asd<arrayA.length;asd++){
			System.out.print(arrayA[asd]+" ");
		}
	}
}

