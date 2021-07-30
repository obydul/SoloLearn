package com.obydul.array;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		/*
		for (int l = 0, h=text.length() - 1; l < h; l++, h--) {
			char temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
		}*/
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		
	}

}
