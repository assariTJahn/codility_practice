package io.github.tjAhnAssari;

import java.util.Arrays;

public class Codility_question {

	public int arrayQuestion(int[] a) {
		int result = 0;
		//sorting
		Arrays.sort(a);


		//processing
		for (int i = 1; i < a.length; i++) {
			if(a[i-1]>0 && a[i]-a[i-1]>1) {
				return a[i-1] + 1;
			}
		}
		
		//return bigger than the biggest number in the array, if there is no occured number found. 
		result = a[a.length-1] + 1;
		return result<1?1:result;
		
		
	} 
	
	public static void main(String[] args) {
		Codility_question cq = new Codility_question();
		int[] arr = {-1,-3,-5};
//		int[] arr = {1,3,3,5,-1,4,5,6};
		int result = cq.arrayQuestion(arr);
		
		
		System.out.println(result);
		
	}


}


