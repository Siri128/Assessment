package com.Oops;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
		if(s1.length()==s2.length()) {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1,arr2)) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
				
		}
		else {
			System.out.println("not matched");
		}
	}

}
