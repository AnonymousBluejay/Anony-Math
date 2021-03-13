package net.passerines.tests;

public class SpringRolls {

	public static void main(String[] args) {
		int input[] = new int[]{25, 50, 39, 42, 69, 49};
		
		System.out.println(startRecursivePain(input));
	}
	
	public static int startRecursivePain(int[] input) {
		int values[] = new int[input.length+1];
		values[0] = 0;
		for(int i=0; i<input.length; i++) {
			values[i+1] = input[i];
		}
		return getMaximum(values, 0);
	}
	
	public static int getMaximum(int[] values, int min) {
		if(values.length <= 1) {
			if(values[0] >= min) {
				return values[0];
			} else {
				return 0;
			}
		}
		
		int current;
		if(values[0] >= min) {
			current = values[0];
			min = current;
		} else {
			current = 0;
		}
		
		int max = 0;
		for(int i=1; i<values.length; i++) {
			int[] newValues = skip(values, i);
			int temp = getMaximum(newValues, min);
			if(temp > max) max = temp;
		}
		return current + max;
	}
	
	public static int[] skip(int[] values, int amt) {
		int[] newList = new int[values.length-amt];
		for(int i=0; i<newList.length; i++) {
			newList[i] = values[i+amt];
		}
		return newList;
	}
	
	public static int max(int[] values) {
		int max = 0;
		for(int i : values) {
			if(i > max) max = i;
		}
		return max;
	}
}
