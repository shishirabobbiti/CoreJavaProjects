package com.Linkedin;

public class TwoDArrays {

	public static void main(String[] args) {
		int [][] a=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		//for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[0].length;j++) {
//				System.out.print(a[i][j] +" ");
//			}
//			System.out.println();
//		}
		for(int r[]:a) {
			for(int ele:r) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}

	}

}
