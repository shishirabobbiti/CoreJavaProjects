package com.Linkedin2;

public class Prime1toN {

	public static void main(String[] args) {
			int n=1000;
			for(int i=2;i<=n;i++) {
				int count=0;int num=0;
					for(num=i;num>=1;num--){
						
						if(i%num==0) {
							count++;
						}
					}
					if(count==2) {
						System.out.println(i + " Prime number");
					}
//					else {
//						System.out.println(i +" Not a prime number");
//					}
				}
			}
	}


