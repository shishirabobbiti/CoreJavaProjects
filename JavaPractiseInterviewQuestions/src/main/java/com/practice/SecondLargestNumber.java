 package com.practice;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] num = { 4, 3, 7, 3, 1, 6, 2 };
		int m1 = 0;
//		int m2=0;
//		for(int i=0;i<arr.length;i++) {
//			int num=arr[i];
//			if(num>m1 && num>m2){
//				if(m1>m2){
//					m2=m1;
//			}
//				m1=num;
//			}
//			else if(num>m2){
//				m2=num;
//			}
//			System.out.println("M1:"+m1);
//			System.out.println("M2:"+m2);
//		}
//		System.out.println("Second Largest::"+m2);
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {
					int temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
