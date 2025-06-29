package com.practise;

class Sum {

	public void display(int... a) {
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}

public class Theory_8_Class_Wrapper_Classes {

	public static void main(String[] args) {

		Sum s = new Sum();
		s.display(2);
		s.display(2, 4);
		s.display(4, 5, 6);

	}
}
